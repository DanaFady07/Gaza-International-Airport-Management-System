//Student Name: Dana Fady Elewa , Student ID: 220253837 , 202
package Airport;

public class Main  {
    
    public static void main(String[] args) {
    AirportManagementSystem airport= new  AirportManagementSystem();
    airport.readPassenger();
    Flight flight1=new Flight("A100","London",50);
    Flight flight2=new Flight("A200","Paris",100);
    airport.addFlight(flight1);
    airport.addFlight(flight2);
    Pilot pilot1 =new Pilot("Mohamad Ahmad","202650","Palestinian",5000,"Morning","LN1000","International Flight Certificate",2000);
    Pilot pilot2 =new Pilot("Karem Walid","202660","Palestinian",5500,"Evening","LN2000","International Flight Certificate",1500);
    FlightAttendant flightAttendant1=new FlightAttendant("Sara Ahmad","202690","Egyption",2500,"Morning","Arabic,English",200);
    FlightAttendant flightAttendant2=new FlightAttendant("Lina Ahmad","202670 ","Egyption",2500,"Evening","Arabic,English,French",500);
    FlightAttendant flightAttendant3=new FlightAttendant("Tala Ali","20268","Syrian",2500,"Evening","Arabic,English,chinese",300);
    FlightAttendant flightAttendant4=new FlightAttendant("Rola Mhamood","20267","Palestinian",2500,"Morning","Arabic,English",600);
    airport.addPerson(pilot1);
    airport.addPerson(pilot2);
    airport.addPerson(flightAttendant1);
    airport.addPerson(flightAttendant2);
    airport.addPerson(flightAttendant3);
    airport.addPerson(flightAttendant4);
    flight1.assignPilot(pilot1);
    flight1.addFlightAttendant(flightAttendant4);
    flight1.addFlightAttendant(flightAttendant1);
    flight2.assignPilot(pilot2);
    flight2.addFlightAttendant(flightAttendant2);
    flight2.addFlightAttendant(flightAttendant3);
    // حجز للمسافرين من الملف حسب الوجهة
    for (Person person : airport.getPeople()) {
    if (person instanceof Passenger) {
    Passenger passenger = (Passenger) person;
    if (passenger.getDestination().equalsIgnoreCase("London")) {
    airport.bookPassenger(flight1.getFlightNumber(),passenger);
    } else if (passenger.getDestination().equalsIgnoreCase("Paris")) {
    airport.bookPassenger(flight2.getFlightNumber(),passenger);
    }
    }
    }
    // اصافة مسافروحجز له برحلة لندن 
   Passenger passenger4 = new Passenger("Mona Hassan","777","Palestinian","78965","10/5/2030","London");
    airport.addPerson(passenger4);
    airport.bookPassenger("A100", passenger4);
    // تغيير حالة رحلة ما
    airport.changeFlightStatus("A100", FlightStatus.BOARDING);
    airport.changeFlightStatus("A100", FlightStatus.DEPARTED);
    // طباعة التقرير اليومي
    airport.GenerateDailyReport();
    // حفظ اليبانات
    airport.saveFlight();
    }
    
    
}