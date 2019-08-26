package rahul.assignment.main;

import rahul.assignment.data.Dataclass;
import rahul.assignment.singleton.Singletonclass;

public class Mainclass {

	public static void main(String[] args) {
		Dataclass ds =new Dataclass();
		ds.printGlobalData();//		global variables which are not initialized can get default values.
		ds.printLocalData();//		local variables which are not initialized does not get any default values.
		Singletonclass.method("good morning").print();//static methods can only access static variables.
		
	}

}
