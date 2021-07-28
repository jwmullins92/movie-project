package com.revature;

public class Movie {
    private String title;
    private int yearOfRelease;
    private double myScore;

    public Movie(String title, int yearOfRelease, double myScore) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.myScore = myScore;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getMyScore() {
        return myScore;
    }

    public void setMyScore(double myScore) {
        this.myScore = myScore;
    }
}