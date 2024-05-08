package RealEstate;

import java.util.HashMap;
import java.util.Set;
public interface Biddable {
     //Returns a HashMap containing a list of bidder names (key) and their associated bid (value).
    HashMap<String, Double> getBids();

    //Returns the Double value for the associated String key in a HashMap.
    Double getBid(String bidderName);

    //Returns a Set of keys from a HashMap<String, Double>.
    Set<String> getBidders();

    //Returns the number of bids in the HashMap.
    int getBidCount();

    // Updates the value for the key or adds a new key/value pair in a HashMap.
    void newBid(String bidderName, Double bidValue);
}
