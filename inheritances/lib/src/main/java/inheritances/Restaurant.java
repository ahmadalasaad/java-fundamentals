package inheritances;
import java.util.*;
public class Restaurant implements Reviewable{
    private String name;
    private double numberOfStars=0;
    private String priceCategory;
    private LinkedList<Review> reviews=new LinkedList<>();
    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory=priceCategory;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public void addReview(Review review) {
            this.reviews.add(review);
            updateNumberOfStars();
    }

    public LinkedList<Review> getReviews() {
        return reviews;
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
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
