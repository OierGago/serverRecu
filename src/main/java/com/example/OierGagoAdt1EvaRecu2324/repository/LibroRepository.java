package com.example.OierGagoAdt1EvaRecu2324.repository;

import java.util.List;

import com.example.OierGagoAdt1EvaRecu2324.model.Libro;

public interface LibroRepository {
	List<Libro> findAll();
	Integer deleteById(long id);
	Integer create(Libro libro);
	List<Libro> findAllByAuthorId(long authorId);
}
