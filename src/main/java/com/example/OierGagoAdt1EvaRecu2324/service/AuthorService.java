package com.example.OierGagoAdt1EvaRecu2324.service;

import java.util.List;

import com.example.OierGagoAdt1EvaRecu2324.model.Author;

import exception.AuthorNotFoundException;

public interface AuthorService {
	
	Author getAuthorByid(long authorId) throws AuthorNotFoundException;
	List<Author> getAllAuthors();
} 
