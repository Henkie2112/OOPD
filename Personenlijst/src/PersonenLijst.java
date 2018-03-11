import java.util.ArrayList;

public class PersonenLijst {
	private ArrayList<Persoon> lijst;
	
	public PersonenLijst() {
		lijst = new ArrayList<>(); 
	}
	
	public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {	
		ArrayList<Persoon> studenten = new ArrayList<>();
		for (Persoon l : lijst) {
			if (l.getSLBer() == SLBer) {
				studenten.add(l);
			}
		}
		return studenten;
	}
		
	public static void main(String[] args) {
		PersonenLijst p = new PersonenLijst();
		Docent piet=new Docent("Piet","Jansen","jnsnp");
		Student marie=new Student("Marie","Pieters",31415,piet);
        Student jan=new Student("Jan","de Vries",92653,null);
        Student Simon = new Student("Simon", "van Noppen", 34343, piet);

         p.lijst.add(piet);
         p.lijst.add(marie);
         p.lijst.add(jan);
         p.lijst.add(Simon);
        
         ArrayList<Persoon> studentenVanPiet=p.getSLBStudenten(piet);
         System.out.println(studentenVanPiet);
	}
}

