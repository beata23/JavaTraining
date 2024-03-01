package org.example;

public class Actor {
    //wszystkie pola zawsze private, a metody public
    private String firstName;
    private String lastName;
    private int rating; //1-100
    private boolean isOscarPrized; // true or false

    public Actor(String firstName, String lastName, int rating, boolean isOscarPrized){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPrized = isOscarPrized;
    }

    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(){

    }

    public int calculateSalary(int countFilms, int bonus){
        return countFilms * bonus;
    }

    //alt + intert - żeby dodać szybko gettery i settery
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPrized() {
        return isOscarPrized;
    }

    public void setOscarPrized(boolean oscarPrized) {
        isOscarPrized = oscarPrized;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rating=" + rating +
                ", isOscarPrized=" + isOscarPrized +
                '}';
    }
}
