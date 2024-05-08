/**
 * File: Lab9i.java
 *   Description:Create an interface
 *   Lessons Learned: Create an interface and class that implements the interface-
 *   to store the list of residential properties that a Real Estate Office has listed for sale.
 *  Instructor's Name: Jeff Light
 *   @author     Nayelly Zurita
 *   @since       3/20/2024
 **/
package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {
    HashMap<String, Residential> getListings();
    Residential getListing(String address);
    Set<String> getStreetAddress();
    Collection<Residential> getResidences();
    int getListingCount();
    void addListing(String address, Residential residential);
}
