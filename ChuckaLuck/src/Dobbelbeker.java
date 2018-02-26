
public class Dobbelbeker {
		Dobbelsteen dobbelsteen;
		int waarde;
		int[] drieCijfers = new int [3];
		
		Dobbelbeker() {
			this.dobbelsteen = new Dobbelsteen(6);
			this.waarde = dobbelsteen.randomize();
		}
		
		public int[] dobbelen() {
			
			for(int i =0; i < drieCijfers.length; i++) { 
				this.waarde = dobbelsteen.randomize();
				drieCijfers[i] = this.waarde;
			}
			return drieCijfers;
		}
		
		public String toString() {
			return "Succes met deze ronde! Jou gedobbelde getallen zijn: " + drieCijfers[0] + drieCijfers[1] + drieCijfers[2];
		}
}
