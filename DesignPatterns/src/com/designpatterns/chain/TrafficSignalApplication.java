/**
 * 
 */
package com.designpatterns.chain;

/**
 * @author sarika
 *
 */
public class TrafficSignalApplication {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		LanesHandler lane = getChain();
		lane.setYellow(true);
		int timeStamp;
		while(true){
			timeStamp = 0;
			
			while(timeStamp < 20){
				
				if(lane.isYellow()){		
					lane.setYellow(false);
					lane.setGreen(true);
					lane.setRed(false);
				}
					
				if(timeStamp == 19){
					lane.setYellow(true);
					lane.setGreen(false);
					lane.getNextHandler().setYellow(true);
				}
				
				Thread.sleep(1000);
				timeStamp++;
				System.out.println("lane: "+lane.getClass()+" RED: "+lane.isRed()+" YELLOW: "+lane.isYellow()+" GREEN: "+lane.isGreen());

				
			}
			lane.setYellow(false);
			lane.setRed(true);		
			System.out.println("lane: "+lane.getClass()+" RED: "+lane.isRed()+" YELLOW: "+lane.isYellow()+" GREEN: "+lane.isGreen());
			lane = lane.getNextHandler();
			System.out.println("lane: "+lane.getClass()+" RED: "+lane.isRed()+" YELLOW: "+lane.isYellow()+" GREEN: "+lane.isGreen());
			
		}
		
	}

	/**
	 * @return
	 */
	private static LanesHandler getChain() {
		
		LanesHandler right = new RightHandler();
		LanesHandler left = new LeftHandler();
		LanesHandler forward = new ForwardHandler();
		LanesHandler back = new BackHandler();
		
		right.next(back);
		back.next(left);
		left.next(forward);
		forward.next(right);
		
		return right;
	}

}
