package com.designpatterns.chain;
/**
 * @author sarika
 *
 */
public interface LanesHandler {
	
	
	
	void next(LanesHandler nextHandler);
	void changeRed();
	void changeYellow();
	void changeGreen();
	boolean isRed();
	boolean isYellow();
	boolean isGreen();
	void setNextHandler(LanesHandler nextHandler);
	LanesHandler getNextHandler();
	void setRed(boolean b);
	void setYellow(boolean b);
	void setGreen(boolean b);
	

}
