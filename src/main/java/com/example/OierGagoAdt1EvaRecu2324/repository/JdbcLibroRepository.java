package com.example.OierGagoAdt1EvaRecu2324.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.OierGagoAdt1EvaRecu2324.model.Libro;

@Repository
public class JdbcLibroRepository implements LibroRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Libro> findAll() {
		return jdbcTemplate.query("SELECT * FROM books", BeanPropertyRowMapper.newInstance(Libro.class));
	}

	@Override
	public Integer deleteById(long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM books WHERE (id = ?);", id);

	}
	

	@Override
	public Integer create(Libro libro) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO books (isbn, title, authorId, editorial, category, pages, price,score, releaseDate, lang) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?);",
				new Object[] { 
					libro.getIsbn(),
					libro.getTitle(),
					libro.getAuthorId(),
					libro.getEditorial(),
					libro.getCategory(),
					libro.getPages(),
					libro.getPrice(),
					libro.getScore(),
					libro.getReleaseDate(),
					libro.getLang()
				}	
			);
	}
	@Override
	public List<Libro> findAllByAuthorId(long authorId){
		System.out.println("Repository");
		return jdbcTemplate.query("SELECT * FROM books where authorId = ?;",BeanPropertyRowMapper.newInstance(Libro.class), authorId);
	}

}
