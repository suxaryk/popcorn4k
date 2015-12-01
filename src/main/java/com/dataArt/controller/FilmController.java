package com.dataArt.controller;

import com.dataArt.domain.Film;
import com.dataArt.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class FilmController {


    @Autowired
    FilmService filmService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = { "/films" }, method = RequestMethod.GET)
    public String listFilms(ModelMap model) {
        model.addAttribute("films", filmService.findAllFilms());
        return "allfilms";
    }

    @RequestMapping(value = { "/films/addFilm" }, method = RequestMethod.GET)
    public String addFilm(ModelMap model) {
        model.addAttribute("film", new Film());
        model.addAttribute("edit", false);
        return "registration";
    }

    @RequestMapping(value = { "/films/addFilm" }, method = RequestMethod.POST)
    public String saveFilm(@Valid @ModelAttribute Film film, BindingResult result,
                           ModelMap model) {
        if (result.hasErrors()) {
            return "registration";
        }
        filmService.saveFilm(film);

        model.addAttribute("success", "Film " + film.getTitle()
                + " registered successfully");
        return "success";
    }

    @RequestMapping(value = { "/films/edit-{id}-film" }, method = RequestMethod.GET)
    public String editFilm(@PathVariable int id, ModelMap model) {
        Film film = filmService.findById(id);
        model.addAttribute("film", film);
        model.addAttribute("edit", true);
        return "registration";
    }

    @RequestMapping(value = { "/films/edit-{id}-film" }, method = RequestMethod.POST)
    public String updateFilm(@Valid @ModelAttribute Film film, BindingResult result,
                             ModelMap model, @PathVariable int id) {

        if (result.hasErrors()) {
            return "registration";
        }
        filmService.updateFilm(film);

        model.addAttribute("success", "Film " + film.getTitle()
                + " updated successfully");
        return "success";
    }

    @RequestMapping(value = { "/films/delete-{id}-film" }, method = RequestMethod.GET)
    public String deleteFilm(@PathVariable int id) {
        filmService.deleteById(id);
        return "redirect:/films";
    }

}
