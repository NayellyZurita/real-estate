/**
 * File: Lab4i.java
 * Description: Build Java superclasses
 * Build Java subclasses
 * Overload methods with multiple signatures
 * Build a project with 3 levels in the Inheritance Hierarchy
 * Lessons Learned:
 * Instructor's Name: Jeff Light
 *
 * @author     Nayelly Zurita
 * @since       02/01/2024
 */
package RealEstate;

import java.util.HashMap;
import java.util.Set;

abstract class Residential extends Property implements Biddable{

    //Attributes
    private int bedCount;  //Number of bedrooms
    private double bathCount; // Number of bathrooms
    private double sqFootage; // Square footage of the property
    private HashMap<String, Double> bids;  // HashMap to store bids

    //Constructions
    Residential(){
        super();
        bedCount = 0;
        bathCount = 0;
        sqFootage = 0;
        bids = new HashMap<>();
    }

    Residential(String Addr, int zip,int bedCount, double bathCount, double sqFootage){
        super(Addr, zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
        bids = new HashMap<>();
    }
    // Getters and setters
    public int getBedCount (){
        return  bedCount;
    }
    public void setBedCount (int bedCount){
        this.bedCount = bedCount;
    }
    public double getBathCount(){
        return bathCount;
    }
    public void setBathCount(double bathCount){
        this.bathCount = bathCount;
    }
    public double getSqFootage(){
        return sqFootage;
    }
    public void setSqFootage(double sqFootage){
        this.sqFootage = sqFootage;
    }

    // Biddable interface methods implementation
    @Override
    public HashMap<String, Double> getBids() {
        return bids;
    }
    @Override
    public Double getBid(String bidderName){
        return bids.get(bidderName);
    }
    @Override
    public Set<String> getBidders() {
        return bids.keySet();
    }
    @Override
    public int getBidCount() {
        return bids.size();
    }
    @Override
    public void newBid(String bidderName, Double bidValue) {
        bids.put(bidderName, bidValue);
    }

    public abstract double calculateAppraisalPrice();


}
