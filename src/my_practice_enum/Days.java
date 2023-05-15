package my_practice_enum;

public enum Days {
	SUNDAY("Sunday",1), 
	mon("monday",2), 
	tues("tuesday",3),
	wed("wednesday",4), 
	fri("friday",5), 
	sta("stsar",7),
     thues;
	;
	String dayString;
	int num;
	private Days(String string, int i) {
		this.dayString=string;
		this.num=i;
		// TODO Auto-generated constructor stub
	}
	private Days() {
		// TODO Auto-generated constructor stub

		
	}
	

	public static void main(String[] args) {
		Days days=Days.SUNDAY;
		
	System.out.println(days.getNum()+" "+days.getDayString());
	//Days days2=new Days("",1);	
		
		
	}



	public String getDayString() {
		return dayString;
	}



	public int getNum() {
		return num;
	}
}
