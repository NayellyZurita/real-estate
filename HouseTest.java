/**
 * File: Lab4i.java
 * Description: Create JUnit test cases for constructors, get methods, and set methods.
 * Lessons Learned: test
 * Instructor's Name: Jeff Light
 *
 * @author     Nayelly Zurita
 * @since       02/01/2024
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getYardAcres() {
        House two = new House("34 Elm", 99999,3,2, 2834.2, 2);
        double YardAcres = two.getYardAcres();
        assertEquals(YardAcres, 4300);
    }

    @Test
    void setYardAcres() {
        House two = new House("34 Elm", 99999, 3, 2, 2834.2, 2);
        two.setYardAcres(4302);
        assertEquals(two.getYardAcres(), 4302);
    }
    @Test
    void calculateAppraisalPrice(){
        House two = new House("34 Elm", 99999, 3, 2, 2834.2, 2);
        double Price = two.calculateAppraisalPrice();
        assertEquals(Price, 1238917.4);
    }
}