/**
 * File: Lab9i.java
 *   Description:mplements the Listable interface
 *   Lessons Learned: Create an interface and class that implements the interface-
 *   to store the list of residential properties that a Real Estate Office has listed for sale.
 *  Instructor's Name: Jeff Light
 *   @author     Nayelly Zurita
 *   @since       3/20/2024
 **/
package RealEstate;

import java.util.*;

public class Listings implements Listable{
    private HashMap<String, Residential> listings;

    //Constructors

    public Listings(){
        this.listings = new HashMap<>();
    }

    //Implementing Listable interface methods
    @Override
    public HashMap<String, Residential> getListings(){
        return this.listings;
    }
    @Override
    public Residential getListing(String address){
        return this.listings.get(address);
    }
    @Override
    public Set<String> getStreetAddress(){
        return this.listings.keySet();
    }
    @Override
    public Collection<Residential> getResidences(){
        return this.listings.values();
    }
    @Override
    public int getListingCount (){
        return this.listings.size();
    }
    @Override
    public void addListing(String address, Residential residential){
        this.listings.put(address, residential);
    }



}
