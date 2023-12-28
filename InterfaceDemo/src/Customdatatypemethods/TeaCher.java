package Customdatatypemethods;

public class TeaCher {

    private String name;

    private AddrEss address;

    public  TeaCher(String name,AddrEss address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public AddrEss getAddress() {
        return address;
    }
}
