/**
 * File: Lab9i.java
 * Description: Build Java superclasses
 * Build Java subclasses
 * Overload methods with multiple signatures
 * Build a project with 3 levels in the Inheritance Hierarchy
 * Lessons Learned:
 * Instructor's Name: Jeff Light
 *
 * @author     Nayelly Zurita
 * @since       3/20/2024
 */
package RealEstate;

public class Condo extends Residential{

    //Attributes

    private int floorLvl;

    //Constructions

    Condo(){
        super();
        floorLvl = 0;
    }
    Condo(String Addr, int zip, int bed, double bath, double sqf, int floorLvl){
        super (Addr, zip, bed, bath, sqf);
       this.floorLvl = floorLvl;
    }

    //Methods
public int getFloorLvl(){
        return floorLvl;
}
public void setFloorLvl(int floorLvl){
        this.floorLvl = floorLvl;
}
@Override
public double calculateAppraisalPrice(){
        double totalAppraisalPrice =
                (getSqFootage() * 88.00 + getBedCount() * 8000.00 + getBathCount() * 10000.00 + getFloorLvl() * 5000.00);
    setAppraisalPrice(totalAppraisalPrice);
        return totalAppraisalPrice;
}
public String toString(){
    return "-------------------------------------------------------------------------------------------------------\n" +
            "Residence Type: Condo           Address: " + getStreetAddress() + "           Zip Code: " + getZip() + "\n" +
            "-------------------------------------------------------------------------------------------------------\n" +
            "Sq Footage: " + getSqFootage() + "\n" +
            "Bedrooms: " + getBedCount() + "\n" +
            "Bathrooms: " + getBathCount() + "\n" +
            "Floor: " + getFloorLvl() + "\n" +
            "------------------------------------------\n" +
            "Appraisal Price: $" + String.format("%.2f", getAppraisalPrice()) + "\n" +
            "List Price: $" + String.format("%.2f", getListPrice()) + "\n" +
            "------------------------------------------\n";
}

}
