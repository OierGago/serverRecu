package com.example.OierGagoAdt1EvaRecu2324.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.OierGagoAdt1EvaRecu2324.model.Author;
import com.example.OierGagoAdt1EvaRecu2324.service.AuthorService;

import exception.AuthorNotFoundException;

@RestController
@RequestMapping("api")
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	
	@GetMapping("/authors")
	public ResponseEntity<List<Author>> getAuthor() {
		return new ResponseEntity<List<Author>>(authorService.getAllAuthors(), HttpStatus.OK);
	}
	@GetMapping("authors/{authorId}")
    public ResponseEntity<Author> getAutorById(@PathVariable Long authorId) {
    	Author response;
		try {
			response = authorService.getAuthorByid(authorId);
			return new ResponseEntity<Author>(response, HttpStatus.OK);
		} catch (AuthorNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, e.getMessage(), e);
		}
    }
}
