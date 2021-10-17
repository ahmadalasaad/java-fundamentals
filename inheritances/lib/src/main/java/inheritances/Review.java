package inheritances;

public class Review {
   private String body;
   private String author;
   private double numberOfStars=0;

    public Review(String body, String author, double numberOfStars) {
        this.body = body;
        this.author = author;
        if(numberOfStars<=5&&numberOfStars>=0){
            this.numberOfStars = numberOfStars;
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return author;
    }

    public void setAuther(String auther) {
        this.author = auther;
    }

    public double getNumberOfStars() {
        return numberOfStars;

    }

    public void setNumberOfStars(double numberOfStars) {
        if(numberOfStars<=5&&numberOfStars>=0){
            this.numberOfStars = numberOfStars;
        }    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
