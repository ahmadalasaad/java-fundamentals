package inheritances;

import java.util.LinkedList;

public class Shops implements Reviewable{
    private String name;
    private String description;
    private String priceCategory;
    private LinkedList<Review> reviews=new LinkedList<>();
    private double numberOfStars=0;
    public Shops(String name, String description, String priceCategory)  {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
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
        return "Shops{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", reviews=" + reviews +

                '}';
    }
}
