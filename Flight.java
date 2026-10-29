
package Airport;

import java.util.ArrayList;

public class Flight {
   private String FlightNumber;
   private String destination;
   private int capacity;
   private FlightStatus status;
   private Pilot poilot;
   private ArrayList<FlightAttendant> flightAttendants;
   private ArrayList<Passenger> passengers;
   private static int TotalDepartedFlight;

    public Flight(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    public Flight(String FlightNumber, String destination, int capacity) {
        this.FlightNumber = FlightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.status=FlightStatus.SCHDULED;
        this.flightAttendants=new ArrayList<>();
        this.passengers=new ArrayList<>();
        
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public Pilot getPoilot() {
        return poilot;
    }

    public static int getTotalDepartedFlight() {
        return TotalDepartedFlight;
    }
    

    public ArrayList<FlightAttendant> getFlightAttendants() {
        return flightAttendants;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    // دالة اضافة طيار 
     public void assignPilot(Pilot pilot){
         this.poilot=pilot;
     }
     // دالة اضافة مضيفين طيران  
    public void addFlightAttendant(FlightAttendant flightAttendant){
      flightAttendants.add(flightAttendant);  
    }
    // دالة لفحص انو عدد المضيفيفن لا يقل عن  اثنين
    public boolean hasMinimumAttendant(){
       return flightAttendants.size()>=2 ;
      
    }
    // دالة اضافة راكب  
   public void addPassenger(Passenger passenger)throws FlightFullException,DuplicatePassengerException{
       
    //الشرط الاول 
    if (status != FlightStatus.SCHDULED){
     System.out.println("The Flight isn't Scheduled,Passenger con not be added!");
    }
    //الشرط الثاني 
    if(passengers.size()>=capacity){
        throw new FlightFullException();
    }
    // الشرط الثالث 
    if(passenger.getDestination().equalsIgnoreCase(destination)){
     System.out.println("Destination does not match!");
    }
    // الشرط الرابع 
     for (Passenger bookPassenger : passengers) {
    if (bookPassenger.getPassportNumber().equalsIgnoreCase(
     passenger.getPassportNumber())) {
        throw new DuplicatePassengerException();    
    }
}
     passengers.add(passenger);
     System.out.println("Passenger sdded successfully");
          
   }
   // دالة تغيير الحالة 
   public void changeStatus(FlightStatus newStatus) throws InvalidFlightStatusException{
    if (status == FlightStatus.SCHDULED && newStatus == FlightStatus.BOARDING) 
    {
    status = newStatus;
    System.out.println("Flight status changed successfully");

    } else if (status == FlightStatus.BOARDING && newStatus == FlightStatus.DEPARTED)
    {
     status = newStatus;
     TotalDepartedFlight++;
     System.out.println("Flight status changed successfully");

    } else if (newStatus == FlightStatus.CANCELLED && status != FlightStatus.DEPARTED)
     {
     status = newStatus;
     System.out.println("Flight has been cancelled!");
 // هان خطا اذا هو عمل الغاء للرحلة ورحلة اصلا غادرت    
    } else {
     System.out.println("Error: Invalid status change");
    }
}   

   public void print(){
    System.out.println("Flight Number: "+FlightNumber);    
    System.out.println("Destination: "+destination);   
    System.out.println("Capacity: "+capacity);    
    System.out.println("Status: "+status);
    
    System.out.println("Poilt: ");
    if (poilot!=null){
     poilot.print();
    }
    else{
    System.out.println("No poilt assigned");   
   }
   System.out.println("FlightAttendant: ");
   for(FlightAttendant FA :flightAttendants ){
    FA.print();
   }
   System.out.println("Passengers: ");
   for(Passenger P2 :passengers ){
    P2.print();
   }
   }
   
   }

