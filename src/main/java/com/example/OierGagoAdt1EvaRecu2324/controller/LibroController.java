package com.example.OierGagoAdt1EvaRecu2324.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OierGagoAdt1EvaRecu2324.model.Libro;
import com.example.OierGagoAdt1EvaRecu2324.service.LibroService;

@RestController
@RequestMapping("api")
public class LibroController {

	@Autowired
	LibroService libroService;

	@GetMapping("/books")
	public ResponseEntity<List<Libro>> getLibros() {
		return new ResponseEntity<List<Libro>>(libroService.getAllBooks(), HttpStatus.OK);
	}

	@PostMapping("/books")
	public ResponseEntity<Integer> createBook(@RequestBody Libro libro) {
		Libro librotocreate = new Libro(libro.getIsbn(), libro.getTitle(), libro.getAuthorId(), libro.getEditorial(),
				libro.getCategory(), libro.getPages(), libro.getPrice(), libro.getScore(), libro.getReleaseDate(),
				libro.getLang()

		);
		return new ResponseEntity<Integer>(libroService.createBook(librotocreate), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Integer> deleteLibroById(@PathVariable("id") long id) {
		return new ResponseEntity<Integer>(libroService.deleteBook(id), HttpStatus.OK);}
	
	
	@GetMapping("/books/author/{authorId}")
	public ResponseEntity<List<Libro>> getLibrosByAuthor(@PathVariable("authorId") long authorId) {
		System.out.println("controlador");
		return new ResponseEntity<List<Libro>>(libroService.getAllBooksByAuthorId(authorId), HttpStatus.OK);
	}
}
