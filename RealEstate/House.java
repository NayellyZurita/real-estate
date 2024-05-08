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
 * @since       03/20/2024
 */
package RealEstate;

public class House extends Residential {

    //Attributes

    private double yardAcres;

    //Constructions

House() {
    super();
    yardAcres = 0;
}
House (String Addr, int zip, int bed, double bath, double sqf, double yardAcres){
        super (Addr, zip, bed, bath, sqf);
       this.yardAcres = yardAcres;
    }

    //Methods

   public double getYardAcres(){
    return yardAcres;
   }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }

    @Override
    public double calculateAppraisalPrice(){
double totalAppraisalPrice =  getSqFootage() * 97.00 + getBathCount() * 10000.00
        + getBathCount() * 12000.00 + getYardAcres() * 460000.00;
setAppraisalPrice(totalAppraisalPrice);
return totalAppraisalPrice;
    }
    //Use toString () method to display the residence in REO class
    public  String toString(){
        return "-------------------------------------------------------------------------------------------------------\n" +
                "Residence Type: House           Address: " + getStreetAddress() + "           Zip Code: " + getZip() + "\n" +
                "-------------------------------------------------------------------------------------------------------\n" +
                "Sq Footage: " + getSqFootage() + "\n" +
                "Bedrooms: " + getBedCount() + "\n" +
                "Bathrooms: " + getBathCount() + "\n" +
                "Yard Size (Acres): " + getYardAcres() + "\n" +
                "------------------------------------------\n" +
                "Appraisal Price: $" + String.format("%.2f", getAppraisalPrice()) + "\n" +
                "List Price: $" + String.format("%.2f", getListPrice()) + "\n" +
                "------------------------------------------\n";
    }

}
