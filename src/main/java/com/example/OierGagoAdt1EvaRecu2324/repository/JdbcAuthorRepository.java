package com.example.OierGagoAdt1EvaRecu2324.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.OierGagoAdt1EvaRecu2324.model.Author;

import exception.AuthorNotFoundException;

@Repository
public class JdbcAuthorRepository implements AuthorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Author findById(long id) throws AuthorNotFoundException {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM authors where id=?;",
					BeanPropertyRowMapper.newInstance(Author.class), id);
		} catch (EmptyResultDataAccessException e) {
			throw new AuthorNotFoundException("Author Not Found in Repository");
		}
	}

	@Override
	public List<Author> findAll() {
		return jdbcTemplate.query("SELECT * FROM authors", BeanPropertyRowMapper.newInstance(Author.class));
	}

}
