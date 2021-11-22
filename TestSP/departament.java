package TestSP;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class departament {

    private String name;

    private Collection<Angajat> angajati;
    private Collection<departament> subDepartament;


    public String getName() {
        return name;
   }

   public void setName(String deptName) {
        this.name = deptName;
   }

    public Collection<Angajat> getAngajats() {
        return angajati;
     }

     public void setAngajat( Collection<Angajat> angajati ) {
        this.angajati = angajati;
     }

    public String toString() {
        String s = "Department: " + name + "\n";

        s = s + "Angajat: ";
        if ( angajati.size() == 0 )
           s = s + " none \n";
        else {
           Iterator iterator1 = angajati.iterator();
           while ( iterator1.hasNext() != false ) {
              Angajat angajat = (Angajat) iterator1.next();
              s = s + angajat.getName() + " ";
           }
           s = s + "\n";
        }

        return s;
     }

}
