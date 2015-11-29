package com.dataArt.service;

import java.util.List;

import com.dataArt.domain.Film;

public interface FilmService {
	
	Film findById(int id);

	void saveFilm(Film film);
	
	void updateFilm(Film film);

	void deleteById(int id);

	List<Film> findAllFilms();

}
