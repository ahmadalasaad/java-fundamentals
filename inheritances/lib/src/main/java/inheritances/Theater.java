package inheritances;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater implements Reviewable {
    private String name;
    private ArrayList<String> movieList=new ArrayList<String>();
    private LinkedList<Review> reviews=new LinkedList<>();
    private double numberOfStars=0;

    public Theater(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        this.movieList = movieList;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(LinkedList<Review> reviews) {
        this.reviews = reviews;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void addMovie(String movie){
        movieList.add(movie);
    }
    public void removeMovie(String movie){
        movieList.remove(movie);
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        updateNumberOfStars();
    }

    @Override
    public void updateNumberOfStars() {
        double avg=0;
        for (int i=0;i<this.getReviews().size();i++){
            avg+=this.getReviews().get(i).getNumberOfStars();
        }
        avg=avg/getReviews().size();
        this.numberOfStars= avg;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movieList=" + movieList +
                ", numberOfStars=" + numberOfStars +
                ", reviews=" + reviews +
                '}';
    }
}
