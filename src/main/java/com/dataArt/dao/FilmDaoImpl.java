package com.dataArt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dataArt.domain.Film;

@Repository
public class FilmDaoImpl extends AbstractDao<Integer, Film> implements FilmDao {

	
	public Film findById(int id) {
		return getByKey(id);
	}
	
	public void saveFilm(Film film) {
		persist(film);
	}


	public void deleteById(int id) {
		getSession().createSQLQuery("DELETE FROM film WHERE id =" + id)
		.addSynchronizedEntityClass(Film.class)
		.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Film> findAllFilms() {
//		List<Film> list = getSession().createCriteria(Film.class).list();

		return (List<Film>) getSession().createCriteria(Film.class).list();
	}

}
