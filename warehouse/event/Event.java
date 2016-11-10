package warehouse.event;

//events for Master's event queue
//compared by fireTime

public class Event implements Comparable<Event> {
	
	private int fireTime; //events will fire when Master clock reaches this time
	private Task doTask;
        private String taskName;
	
	public Event(String name, int t, Task task) {
            taskName=name;
            fireTime=t;
            doTask=task;
	}
        
	
	public int getFireTime() {return fireTime;}
	public void setFireTime(int t){fireTime=t;}
        
        public void setTask(Task task) {doTask=task;}
        public Task getTask(){return doTask;}
        
        public void setName(String n){taskName=n;}
        public String getName(){return taskName;}

    @Override
    public int compareTo(Event e) {
        if (e.getFireTime()==this.getFireTime())
            return 0;
        if (e.getFireTime()>this.getFireTime())
            return -1;
        return 1;
    }
        

}