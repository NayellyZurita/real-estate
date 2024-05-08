/**
 * File: Lab6i.java
 * Description: Create JUnit test cases for constructors, get methods, and set methods.
 * Lessons Learned:
 * Instructor's Name: Jeff Light
 *
 * @author     Nayelly Zurita
 * @since       02/27/2024
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void getStreetAddress() {
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        String StreetAddress = two.getStreetAddress();
        assertEquals(StreetAddress, "251 E Broadway");
    }

    @Test
    void setStreetAddress() {
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        two.setStreetAddress("34 Elm");
        assertEquals(two.getStreetAddress(), "34 Elm");
    }

    @Test
    void getZip() {
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        int Zip = two.getZip();
        assertEquals(Zip, 84111);
    }

    @Test
    void setZip() {
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        two.setZip(99999);
        assertEquals(two.getZip(), 99999);
    }
    @Test
    void getListPrice (){
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        double ListPrice = two.getListPrice();
        assertEquals(ListPrice, 23345.4);
    }
    @Test
    void setListPrice (){
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        two.setListPrice(444444.4);
        assertEquals(two.getListPrice(),444444.4 );
    }
    @Test
    void getAppraisalPrice (){
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        double AppraisalPrice = two.getAppraisalPrice();
        assertEquals(AppraisalPrice, 0.0);
    }
    @Test
    void setAppraisalPrice (){
        Property two = new House("251 E Broadway", 84111, 3, 2.5, 2000, 0.5);
        two.setAppraisalPrice(0.0);
        assertEquals(two.getAppraisalPrice(), 0.0);
    }



}