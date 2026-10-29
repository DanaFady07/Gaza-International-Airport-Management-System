
package Airport;

public class Pilot extends Employee {
    private String LicenseNumber; //رقم الرخصة 
    private String Certificates;// الشهادات 
    private int FlightHours;// ساعات الطيران 

    public Pilot(String name, String nationaId, String nationality, double Salary, String Shift,String LicenseNumber,String Certificates,int FlightHours) {
    super(name, nationaId, nationality, Salary, Shift);
    this.LicenseNumber=LicenseNumber;
    this.Certificates=Certificates;
    this.FlightHours=FlightHours;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getCertificates() {
        return Certificates;
    }

    public void setCertificates(String Certificates) {
        this.Certificates = Certificates;
    }

    public int getFlightHours() {
        return FlightHours;
    }

    public void setFlightHours(int FlightHours) {
        this.FlightHours = FlightHours;
    }
    @Override
    public void print(){
     super.print();
     System.out.println("Lincense Number: "+LicenseNumber);
     System.out.println("The Certificates: "+Certificates);
     System.out.println("Fligth Hours: "+FlightHours);
    }
}
