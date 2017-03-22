package com.designpatterns.chain;
/**
 * @author sarika
 *
 */
public class BackHandler implements LanesHandler {

	private boolean red = false;
	private boolean yellow = false;
	private boolean green = false;
	
	LanesHandler nextHandler;

	@Override
	public void next(LanesHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * @return the red
	 */
	public boolean isRed() {
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(boolean red) {
		this.red = red;
	}

	/**
	 * @return the yellow
	 */
	public boolean isYellow() {
		return yellow;
	}

	/**
	 * @param yellow the yellow to set
	 */
	public void setYellow(boolean yellow) {
		this.yellow = yellow;
	}

	/**
	 * @return the green
	 */
	public boolean isGreen() {
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(boolean green) {
		this.green = green;
	}

	/**
	 * @return the nextHandler
	 */
	public LanesHandler getNextHandler() {
		return nextHandler;
	}

	/**
	 * @param nextHandler the nextHandler to set
	 */
	public void setNextHandler(LanesHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void changeRed() {

		red = red ? false : true;

	}

	@Override
	public void changeYellow() {
		yellow = yellow ? false : true;

	}

	@Override
	public void changeGreen() {
		green = green ? false : true;

	}
}
