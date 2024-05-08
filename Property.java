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

abstract class Property {
    //Attributes
    private String StreetAddress;
    private int Zip;
    private double listPrice;
    private double appraisalPrice;

    //Constructors

    Property() {
        StreetAddress = "";
        Zip = 0;


    }

    Property(String StreetAddress, int Zip) {
        this.StreetAddress = StreetAddress;
        this.Zip = Zip;
        this.listPrice = 0.0;
        this.appraisalPrice = 0.0;
    }

    //Methods

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getAppraisalPrice() {
        return appraisalPrice;
    }
    protected void setAppraisalPrice(double appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }
   public abstract double calculateAppraisalPrice();
}
