package com.Cladiri;

public class Cladire {

    private int nrEtaje;
    private int nrCamere;
    private boolean hasElevator;
    private int fabricationYear;

    public Cladire()
    {
        //default constructor
    }
    public Cladire(int nrEtaje,int nrCamere,boolean hasElevator,int fabYear)
    {
        this.nrEtaje=nrEtaje;
        this.nrCamere=nrCamere;
        this.hasElevator=hasElevator;
        this.fabricationYear=fabYear;
    }

    public Cladire(int nrEtaje,int nrCamere)
    {

        this.nrEtaje=nrEtaje;
        this.nrCamere=nrCamere;

    }

    public void print()
    {
        System.out.println("Numarul de etaje este: "+this.nrEtaje);
        System.out.println("Numarul de camere este: "+this.nrCamere);
        System.out.println("Cladirea are lift: "+this.hasElevator);
        System.out.println("Anul constructiei este: "+this.fabricationYear);

    }
    public int getNrEtaje()
    {
        return nrEtaje;
    }
    public int getNrCamere()
    {
        return nrCamere;
    }

    public int getFabricationYear()
    {
        return fabricationYear;
    }

    public boolean isHasElevator()
    {
        return true;
    }




}
