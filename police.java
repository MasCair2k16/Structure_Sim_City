/**
 * This program demonstrates the class police who is a child of BassPerson
 * @author Mason Caird
 * @since 1-8-18
 */

enum policeRole {
    Patrol, Sargent, Captain, Chief};

//PT -- JavaDoc comments for all classes and functions
public class police extends bassPerson implements employee {
    
    private policeRole role; 
    //PT -- not all officers make the same amount of money. You need set function.
    //  -2
    private int policePay = 540; // monthly pay
    private int ID; 
    private int bank = 0; // Balance in the bank

    //Default Constructor...
    police () {
        role = policeRole.Patrol;
        
    }
    // Constructor
    police(String inputName, int inputAge, String inputCellNumber, policeRole inputRole, int inputID) {
        name = inputName;
        age = inputAge;
        cellNumber = inputCellNumber;
        this.role = inputRole;
        this.ID = inputID;
    }
    // getFunctinos..
    public policeRole getRole() {return role;}
    public int getID() {return ID;} 

    // setfunctions for ID and role position
    public void enterID(int inputId) {ID = inputId;} // Implemented

    // Pay function to be called. This will also add money to bank
    public void givePay() { //implemented
        bank = bank + policePay;
        System.out.println("\nPolice Paid!");
    }

    // to display there pay // all implemented
    public String displayPay() { return String.format("Your pay: " + policePay);}
    public String displayEnterID() {return String.format("Enter your police ID: ");}
    public String displayBank() {return String.format("Bank Total: " + bank);}
    public String displayID() {return String.format("Your ID: " + ID);}

    // display police info
    public String toDisplay() { return String.format("Police name: " + name + "\nAge: " 
    + age + "\nCell Number: "+ cellNumber + "\nID Number: " + ID + "\nPosition: " + role );}

}
