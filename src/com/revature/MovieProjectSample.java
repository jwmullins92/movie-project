package com.revature;

public class MovieProjectSample {
    public static void main(String[] args) {
        StarWars starWars = new StarWars("A New Hope", 1977, 9.5, "Changed the industry", "Han Solo");
        FreeSolo freeSolo = new FreeSolo("Free Solo", 2018, 9.1, "Don't try this", "When Alex conquered the boulder problem", true);

        // Testing out StringBuilder chaining
        StringBuilder starWarsInfo = new StringBuilder();
        starWarsInfo.append("Title: ").append(starWars.getTitle()).append("\n")
                .append("Year Released: ").append(starWars.getYearOfRelease()).append("\n")
                .append("Three Word Review: ").append(starWars.getThreeWordReview());

        // Prints the starWarsInfoString
        System.out.println(starWarsInfo);

        // Gets a random quote from three options from the starWars object
        starWars.quoteMovie();

        // Adds line break between the two movies
        System.out.println("\n");

        // Prints selected information about Free Solo
        System.out.println("Title: " + freeSolo.getTitle() + "\nMy Score: " + freeSolo.getScore() + "\nThree Word Review: " + freeSolo.getThreeWordReview() + "\nFavorite Moment: " + freeSolo.getFavoriteMoment());
    }
}
