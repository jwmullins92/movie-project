package com.revature;

public class FreeSolo extends Movie{
    private String threeWordReview;
    private String favoriteMoment;
    private boolean gotSweatyPalms;

    public FreeSolo(String title, int yearOfRelease, double myScore, String threeWordReview, String favoriteMoment, boolean gotSweatyPalms) {
        super(title, yearOfRelease, myScore);
        this.threeWordReview = threeWordReview;
        this.favoriteMoment = favoriteMoment;
        this.gotSweatyPalms = gotSweatyPalms;
    }

    public String getThreeWordReview() {
        return threeWordReview;
    }

    public void setThreeWordReview(String threeWordReview) {
        this.threeWordReview = threeWordReview;
    }

    public String getFavoriteMoment() {
        return favoriteMoment;
    }

    public void setFavoriteMoment(String favoriteMoment) {
        this.favoriteMoment = favoriteMoment;
    }

    public boolean getGotSweatyPalms() {
        return gotSweatyPalms;
    }
}
