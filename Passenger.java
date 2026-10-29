
package Airport;

public class Passenger extends Person {
    private String PassportNumber;
    private String PassportExpiryDate;
    private String Destination;
    
   public Passenger(String name, String nationaId, String nationality,String PassporNumber,String PassportExpiryDate,String Destination) {
    super(name, nationaId, nationality);
    this.PassportNumber=PassporNumber;
    this.PassportExpiryDate=PassportExpiryDate;
    this.Destination=Destination;        
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassporNumber(String PassporNumber) {
        this.PassportNumber = PassporNumber;
    }

    public String getPassportExpiryDate() {
        return PassportExpiryDate;
    }

    public void setPassportExpiryDate(String PassportExpiryDate) {
        this.PassportExpiryDate = PassportExpiryDate;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }
    @Override
    public void print(){
    super.print();
    System.out.println("Passport Number: "+PassportNumber); 
    System.out.println("Passport Expiry Data: "+PassportExpiryDate); 
    System.out.println("Destination: "+Destination); 
    }
    
}
