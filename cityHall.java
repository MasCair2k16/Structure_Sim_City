/**
 * This program defines cityHall and is the child class of buildingBass.
 * This also hold a vector cityHallOccupants to determine the occupants.
 * @author Mason Caird
 * @since 1-8-18
 */

import java.util.*;

//PT -- Javadoc. -2
public class cityHall extends buildingBass {

    // Defualt Constructor
    cityHall() {
        name = "City Hall of Spokane";
        address = "514 Westview Blvd Spokane, Washington";
        rooms = 6;
    }
    
    // Constructor
    cityHall (String inputName, String inputAddress, int inputRooms) {
        name = inputName;
        address = inputAddress;
        rooms = inputRooms;
    }

    //cityHall occupant vector that holds all the occupants and can be used to show whos in cityHall.
    Vector<bassPerson> cityHallOccupants = new Vector<bassPerson>();

    // Add a City Hall Occupant // Defined in buildingBass
    public void addPersonToVector(bassPerson inputCityHallOccupant) {
        cityHallOccupants.addElement(inputCityHallOccupant);
    }

    // Removes a hall occupant // defined in buildingBass
    public void removePersonFromVector(bassPerson inputCityHallOccupant) {
        //PT -- what if the person isn't there?
        cityHallOccupants.remove(inputCityHallOccupant);
        cityHallOccupants.trimToSize();
    }

    // Display the occupants in the building
    public void displayOccupants() {
        //PT -- better to return the string, and let the UI display it.
        for(int i = 0; i < cityHallOccupants.size(); i++) {
            System.out.println("\nCity Hall Occupants: " + cityHallOccupants.elementAt(i).getName());
        }
    }

    // Pay time for the workers.
    // public void payTime() {
    //     for (int i = 0; i < cityHallOccupants.size(); i++) {
    //         if (cityHallOccupants.getClass() instanceof kid) {
    //             cityHallOccupants[i].elementAt[i].givePay();
    //         }
    //     }
    // }
}
