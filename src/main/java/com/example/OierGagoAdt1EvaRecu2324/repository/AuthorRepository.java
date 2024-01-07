package com.example.OierGagoAdt1EvaRecu2324.repository;

import java.util.List;

import com.example.OierGagoAdt1EvaRecu2324.model.Author;

import exception.AuthorNotFoundException;

public interface AuthorRepository {
	Author findById(long id) throws AuthorNotFoundException;
	List<Author> findAll();
}
