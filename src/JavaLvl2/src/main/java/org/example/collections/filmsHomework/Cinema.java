package org.example.collections.filmsHomework;

import org.example.collections.filmsHomework.enums.Genre;

import java.time.Month;
import java.util.*;

public class Cinema {
    private final LinkedHashMap<Integer, Set<Film>> map = new LinkedHashMap<>();

    public void addFilm(Film film){
        Set<Film> newFilms = new LinkedHashSet<>();
        int year = film.getYear();
        if (map.containsKey(year)) {
            Set<Film> films = map.get(year);
            films.add(film);
            map.put(year,films);
        }else {
            newFilms.add(film);
            map.put(year,newFilms);
        }
    }

    public Set<Film> getFilmsByYear(int year){
        return map.get(year);
    }

    public Set<Film> getFilmsByYearAndMonth(int year, Month month){
        Set<Film> resultFilms = new LinkedHashSet<>();
        Set<Film> films = map.get(year);
        for (Film film : films) {
            if (film.getMont() == month){
                resultFilms.add(film);
            }
        }
        return resultFilms;
    }
    public List<Film> getFilmsByGenre(Genre genre){
        ArrayList<Film> result = new ArrayList<>();
        for (Set<Film> value : map.values()) {
            for (Film film : value) {
                if (film.getGenre() == genre){
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getAllFilmsOrderByRate(){
        ArrayList<Film> films = new ArrayList<>();
        for (Set<Film> value : map.values()) {
            films.addAll(value);
        }
        Collections.sort(films);
        return films;
    }

    public LinkedHashMap<Integer, Set<Film>> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "map=" + map +
                '}';
    }
}
