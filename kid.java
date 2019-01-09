/**
 * This program demonstrates the kid class which is child of Building bass
 * @author Mason Caird
 * @since 1-8-18
 */

public class kid extends bassPerson {
    private String favCandy;
    private int numOfCavity;

    // Default Constructor
    kid () {
        name = "Mason Caird";
        age = 7;
        cellNumber = "232-1423";
        favCandy = "Kit Kat";
        numOfCavity = 8;
    }

    // Constructor
    kid (String inputName, int inputAge, String inputCellNumber, String inputFavCandy, int inputNumOfCavity) {
        name = inputName;
        age = inputAge;
        cellNumber = inputCellNumber;
        this.favCandy = inputFavCandy;
        this.numOfCavity = inputNumOfCavity;
    }

    // getFunctions
    public String getCandy() { return favCandy;}
    public int getNumOfCavity() {return numOfCavity;}

    // setFunctions
    public void setCandy(String inputFavCandy) {favCandy = inputFavCandy;}
    public void setCavity(int inputNumOfCavity) {numOfCavity = inputNumOfCavity;}

    // Summarizes kid info
    public String toDisplay() { return String.format("Kid name: " + name + "\nAge: " + age + "\nCell Number: "+ cellNumber + "\nFavorite Candy: " + favCandy + "\nNumer of Cavities: " + numOfCavity);}
}