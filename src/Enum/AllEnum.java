package Enum;


public class AllEnum {
	
	public enum Health {
		HEALTHY("YOU ARE HEALTHY"),
		WOUNED("YOU ARE WOUNED"),
		DEAD("YOU ARE DEAD");
		
		private String str;
		Health(String str){
			this.str = str;
		}

		public String getstr() {
			return str;
		}
	}

	public enum Fatiqe {
		ALERT("BE ALERT"), 
		TRIED("TRY AGAIN"),
		SLEEPING("SLEEPING MOOD");

		private String str;
		Fatiqe(String str){
			this.str = str;
		}

		public String getstr() {
			return str;
		}
	}

	public enum Nourishment {
		SATURATED("YOU ARE SATURATED"),
		HUNGRY("YOU ARE HUNGRY"),
		STARVING("YOU ARE STARVING");
		
		private String str;
		Nourishment(String str){
			this.str = str;
		}

		public String getstr() {
			return str;
		}
	}
	
}
