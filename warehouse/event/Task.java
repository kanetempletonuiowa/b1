package warehouse.event;

/*
    not positive on the way this is set up yet.
    events call tasks to be fired, but it may be easier
    to combine them into one class?
*/


public interface Task {
	
    public void fire(); //what the task will do when it goes off
    
}