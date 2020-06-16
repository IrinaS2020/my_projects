package hw18_farm;


import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public ArrayList<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(ArrayList<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printInfo() {
        System.out.println("Farm{" +
                "name='" + name + '\'' +
                ", address=" + address.getStreetAddress() + address.getTown() + address.getState() + address.getZip() +
                ", cattle=" + cattle +
                ", Agree Cultural: "
                );
        agreeCultural.forEach(agreeCultural1 -> agreeCultural1.printInfo());

    }

}