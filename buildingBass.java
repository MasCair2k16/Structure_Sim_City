/**
 * This program demonstrates the buildingBass who is adult to School and cityHall
 * @author Mason Caird
 * @since 1-8-18
 */

//PT -- javadoc. -2

//PT -- in this case, you want "Base", not "Bass"
public abstract class buildingBass {
    
    protected String name;
    protected String address;
    protected Integer rooms;

    //Defualt Constructor...
    buildingBass() {
        name = "Great Wold Lodge";
        address = "437 RiverLodge Rd, Chehalis, Washington";
        rooms = 23;
    }

    // Constructor...
    buildingBass(String name, String address, int rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    // getFunctions
    public String getName() {return name;}
    public String getAddress() {return address;}
    public int getRooms() {return rooms;}

    // setFunctions
    public void setName(String inputName) {name = inputName;}
    public void setAddress(String inputAddress) {address = inputAddress;}
    public void setRooms(int inputRooms) {rooms = inputRooms;}

    // Report the buildings stats
    //PT -- Buidling?
    public String displayBuidling() { return String.format("Building name: " + name + "\naddress: " + address + "\nRooms: "+ rooms);}

    // Adding and removing vector functions.
    //PT -- return boolean from these, in case they fail (e.g. no room in building, person doesn't exist to remove)
    public abstract void addPersonToVector(bassPerson inputCityHallOccupant);
    public abstract void removePersonFromVector(bassPerson inputCityHallOccupant);

    // reading the occupants.
    public abstract void displayOccupants();
}
