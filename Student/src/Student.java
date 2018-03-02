
public class Student {
	private String naam;
	private String geslacht;
	private int studentNr;
	
	public static final String MAN = "man";
	public static final String VROUW = "vrouw";
	
	private static int nStudenten = 0;
	
	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
	}
		
	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}

	public static int getNStudenten() {
		return nStudenten;
	}

	public String toString() {
		return getNaam();
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getStudentNr() {
		return studentNr;
	}

	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}
	
	
}

