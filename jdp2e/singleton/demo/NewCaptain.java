package jdp2e.singleton.demo;

// We make the class final to prevent that can't be extended 
final class NewCaptain {
	private static Captain captain;
	
	//We make the constructor private to prevent the use of "new"
	private NewCaptain() { }
	
	public static synchronized Captain getNewCaptain() {
		//lazy initialization
		if (captain == null) {
			captain = new Captain();
			System.out.println("New Captain is elected for your team.");
		} else {
			System.out.println("You already have a captain for your team.");
			System.out.println("Send him for the toss.");
		}
		return captain;
	}
}
