
package Airport;
//person(Employee,Passenger)
public  abstract  class Person {
    private static int x =1;
    private int personId;
    private String name;
    private String nationaId;
    private String nationality;

    public Person(String name, String nationaId, String nationality) {
        this.personId = x++; // توليد رقم شخصي تلقائي
        this.name = name;
        this.nationaId = nationaId;
        this.nationality = nationality;
    }

    public int getPersonId() {
        return personId;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationaId() {
        return nationaId;
    }

    public void setNationaId(String nationaId) {
        this.nationaId = nationaId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void print(){
    System.out.println("Person ID: "+personId);
    System.out.println("Name: "+name);
    System.out.println("National ID: "+nationaId);
    System.out.println("Nationality: "+nationality);
    }
}
