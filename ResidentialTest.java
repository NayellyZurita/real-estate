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

class ResidentialTest {

    @Test
    void getBedCount() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0,45555.5 );
        int bedCount = two.getBedCount();
        assertEquals(bedCount, 4);
    }

    @Test
    void setBedCount() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0,45555.5 );
        two.setBedCount(3);
        assertEquals(two.getBedCount(), 3);
    }

    @Test
    void getBathCount() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0, 45555.5);
        double bathCount = two.getBathCount();
        assertEquals(bathCount, 2.5);
    }

    @Test
    void setBathCount() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0, 45555.5);
        two.setBathCount(1.5);
        assertEquals(two.getBathCount(),1.5);

    }

    @Test
    void getSqFootage() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0, 45555.5);
        double sqFootage = two.getSqFootage();
        assertEquals(sqFootage,2422.0);
    }

    @Test
    void setSqFootage() {
        Residential two = new House("34 Elm", 99999,  844, 2.5, 2422.0, 45555.5);
        two.setSqFootage(0.0);
        assertEquals(two.getSqFootage(), 0.0);
    }
}