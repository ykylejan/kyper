package dellatan.mcm.edu.kyper;

public class Recommendation {
    private String recommendationType;
    private int recommendationID;
    private String recommendationName;
    private String recommendationLocation;
    private int recommendationContact;
    private double recommendationPrice;

    public Recommendation(String type, int id, String name, String location, int contact, double price){
        recommendationType = type;
        recommendationID = id;
        recommendationName = name;
        recommendationLocation = location;
        recommendationContact = contact;
        recommendationPrice = price;
    }

    public String getRecommendationType(){
        return recommendationType;
    }
    public void setRecommendationType(String recommendationType){
        this.recommendationType = recommendationType;
    }


    public int getRecommendationID() {
        return recommendationID;
    }
    public void setRecommendationID(int recommendationID) {
        this.recommendationID = recommendationID;
    }


    public String getRecommendationName() {
        return recommendationName;
    }
    public void setRecommendationName(String recommendationName){
        this.recommendationName = recommendationName;
    }


    public String getRecommendationLocation() {
        return recommendationLocation;
    }
    public void setRecommendationLocation(String recommendationLocation) {
        this.recommendationLocation = recommendationLocation;
    }


    public int getRecommendationContact() {
        return recommendationContact;
    }
    public void setRecommendationContact(int recommendationContact){
        this.recommendationContact = recommendationContact;
    }


    public double getRecommendationPrice() {
        return recommendationPrice;
    }
    public void setRecommendationPrice(double recommendationPrice) {
        this.recommendationPrice = recommendationPrice;
    }

}
