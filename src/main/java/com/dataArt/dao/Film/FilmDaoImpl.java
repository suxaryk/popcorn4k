package com.dataArt.dao.Film;

import java.util.List;

import com.dataArt.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import com.dataArt.model.Film;

@Repository
public class FilmDaoImpl extends AbstractDao<Integer, Film> implements FilmDao {

	
	public Film findById(int id) {
		return getByKey(id);
	}
	
	public void saveFilm(Film film) {
		persist(film);
	}


	public void deleteById(int id) {
		getSession().createSQLQuery("DELETE FROM film WHERE film_id =" + id)
		.addSynchronizedEntityClass(Film.class)
		.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Film> findAllFilms() {

		return (List<Film>) getSession().createCriteria(Film.class).list();
	}

}