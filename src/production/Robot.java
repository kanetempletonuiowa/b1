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
	
	//@author: Alex Wang
	//Assigns the robot a unique reference number, as well as it's starting position x and y. 
	public Robot(int number, int x, int y){
		this.number=number;
		this.x=x;
		this.y=y;
	}
	
	//@author: Alex Wang
	//When sent a route from the floor, set this robot to "active".
	//toShelf - robot moves from robot station to shelves to get an item
	//toCharge - robot moves to charging station
	//toStation - robot moves to picker, drops off shelf
	//returnShelf - robot returns shelf to location set by inventory 
	//charge - robot charging
	//Once the robot is finished with its task, it will wait for the next task using the "wait-(task)" String
	public void setRoute(ArrayList<int[]> newroute, String task){
		this.task=task;
		route = (ArrayList<int[]>)newroute.clone();
	}
	
	//@author: Alex Wang
	public void setTask(String s){
		task=s;
	}
	//@author: Alex Wang
	//Move robot towards destination. Change the route array list to reflect remaining route. Uses 0.5 charge per step.
	public void tick(){
		if(task!="none" && task!="wait-toStation" && task!="wait-returnShelf" && task!="wait-toHome" && task!="wait-toCharge"){
			if(route.size()>0){
				x=route.get(0)[0];
				y=route.get(0)[1];
				route.remove(0);
				if(charge>0.0){
					charge-=0.5;
				}
			} else {
				if(task=="toShelf"){
					charge-=0.25;
					this.getShelf();
					//Ask robot scheduler for route to station
					this.setTask("wait-toStation");
				}
				if(task=="toStation"){
					charge-=0.25;
					//Ask robot scheduler for route to drop off shelf
					this.setTask("wait-returnShelf");
				}
				if(task=="toCharge"){
					task="charge";
				}
				if(task=="charge"){
					charge+=4.0;
					if(charge>=100.0){
						charge=100.0;
						this.setTask("wait-toHome");
					}
				}
				if(task=="toHome"){
					this.setTask("none");
				}
				if(task=="returnShelf"){
					charge-=0.25;
					this.setShelf();
					if(charge<=30.0){
						this.setTask("wait-toCharge");
					} else {
						this.setTask("wait-toHome");
					}
				}
			}
		}
	}
	
	//@author: Alex Wang
	public void getShelf(){
		//Pick up the shelf
	}
	
	//@author: Alex Wang
	public void setShelf(){
		//Set shelf down at location prompted
	}
	
	//@author: Alex Wang
	public String getStatus(){
		return task;
	}
	
	//@author: Alex Wang
	public int getNumber(){
		return number;
	}
	
	//@author: Alex Wang
	public int getX(){
		return x;
	}
	
	//@author: Alex Wang
	public int getY(){
		return y;
	}

}

