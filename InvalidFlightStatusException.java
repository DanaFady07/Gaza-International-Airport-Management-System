
package Airport;
// هذا لما احاول اغير الحالة بترتيب غير صحيح
public class InvalidFlightStatusException extends Exception{

    public InvalidFlightStatusException() {
        super("Invalid FLight Status!");
    }
    
}
