package warehouse.robot;

import java.util.ArrayList;
public class RobotScheduler {
	//Arraylist of robots and booleans for three charging stations to see if they're open, coordinates to be determined.
	ArrayList<Robot> robots = new ArrayList();
	boolean station1 = true;
	boolean station2 = true;
	boolean station3 = true;
	
	//Add robots, to be changed later w/Floor
	public RobotScheduler(){
		robots.add(new Robot(1,5,5));
		robots.add(new Robot(2,8,8));
		robots.add(new Robot(3,11,11));
	}
	
	//Select the first idle robot to carry out the order. 
	public void carryOrder(){//pass order in parameters later
		int selectrobot = 0;
		for(int i=0; i<robots.size(); i++){
			if(robots.get(i).getStatus() != "none"){
				selectrobot=i;
			}
		}
		//Use requestRoute for the selected robot to get a route from the Floor to go the shelf area.	
	}
	
	//Sends a route request to the Floor in the form of [x start, y start, x destination, y destination].
	public int[] requestRoute(Robot r, int[] destination){
		int[] pathinfo = new int[3];
		pathinfo[0]=r.getX();
		pathinfo[1]=r.getY();
		pathinfo[2]=destination[0];
		pathinfo[3]=destination[3];
		return pathinfo;
	}
	
	public void tick(){
		//Stuff goes here. 
		
		
	}

}
