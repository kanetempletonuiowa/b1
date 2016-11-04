package warehouse.event;

public class Event {
	
	private int fireTime;
	private Task doTask;
	
	public Event(int t) {
		fireTime=t;
	}
	
	public int getFireTime() {return fireTime;}
	public void setFireTime(int t){fireTime=t;}

}
