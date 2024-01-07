package com.example.OierGagoAdt1EvaRecu2324.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OierGagoAdt1EvaRecu2324.model.Author;
import com.example.OierGagoAdt1EvaRecu2324.repository.AuthorRepository;

import exception.AuthorNotFoundException;
@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
    private AuthorRepository authorRepository;

	@Override
	public Author getAuthorByid(long authorId) throws AuthorNotFoundException{
		Author author = authorRepository.findById(authorId);
		if (author == null) {
			return null;
		}
		return new Author(
				author.getId(),
				author.getName()
		);
	}

	@Override
	public List<Author> getAllAuthors() {
		List<Author> response = new ArrayList<Author>();
		List<Author> authorList = authorRepository.findAll();
		for (Author author : authorList) {
			response.add(new Author(
					author.getId(),
					author.getName()
			));
		}
		return response;
	}

	
	
}
