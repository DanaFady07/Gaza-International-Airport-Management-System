
package Airport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class AirportManagementSystem {
private ArrayList<Person> people;  
private ArrayList<Flight> flights;

    public AirportManagementSystem() {
    this.people=new ArrayList<>();
    this.flights=new ArrayList<>();    
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
    
    // دالة اضافة شخص 
 public void addPerson(Person person){
   people.add(person);
 }
 // دالة اضافة رحلة 
  public void addFlight(Flight flight){
   flights.add(flight);
 } 
  // دالة ايجاد رحلة باستخدام رقم الرحلة
   public Flight FindFLight(String FlightNumber){
       for(Flight flight :flights ){
        if(flight.getFlightNumber().equals(FlightNumber)){
         return flight;   
        }   
       }
    return null;
   } 
   //دالة حجز مسافر 
    public boolean bookPassenger (String FlightNumber,Passenger passenger){
       Flight flight= FindFLight(FlightNumber);
       if (flight==null){
    return false;
    }
   try{   
     flight.addPassenger(passenger);
     return true;  
}catch (FlightFullException e ){
  System.out.println(e.getMessage());
}
 catch (DuplicatePassengerException e ){
  System.out.println(e.getMessage());
}
    return false;
   
}
    // دالة تغيير حالة الرحلة 
  public boolean changeFlightStatus(String FlightNumber,FlightStatus status){
    Flight flight=FindFLight(FlightNumber); 
     if (flight==null){
    return false;
    }
     try{
     flight.changeStatus(status);
     return true;
     }catch (InvalidFlightStatusException e){
  System.out.println(e.getMessage());
  return false;
}
  }
  //دالة طباعة التقرير اليومي 
  public void GenerateDailyReport(){
   System.out.println("================ DAILY REPORT ==============");
   System.out.println("----------Pepole----------");
   for(Person person : people){
    person.print();
    if (person instanceof Pilot){
     System.out.println("Person Type is: Pilot");   
    }
    else if (person instanceof FlightAttendant){
     System.out.println("Person Type is: FlightAttendant");   
    }
    else  if (person instanceof Passenger){
     System.out.println("Person Type is: Passenger");   
    }
    }
    System.out.println("--------------------------");
    System.out.println("----------Flights----------");
    for(Flight flight : flights){
    flight.print();
   }
    System.out.println("--------------------------");
    System.out.println("Total Departed Flights: "+Flight.getTotalDepartedFlight()); 
    System.out.println("===========================");
} 
  // جفظ الرحلات في ملف 
  public void saveFlight(){
    try {
        
    PrintWriter save  = new PrintWriter("src/Airport/flight_log.txt");
    for(Flight flight : flights){
    save.println( flight.getFlightNumber()+","+flight.getDestination()+","+flight.getCapacity()+","+flight.getStatus()+","+flight.getPassengers().size());
    }
    save.close();
        System.out.println("Flight saved successfully");
    } catch (FileNotFoundException e) {
     System.out.println("Error! Flight can not be saved");   
}
}   
  // دالة قراءة قائمة المسافرين من الملف    
   public void readPassenger() { 
   try{    
   File F= new File("src/Airport/passengers.txt"); 
   Scanner read=new Scanner (F); 
   while (read.hasNextLine()){ 
    String line=read.nextLine();
    String[]data=line.split(",");
    String name = data[0];
    String nationaId = data[1];
    String nationality = data[2];
    String PassportNumber = data[3];
    String PassportExpiryDate = data[4];
    String Destination = data[5];
    Passenger passenger=new Passenger( name,nationaId,nationality,PassportNumber,PassportExpiryDate,Destination);
    people.add(passenger);
   }
    read.close();
     System.out.println("Passenger readed seccessfully");
   }catch (FileNotFoundException e){
   System.out.println("Passenger file not found");    
   }
   }
   } 
   

