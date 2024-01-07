package com.example.OierGagoAdt1EvaRecu2324.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OierGagoAdt1EvaRecu2324.model.Libro;
import com.example.OierGagoAdt1EvaRecu2324.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	LibroRepository libroRepository;

	@Override
	public List<Libro> getAllBooks() {
		// TODO Auto-generated method stub

		List<Libro> response = new ArrayList<Libro>();
		List<Libro> libroList = libroRepository.findAll();
		for (Libro libro : libroList) {
			response.add(new Libro(
					libro.getId(),
					libro.getIsbn(),
					libro.getTitle(), 
					libro.getAuthorId(),
					libro.getEditorial(),
					libro.getCategory(),
					libro.getPages(),
					libro.getPrice(),
					libro.getScore(),
					libro.getReleaseDate(),
					libro.getLang()));
		}

		return response;
	}

	@Override
	public int createBook(Libro libro) {
		// TODO Auto-generated method stub
		return libroRepository.create(libro);
	}

	@Override
	public int deleteBook(long id) {
		// TODO Auto-generated method stub
		return libroRepository.deleteById(id);
	}
	@Override
	public List<Libro> getAllBooksByAuthorId(long authorId) {
		// TODO Auto-generated method stub

		List<Libro> response = new ArrayList<Libro>();
		List<Libro> libroList = libroRepository.findAllByAuthorId(authorId);
		System.out.println("servicio");
		for (Libro libro : libroList) {
			System.out.println(libro.getIsbn());
			response.add(new Libro(
					libro.getId(),
					libro.getIsbn(),
					libro.getTitle(), 
					libro.getAuthorId(),
					libro.getEditorial(),
					libro.getCategory(),
					libro.getPages(),
					libro.getPrice(),
					libro.getScore(),
					libro.getReleaseDate(),
					libro.getLang()));
		}

		return response;
	}


}
