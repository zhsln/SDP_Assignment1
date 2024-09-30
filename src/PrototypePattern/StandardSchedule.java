package PrototypePattern;

import Factory.Movie;

public class StandardSchedule implements MovieSchedule{
    private Movie movie;
    private String time;

    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie: " + (movie != null ? movie.getTitle() : "No movie") + ", Time: " + time;
    }
}
