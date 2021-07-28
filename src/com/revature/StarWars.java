package com.revature;

public class StarWars extends Movie{
    private String threeWordReview;
    private String favoriteCharacter;

    public StarWars(String title, int yearOfRelease, double myScore, String threeWordReview, String favoriteCharacter) {
        super(title, yearOfRelease, myScore);
        this.threeWordReview = threeWordReview;
        this.favoriteCharacter = favoriteCharacter;
    }

    public String getThreeWordReview() {
        return threeWordReview;
    }

    public void setThreeWordReview(String threeWordReview) {
        this.threeWordReview = threeWordReview;
    }

    public String getFavoriteCharacter() {
        return favoriteCharacter;
    }

    public void setFavoriteCharacter(String favoriteCharacter) {
        this.favoriteCharacter = favoriteCharacter;
    }

    public void quoteMovie() {
        int quoteNumber = (int) Math.floor(Math.random() * 3) + 1;
        String quote = "";
        switch(quoteNumber) {
            case 1:
                quote = "May the Force be with you";
                break;
            case 2:
                quote = "I've got a bad feeling about this";
                break;
            case 3:
                quote = "These aren't the droids you're looking for";
                break;
            default:
                System.out.println("I don't understand that");
        }
        System.out.println(quote);;
    }
}

