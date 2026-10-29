
package Airport;
//Employee(Poilt,FlightAttendant)
public class Employee extends Person{
    private double Salary;// الراتب 
    private String Shift;// الوردية 

    public Employee(String name,String nationaId,String nationality,double Salary,String Shift) {
        super(name, nationaId, nationality);
        this.Salary=Salary;
        this.Shift=Shift;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getShift() {
        return Shift;
    }

    public void setHireDate(String Shift) {
        this.Shift = Shift;
    }
    
    @Override
    public void print(){
    super.print();
    System.out.println("Salary: "+Salary+"$"); 
    System.out.println("Shift: "+Shift);
    }
}
