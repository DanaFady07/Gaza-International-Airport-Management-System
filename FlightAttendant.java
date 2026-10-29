
package Airport;

public class FlightAttendant extends Employee {
    private String Lenguages;// اللغات المتقنة
    private int numberOFflight;// عدد الرحلات 
    
    public FlightAttendant(String name, String nationaId, String nationality, double Salary, String Shift,String Lenguages,int numberOFflight) {
    super(name, nationaId, nationality, Salary, Shift);
    this.Lenguages=Lenguages;
    this.numberOFflight=numberOFflight;
    }

    public String getLenguages() {
        return Lenguages;
    }

    public void setLenguages(String Lenguages) {
        this.Lenguages = Lenguages;
    }

    public int getNumberOFflight() {
        return numberOFflight;
    }

    public void setNumberOFflight(int numberOFflight) {
        this.numberOFflight = numberOFflight;
    }
    @Override
    public void print(){
    super.print();
    System.out.println("Lenguages: "+Lenguages); 
    System.out.println("Number OF Flight: "+numberOFflight); 
    }
}
