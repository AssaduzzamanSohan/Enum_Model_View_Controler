package Controller;

import Enum.AllEnum.Fatiqe;
import Enum.AllEnum.Health;
import Enum.AllEnum.Nourishment;
import MODEL.GiantMODEL;
import VIEW.GiantVIEW;

public class GiantController {
	GiantVIEW gVw = new GiantVIEW();
	GiantMODEL gMod = new GiantMODEL();
	
	Health health;
	Fatiqe fatigue;
	Nourishment nourishment;
	
	GiantController(){
		
	}
	
	GiantController(GiantMODEL gModel, GiantVIEW gView){				
		super();
		this.gMod = gModel;
		this.gVw = gView;
	}
	public void updateView() {
		gVw.displayGiant(gMod);
		
	}	
	public static void main(String[] args) {
		
		Health health = Health.HEALTHY;
		Fatiqe fatigue = Fatiqe.SLEEPING;
		Nourishment nourishment = Nourishment.HUNGRY;
		
		GiantVIEW gVie = new GiantVIEW();
		GiantMODEL gMode = new GiantMODEL(health, fatigue, nourishment);
		
		GiantController gCon = new GiantController(gMode, gVie);
		gCon.updateView();		
	}
}
