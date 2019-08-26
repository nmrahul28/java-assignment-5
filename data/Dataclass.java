package rahul.assignment.data;

public class Dataclass {
	int input1;
	char input2;
	public void printGlobalData() {
		System.out.println("Global Data: input1:"+input1+" "+"input2:"+input2);
	}
	public void printLocalData() {
		int input3;
		char input4;
//		System.out.println("Local Data: input1:"+input3+" "+"input2:"+input4);
		
//		local variables which are not initialized does not get any default values.
	}

}
