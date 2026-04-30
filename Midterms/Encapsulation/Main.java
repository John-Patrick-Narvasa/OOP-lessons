package Encapsulation;


class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rentalPrice;
    private int availableCopies;

    public Movie(String title, String director, int releaseYear, double rentalPrice, int availableCopies) {
        setTitle(title);
        setDirector(director);
        setReleaseYear(releaseYear);
        setRentalPrice(rentalPrice);
        setAvailableCopies(availableCopies);
    }
    // getters
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }


    // setters
    // cannot be null or empty
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
        else {
            System.out.println("Error: title cannot be null or empty!");
        }
    }
    public void setDirector(String director) {
        if (director != null && !director.isEmpty()) {
            this.director = director;
        }
        else {
            System.out.println("Error: director cannot be null or empty!");
        }
    }

    //must be between 1900 and 2024
    public void setReleaseYear(int releaseYear) {
        if (releaseYear >= 1900 && releaseYear <= 2024) {
            this.releaseYear = releaseYear;
        }
        else {
            System.out.println("Error: Must be between 1900 and 2024!");
        }
    }
    // must be between 1.0 and 10.0
    public void setRentalPrice(double rentalPrice) {
        if (rentalPrice >= 1.0 && rentalPrice <= 10.0) {
            this.rentalPrice = rentalPrice;
        }
        else {
            System.out.println("Error: Must be between $1.0 and $10.0!");
        }
    }

    public void setAvailableCopies(int availableCopies) {
        if(availableCopies > 0 ) {
            this.availableCopies = availableCopies;
        }
        else {
             System.out.println("Error: Must be greater than 0!");
        }
    }


    // additional methods
    public void rentMovie() {
        if (availableCopies > 1) {
            availableCopies--;
            System.out.println("Movie successfully rented!");
            System.out.println("Available copies left: " + availableCopies);   
        }
        else {
            System.out.println("No more available copies of the: " + title);
        }
    }
    public void returnMovie() {
        if (availableCopies > 1) {
            availableCopies++;
            System.out.println("Movie successfully returned!");
            System.out.println("Current available copies: " + availableCopies)    ;
        }
        else {
            System.out.println("Still, No more available copies of the: " + title);
        }
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("ReleaseYear: " + releaseYear);
        System.out.println("Rental Price: $" + rentalPrice);
        System.out.println("Available Copies: " + availableCopies);
    }

}

public class Main {
    public static void main (String[] args) {
        Movie movie1 = new Movie("The Matrix", "Lana Wachowski and Lilly Wachowski", 1999, 5.00, 10 );
        Movie movie2 = new Movie("Inception", "Christoper Nolan", 2010, 7.00, 0);

        movie1.displayInfo();
        movie2.displayInfo();

        movie1.rentMovie();
        movie1.returnMovie();
 

        System.out.println("\nRunning edge cases");
        movie1.setRentalPrice(-5.0);
        movie2.rentMovie();
        movie2.returnMovie();
     
        System.out.println("\nDisplaying changes...");
        


    }
} 
