
package Airport;
// هذا عند محاولة اضافة مسافر لرحلة ممتلئة
public class FlightFullException extends Exception {

    public FlightFullException() {
        super("Flight is Full!!");
    }
    
}
