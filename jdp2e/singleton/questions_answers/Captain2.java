package jdp2e.singleton.questions_answers;

//In Java, you can apply this keyword "synchronized" to a method or statements(or, block of code)
final class Captain2 {
	
    private static Captain2 captain;
	static int numberOfInstance = 0;
	
	//We make a constructor private to prevent the use of "new"
	private Captain2() {
		numberOfInstance++;
		System.out.println("Number of instances at this moment="+ numberOfInstance);
	}
	
    public static Captain2 getCaptain() {
    	 if (captain == null) {
             synchronized (Captain2.class) {
                 // Lazy initialization
                 if (captain == null){
                     captain = new Captain2();
                     System.out.println("New captain is elected for your team.");
                 }
                 else {
                     System.out.print("You already have a captain for your team.");
                     System.out.println("Send him for the toss.");
                 }
             }
         }
         return captain;
    }
    
    /*public static void dummyMethod()
    {
        System.out.println("It is a dummy method");
    }  
    */
}
