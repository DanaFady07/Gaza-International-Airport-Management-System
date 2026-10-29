
package Airport;
// هذا لما يكون المسافر حاجز بالرحلة واحاول احجز كمان مرة 
public class DuplicatePassengerException extends Exception {

    public DuplicatePassengerException() {
        super("Passenger is already booked on this flight");
    }
    
}
