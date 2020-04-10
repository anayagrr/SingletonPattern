package jdp2e.singleton.demo;

// We make the class final to prevent that can't be extended 
final class Captain {
	private static Captain captain;
	
	//We make the constructor private to prevent the use of "new"
	private Captain() { }
	
	public static synchronized Captain getCaptain() {
		//lazy initialization
		if (captain == null) {
			captain = new Captain();
		} else {
			System.out.println("You already have a captain for your team.");
		}
		return captain;
	}
}
