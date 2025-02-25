package ru.netology.domain;

public class FilmsInPlaybill {

    private String filmName;
    private int limit;

    public FilmsInPlaybill(String filmName) {
        this.filmName = filmName;
    }

    public FilmsInPlaybill(int limit) {
        this.limit = limit;
    }

    public String getFilmName() {
        return filmName;
    }
}
