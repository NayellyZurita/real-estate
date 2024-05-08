/**
 * File: Lab4i.java
 * Description: Create JUnit test cases for constructors, get methods, and set methods.
 * Lessons Learned:
 * Instructor's Name: Jeff Light
 *
 * @author     Nayelly Zurita
 * @since       02/01/2024
 */
package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondoTest {

    @Test
    void getFloorLvl() {
        Condo two = new Condo("34 Elm" , 99999, 3,1.5, 2834.2, 2 );
        int FloorLvl = two.getFloorLvl();
        assertEquals(FloorLvl,2);
    }

    @Test
    void setFloorLvl() {
        Condo two = new Condo("34 Elm" , 99999, 3,1.5, 2834.2, 2 );
        two.setFloorLvl(3);
        assertEquals(two.getFloorLvl(), 3);
    }
    @Test
    void calculateAppraisalPrice(){
        Condo two = new Condo("34 Elm" , 99999, 3,1.5, 2834.2, 2 );
        double Price = two.calculateAppraisalPrice();
        assertEquals(Price, 298409.6);


    }
}