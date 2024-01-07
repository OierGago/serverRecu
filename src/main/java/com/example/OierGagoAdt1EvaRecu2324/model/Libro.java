package com.example.OierGagoAdt1EvaRecu2324.model;

import java.time.LocalDate;

public class Libro {
	private Long id;
	private String isbn;
	private String title;
	private Long authorId;
	private String editorial;

	private String category;
	private int pages;
	private double price;
	private int score;
	private LocalDate releaseDate;
	private String lang;

	public Libro(Long id, String isbn, String title, Long authorId, String editorial, String category, int pages,
			double price, int score, LocalDate releaseDate, String lang) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.authorId = authorId;
		this.editorial = editorial;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.score = score;
		this.releaseDate = releaseDate;
		this.lang = lang;
	}
	public Libro( String isbn, String title, Long authorId, String editorial, String category, int pages,
			double price, int score, LocalDate releaseDate, String lang) {
		super();
		
		this.isbn = isbn;
		this.title = title;
		this.authorId = authorId;
		this.editorial = editorial;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.score = score;
		this.releaseDate = releaseDate;
		this.lang = lang;
	}
	public Libro() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
