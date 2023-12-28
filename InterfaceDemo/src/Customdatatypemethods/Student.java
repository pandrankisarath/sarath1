package Customdatatypemethods;

public class Student {

    private String name;
    private String rollno;

    private AddrEss address;

    public Student(String name,String rollno,AddrEss address){
        this.name=name;
        this.rollno=rollno;
        this.address=address;

    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public AddrEss getAddress() {
        return address;
    }
}
