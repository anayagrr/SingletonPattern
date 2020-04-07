package jdp2e.singleton.questions_answers;

public class SingletonPatternCaptain2 {

	public static void main(String[] args) {
		Captain2 objCaptain1 = Captain2.getCaptain();
		Captain2 objCaptain2 = Captain2.getCaptain();
		if (objCaptain1 == objCaptain2) {
			System.out.println("objCaptain1 and objCaptain2 are same instance.");
		}
	}

}
