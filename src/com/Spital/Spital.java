package com.Spital;
import com.Cladiri.Cladire;

public class Spital extends Cladire {

    private String name;
    private String address;

    public Spital(int nrEtaje,int nrCamere,boolean hasElevator,int fabYear,String name, String add)
    {super(nrEtaje, nrCamere, hasElevator, fabYear);

    this.name=name;
    this.address=add;
    }


    public Spital(int nrEtaje,int nrCamere,String name, String add)
    {super(nrEtaje, nrCamere);

        this.name=name;
        this.address=add;

    }

    public void print()
    {

        System.out.println("Numarul de etaje este: "+ this.getNrEtaje());
        System.out.println("Numarul de camere este: "+this.getNrCamere());
        System.out.println("Cladirea are lift: "+ this.isHasElevator());
        System.out.println("Anul constructiei este: "+ this.getFabricationYear());
        System.out.println("Numele Cladirii este "+ this.name);
        System.out.println("Adresa cladirii este: "+this.address);


    }
    public Spital()
    {
        //default ctor
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }


}
