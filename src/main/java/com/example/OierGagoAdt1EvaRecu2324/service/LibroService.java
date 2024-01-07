package com.example.OierGagoAdt1EvaRecu2324.service;

import java.util.List;

import com.example.OierGagoAdt1EvaRecu2324.model.Libro;

public interface LibroService {
	
	List<Libro> getAllBooks();
	int createBook(Libro libro);
	int deleteBook(long id);
	List<Libro> getAllBooksByAuthorId(long authorId);
}
