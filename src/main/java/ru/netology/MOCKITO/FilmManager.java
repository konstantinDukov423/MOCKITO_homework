package ru.netology.MOCKITO;

public class FilmManager {
    private String[] films = new String[0];
    private int limitLastFilm;


    public FilmManager() {
        limitLastFilm = 10;
    }

    public FilmManager(int limit) {
        limitLastFilm = limit;
    }

    public void addFilm(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int tempLength;
        if (films.length < limitLastFilm) {
            tempLength = films.length;
        } else {
            tempLength = limitLastFilm;

        }
        String[] temp = new String[tempLength];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = films[films.length - i - 1];
        }
        return temp;
    }
}