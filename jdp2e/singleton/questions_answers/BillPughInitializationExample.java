package jdp2e.singleton.questions_answers;

public class BillPughInitializationExample {

	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo With Bill Pugh Initialization***\n");
		Captain1.getCaptain();
		
        /*
        System.out.println("Trying to make a captain for your team:");
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2)
        {
            System.out.println("captain1 and captain2 are same instance.");
        }
        */	
	}

}
