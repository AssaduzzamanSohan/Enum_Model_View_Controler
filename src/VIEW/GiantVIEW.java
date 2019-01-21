package VIEW;

import Enum.AllEnum.Fatiqe;
import Enum.AllEnum.Health;
import Enum.AllEnum.Nourishment;
import MODEL.GiantMODEL;

public class GiantVIEW {

GiantMODEL gMode = new GiantMODEL();
	
	public GiantVIEW(){
		
	}
	public void displayGiant(GiantMODEL gModel) {
		
		
		for(Health hel: Health.values()) {
			System.out.println(hel+ ": "+hel.getstr());
			
		}
		for(Fatiqe fat: Fatiqe.values()) {
			System.out.println(fat+": "+fat.getstr());
		}
		for(Nourishment nor: Nourishment.values()) {
			System.out.println(nor+": "+nor.getstr());
		} 		
	}
}
