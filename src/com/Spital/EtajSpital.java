package com.Spital;

public class EtajSpital extends Spital {

    private int nrCamereEtaj;
    private int nrCamereOcupate;

    public EtajSpital()
    {
        //default ctor
    }

    public EtajSpital(int nrEtaje,int nrCamere,boolean hasElevator,int fabYear,String name,
                      String add,int nrCamereEtaj,int nrCamereOcupate)
    {super( nrEtaje, nrCamere, hasElevator, fabYear,name, add);

    this.nrCamereEtaj=nrCamereEtaj;
    this.nrCamereOcupate=nrCamereOcupate;
    }

    public int getNrCamereEtaj()
    {
        return nrCamereEtaj;
    }
    public int getNrCamereOcupate()
    {
        return nrCamereOcupate;
    }
    public void setNrCamereOcupate(int nr)
    {
        this.nrCamereOcupate=nr;

    }

}
