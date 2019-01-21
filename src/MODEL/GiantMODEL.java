package MODEL;
import Enum.AllEnum.Fatiqe;
import Enum.AllEnum.Health;
import Enum.AllEnum.Nourishment;

public class GiantMODEL {
	
	Health health;
	Fatiqe fatiqe;
	Nourishment nourishment;
	
	public GiantMODEL(){
		//default constructor
	}

	public GiantMODEL(Health health, Fatiqe fatiqe, Nourishment nourishment) {
		super();
		this.health=health;
		this.fatiqe=fatiqe;
		this.nourishment=nourishment;
	}

	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
	}

	public Fatiqe getFatiqe() {
		return fatiqe;
	}

	public void setFatiqe(Fatiqe fatiqe) {
		this.fatiqe = fatiqe;
	}

	public Nourishment getNourishment() {
		return nourishment;
	}

	public void setNourishment(Nourishment nourishment) {
		this.nourishment = nourishment;
	}

	@Override
	public String toString() {
		return "GiantMODEL [health=" + health + ", fatiqe=" + fatiqe + ", nourishment=" + nourishment + "]";
	}
}
