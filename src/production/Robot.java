package production;

import java.util.ArrayList;
public class Robot {
	
	int number;
	int x;
	int y;
	int size=2;
	double charge=100.0;
	String task="none";
	ArrayList<int[]> route = new ArrayList();
	//Variable for shelf being carried
	
	//Assigns the robot a unique reference number, as well as it's starting position x and y. 
	public Robot(int number, int x, int y){
		this.number=number;
		this.x=x;
		this.y=y;
	}
	
	//When sent a route from the floor, set this robot to "active".
	//Tasks are "toShelf", "toCharge", "toStation", toShelf2", "toHome" and "charge". 
	//toShelf finds a shelf to pick up, toShelf2 finds a place to set the shelf down 
	public void setRoute(ArrayList<int[]> newroute, String task){
		this.task=task;
		route = (ArrayList<int[]>)newroute.clone();
	}
	
	public void setTask(String s){
		task=s;
	}
	
	//Move robot towards destination. Change the route array list to reflect remaining route. Uses 0.5 charge per step.
	public void tick(){
		if(task!="none"){
			x=route.get(0)[0];
			y=route.get(0)[1];
			if(route.size()>0){
				route.remove(0);
				if(charge>0.0){
					charge-=0.5;
				}
			} else {
				if(task=="toShelf"){
					charge-=0.25;
					this.getShelf();
					//Ask robot scheduler for route to station
					this.setTask("toStation");
				}
				if(task=="toStation"){
					charge-=0.25;
					//Ask robot scheduler for route to drop off shelf
					this.setTask("toShelf2");
				}
				if(task=="toCharge"){
					task="charge";
				}
				if(task=="charge"){
					charge+=4.0;
					if(charge>=100.0){
						charge=100.0;
						this.setTask("toHome");
					}
				}
				if(task=="toHome"){
					this.setTask("none");
				}
				if(task=="toShelf2"){
					charge-=0.25;
					this.setShelf();
					if(charge<=30.0){
						
					} else {
						this.setTask("toHome");
					}
				}
			}
		}
	}
	
	public void getShelf(){
		//Pick up the shelf
	}
	
	public void setShelf(){
		//Set shelf down at location prompted
	}
	
	public String getStatus(){
		return task;
	}
	
	public int getNumber(){
		return number;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

}
