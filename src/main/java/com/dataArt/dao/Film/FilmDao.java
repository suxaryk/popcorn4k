package com.dataArt.dao.Film;

import java.util.List;

import com.dataArt.model.Film;

public interface FilmDao {

	Film findById(int id);

	void saveFilm(Film film);

	void deleteById(int id);

	List<Film> findAllFilms();

}