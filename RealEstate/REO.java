/**
 * File: Lab9i.java
 *   Description:Make use of HashMaps
 *   Lessons Learned: Store a customer list
 * Store an order history for each customer
 *  Instructor's Name: Jeff Light
 *   @author     Nayelly Zurita
 *   @since       3/18/2024
 **/
    package RealEstate;
    import java.util.*;

public class REO {
        //static Listings field to your REO class
    private static Listings reoListings = new Listings();


        public static void main (String [] args) {
            Scanner sln = new Scanner(System.in); // used for user input
            String choice; //
            boolean done = false;
            while (!done) {
                System.out.println("\n----------------------------------------");
                System.out.println("                    Main Menu");
                System.out.println("----------------------------------------");
                System.out.println("1: Listings");
                System.out.println("2: Bids");

                System.out.print("\nWhat would you like to do? (1-2):");
                choice = sln.nextLine();
                if (choice.equalsIgnoreCase("")) {
                    done = true;
                }   switch (choice) {
                        case "1":
                            displayListingsMenu(sln);
                            break;
                        case "2":
                            displayBidsMenu(sln);
                            break;
                        default:
                            System.out.println("\nInvalid choice. Please enter a number between 1 and 2.");
                    }// end of switch (choice)
                } //end of while
            } // end of main


    private static void displayListingsMenu(Scanner sln) {
        String ListingChoice;
        boolean exitList = false;
        while (!exitList) {
            System.out.println("----------------------------------------");
            System.out.println("                Listing Menu");
            System.out.println("----------------------------------------");
            System.out.println("1: Add Listing");
            System.out.println("2: Show Listings");
            System.out.println("3: Auto Populate Listings (Dev tool)");
            System.out.println("ENTER: Exit back to previous menu\n");

            System.out.print("\nWhat would you like to do? (1-3):");
            ListingChoice = sln.nextLine();
            if (ListingChoice.equalsIgnoreCase("")) {
                exitList = true;
            } else {
                switch (ListingChoice) {
                    case "1":
                        addListing(sln);
                        break;
                    case "2":
                        showListing();
                        break;
                    case "3":
                        autoPopulate();
                        break;
                    default:
                        System.out.print(" Invalid choice. please enter a number between 1 and 4.\n ");

                }
            }
        }
    }
    private static void addListing(Scanner sln) {
        String AddList;                 // the user choose returned
        boolean exitAddList = false; // while loop

        // while loop allows display the mane until the user choose ENTER to exit.
        while (!exitAddList) {
            System.out.println("----------------------------------------\n");
            System.out.println("               Add Listing Menu");
            System.out.println("----------------------------------------\n");
            System.out.println("1: Add House");
            System.out.println("2: Add Condo");
            System.out.println("ENTER: Exit back to previous menu\n");
            System.out.print("\nWhat would you like to do? (1-2):");
            AddList = sln.nextLine();
            if (AddList.equalsIgnoreCase("")) {
                return;  // user choose to exit.
            }
            switch (AddList) {
                    case "1":
                        addHouse(sln);
                        break;
                    case "2":
                        addCondo(sln);
                        break;
                    default:
                        System.out.print("Invalid choice. please enter a number between 1 and 4.\n ");

                } // end of thr switch choice
            }// End of while loop
        } // end of the method addListing
        private static void addHouse(Scanner sln){
            System.out.print("Please enter the street address for the residence:");
            String address = sln.nextLine();
            System.out.print("Please enter the zip code for the residence:");
            int zipCode = Integer.parseInt(sln.nextLine());
            System.out.print("Please enter the number of bedrooms:");
            int bedrooms = Integer.parseInt(sln.nextLine());
            System.out.print("Please enter the number of bathrooms:");
            double bathrooms = Double.parseDouble(sln.nextLine());
            System.out.print("Please enter the square footage of the residence:");
            double sqFootage = Double.parseDouble(sln.nextLine());
            System.out.print("Please enter the size of the yard in acres:");
            double yardAcres = Double.parseDouble(sln.nextLine());
            // Calculate Appraisal Price
            House house = new House(address, zipCode, bedrooms, bathrooms, sqFootage, yardAcres);
            double appraisalPrice = house.calculateAppraisalPrice();
            System.out.print("\nAppraisal Price for this property is: $" + String.format("%.2f", appraisalPrice));
            // Prompt for List Price
            System.out.print("\nPlease enter the List Price for the property:");
            double listPrice = Double.parseDouble(sln.nextLine());
            // Set List Price and Add the house to listings
            house.setListPrice(listPrice);
            reoListings.addListing(address, house);

            // Print the listing details
            System.out.println("\nYou have created a new listing!");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Residence Type: House           Address: " + address + "           Zip Code: " + zipCode);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Sq Footage: " + sqFootage);
            System.out.println("Bedrooms: " + bedrooms);
            System.out.println("Bathrooms: " + bathrooms);
            System.out.println("Yard Size (Acres): " + yardAcres);
            System.out.println("------------------------------------------");
            System.out.println("Appraisal Price: $" + String.format("%.2f", appraisalPrice));
            System.out.println("List Price: $" + String.format("%.2f", listPrice));
            System.out.println("------------------------------------------");
        }
        private static void addCondo(Scanner sln){
            System.out.print("Please enter the street address for the residence:");
            String address = sln.nextLine();
            System.out.print("Please enter the zip code for the residence:");
            int zipCode = Integer.parseInt(sln.nextLine());
            System.out.print("Please enter the number of bedrooms:");
            int bedrooms = Integer.parseInt(sln.nextLine());
            System.out.print("Please enter the number of bathrooms:");
            double bathrooms = Double.parseDouble(sln.nextLine());
            System.out.print("Please enter the square footage of the residence:");
            double sqFootage = Double.parseDouble(sln.nextLine());
            System.out.print("Please enter the floor level of the condo:");
            int floorLevel = Integer.parseInt(sln.nextLine());

            // Calculate Appraisal Price
            Condo condo = new Condo(address, zipCode, bedrooms, bathrooms, sqFootage, floorLevel);
            double appraisalPrice = condo.calculateAppraisalPrice();
            System.out.print("\nAppraisal Price for this property is: $" + String.format("%.2f", appraisalPrice));

            // Prompt for List Price
            System.out.print("\nPlease enter the List Price for the property:");
            double listPrice = Double.parseDouble(sln.nextLine());

            // Set List Price and Add the condo to listings
            condo.setListPrice(listPrice);
            reoListings.addListing(address, condo);

            // Print the listing details
            System.out.println("\nYou have created a new listing!");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Residence Type: Condo           Address: " + address + "           Zip Code: " + zipCode);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Sq Footage: " + sqFootage);
            System.out.println("Bedrooms: " + bedrooms);
            System.out.println("Bathrooms: " + bathrooms);
            System.out.println("Floor: " + floorLevel);
            System.out.println("----------------------------------------");
            System.out.println("Appraisal Price: $" + String.format("%.2f", appraisalPrice));
            System.out.println("List Price: $" + String.format("%.2f", listPrice));
            System.out.println("----------------------------------------");
        }


    private static void showListing() {
        Collection<Residential> residences = reoListings.getResidences();

        // Iterate over each residence and print its details using the toString() method
        int numListing = 1;
        for (Residential residence : residences) {
            System.out.printf("Listing No: %d%n", numListing++);
            System.out.println(residence.toString());
        }
    }
