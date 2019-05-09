import com.Cladiri.Cladire;
import com.Spital.EtajSpital;
import com.Spital.Spital;
public class Main {

    public static void main(String[] args) {

        Cladire c= new Cladire(4,20,true,1997);
       c.print();
        System.out.println(c.isHasElevator());
        c.getFabricationYear();

        Spital s=new Spital(4,20,true,1997,"SF Petru","Strada Lalelelor");
        s.print();
        System.out.println(s.getName());

        EtajSpital et=new EtajSpital(4,20,true,1997,"SF Petru",
                "Strada Lalelelor",13,8);
        et.setNrCamereOcupate(10);
        System.out.println(et.getNrCamereOcupate());

    }
}
