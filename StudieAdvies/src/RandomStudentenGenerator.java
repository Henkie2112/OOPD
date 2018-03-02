import java.util.Random;

public class RandomStudentenGenerator {

	public static Student[] genereerStudenten(int aantal) {
		Random generator = new Random();
		Student[] studentenLijst = new Student[aantal];
		for (int i = 0; i < aantal; i++) {
			studentenLijst[i] = new Student("persoon_" + i);
			
			for (int j = 0; j < 8; j++) {
				studentenLijst[i].setCijfer(j, generator.nextInt(10) + 1);
			}
		}
		return studentenLijst;
	}

}

