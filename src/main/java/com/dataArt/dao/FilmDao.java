package com.dataArt.dao;

import java.util.List;

import com.dataArt.domain.Film;

public interface FilmDao {

	Film findById(int id);

	void saveFilm(Film film);

	void deleteById(int id);

	List<Film> findAllFilms();

}