private static void autoPopulate (){
    int currentSize = reoListings.getListings().size();
    House house1 = new House("34 Elm",95129, 3, 2, 2200, .2);
    house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("34 Elm", house1);
    House house2 = new House("42 Hitchhikers",95136, 4, 3, 2800, .3);
    house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("42 Hitchhikers", house2);
    Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
    condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("4876 Industrial", condo1);
    House house3 = new House("2654 Oak",84062, 5, 53, 4200, .5);
    house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("2654 Oak", house3);
    Condo condo2 = new Condo("9875 Lexington",84063, 2, 1, 1500, 1);
    condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("9875 Lexington", condo2);
    Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
    condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("3782 Market", condo3);
    House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
    house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("7608 Glenwood", house4);
    House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
    house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
    reoListings.addListing("1220 Apple", house5);
     // tracking and displaying the number of new listings that were added during the auto-population process
    int listingsAdded = reoListings.getListingCount() - currentSize;
    System.out.println("\n" + listingsAdded + " residences have been added to the listings for testing purposes.\n");
}// end of autoPopulate method

    private static void displayBidsMenu(Scanner sln) {
        String displayBids;
        boolean DBidsMenu = false;
        while (!DBidsMenu) {
            System.out.println("\n----------------------------------------");
            System.out.println("                    Bids Menu");
            System.out.println("----------------------------------------");
            System.out.println("1: Add New Bid");
            System.out.println("2: Show Existing Bids");
            System.out.println("3: Auto Populate Bids (Dev Tool)");
            System.out.println("ENTER: Exit back to previous menu\n");
            System.out.print("\nWhat would you like to do? (1-3):");
                displayBids = sln.nextLine();
                if (displayBids.equalsIgnoreCase("")){
                    DBidsMenu = true;
                }else {
                    switch (displayBids) {
                        case "1":
                            addNewBid(sln);
                            break;
                        case "2":
                            showExistingBids(sln);
                            break;
                        case "3":
                            populateBids();
                            break;
                        case "ENTER":
                            DBidsMenu = true;
                        default:
                            System.out.print(" Invalid choice. please enter a number between 1 and 4.\n ");

                    }
                }

            }
        }
        private static void addNewBid(Scanner sln) {
            System.out.println("\nCurrent Listings for REO:\n");
            System.out.println("No.      Property (bids)");
            System.out.println("---------------------------");
            boolean addMoreBids = true;
            while (addMoreBids) {
                // Display list of properties with their corresponding indices
                List<Residential> residences = new ArrayList<>(reoListings.getResidences());
                for (int i = 0; i < residences.size(); i++) {
                    Residential residence = residences.get(i);
                    System.out.printf("%d: %s (%d)%n", i + 1, residence.getStreetAddress(), residence.getBidCount());
                }
                System.out.println("ENTER: Exit back to previous menu");
                // Prompt user to select a property to add a bid
                System.out.print("\nFor which property would you like to add a bid? ");
                String input = sln.nextLine().trim();
                if (input.isEmpty()) {
                    addMoreBids = false; // Exit the loop if the input is empty
                    continue;
                }
                 try   {
                     int propertyIndex = Integer.parseInt(input) - 1;
                    if (propertyIndex >= 0 && propertyIndex < residences.size()) {
                        Residential selectedResidence = residences.get(propertyIndex);

                        // Display details of the selected property
                        System.out.println(selectedResidence.toString());

                        // Prompt user to enter bidder name and bid amount
                        System.out.print("\nPlease enter the name of the bidder: ");
                        String bidderName = sln.nextLine();

                        System.out.print("Please enter the new bid: $");
                        double bidAmount = Double.parseDouble(sln.nextLine());

                        // Add the new bid to the selected property
                        selectedResidence.newBid(bidderName, bidAmount);
                        System.out.println("\nNew bid for property '" + selectedResidence.getStreetAddress() + "' added.\n");
                    } else {
                        System.out.println("Invalid property index. Please select a valid property.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid property index.");
                }
            }
        }

        private static void showExistingBids(Scanner sln) {
            System.out.println("\nCurrent Listings for REO:\n");
            System.out.println("No.      Property (bids)");
            System.out.println("---------------------------");
            boolean showBids = true;
            while (showBids) {

                List<Residential> residences = new ArrayList<>(reoListings.getResidences()); // Display list of properties
                for (int i = 0; i < residences.size(); i++) {
                    Residential residence = residences.get(i);
                    System.out.printf("%d: %s (%d)%n", i + 1, residence.getStreetAddress(), residence.getBidCount());
                }
                System.out.println("ENTER: Exit back to previous menu");

                // Prompt user to select a property to view bids
                System.out.print("\nFor which property would you like to see the current bids?: ");
                String input = sln.nextLine().trim();
                if (input.isEmpty()) {
                    showBids = false; // Exit the loop if the input is empty
                    continue;
                }
                try {
                    int propertyIndex = Integer.parseInt(input) - 1;
                    if (propertyIndex >= 0 && propertyIndex < residences.size()) {
                        Residential selectedResidence = residences.get(propertyIndex);
                        // Display details of the selected property
                        System.out.println(selectedResidence.toString());

                        // Display bids for the selected property
                        System.out.println("\nCurrent bids for this listing:");
                        System.out.println("----------------------------------------");
                        System.out.printf("%-25s%-15s%n", "Bidder", "Bid");
                        System.out.println("----------------------------------------\n");

                        Map<String, Double> bids = selectedResidence.getBids();
                        for (Map.Entry<String, Double> entry : bids.entrySet()) {
                            System.out.printf("%-25s$%,.2f%n", entry.getKey(), entry.getValue());
                        }
                    } else {
                        System.out.println("Invalid property index. Please select a valid property.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid property index.");
                }
            }
        }


    private static void populateBids() {
        Random random = new Random();
        for (Residential residence : reoListings.getResidences()) {
            double appraisalPrice = residence.calculateAppraisalPrice();
            int numBidsAdded = 0; // Initialize the counter for the number of new bids added
            for (int i = 0; i < 5; i++) {
                String[] autoBidders = {"Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy", "DeForect Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank", "Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton", "Colm Meaney", "Michelle Forbes"};
                int index = random.nextInt(autoBidders.length);
                double bidAmount = appraisalPrice * (1 + (random.nextDouble() * 0.05)); // 1% to 5% higher than appraisal price
                residence.newBid(autoBidders[index], bidAmount);
                numBidsAdded++; // Increment the counter for each new bid added
            }
            System.out.println(numBidsAdded + " new bids have been added to listing " + residence.getStreetAddress() + ".");
        }
    }

}


