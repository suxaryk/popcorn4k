package com.dataArt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dataArt.dao.Film.FilmDao;
import com.dataArt.model.Film;

@Service("FilmService")
@Transactional
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDao dao;

	public Film findById(int id) {
		return dao.findById(id);
	}

	public void saveFilm(Film film) {
		dao.saveFilm(film);
	}

	public void updateFilm(Film film) {
		Film entity = dao.findById(film.getId());
		if (entity != null) {
			entity.setTitle(film.getTitle());
			entity.setDescription(film.getDescription());
			entity.setPoster(film.getPoster());
			entity.setLinkTrailer(film.getLinkTrailer());
		}
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public List<Film> findAllFilms() {
		return dao.findAllFilms();
	}

}
