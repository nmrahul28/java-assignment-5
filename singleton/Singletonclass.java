package rahul.assignment.singleton;

public class Singletonclass {
	String str;
	
	Singletonclass(String otherStr){
		str=otherStr;
	}
	
	public static Singletonclass method(String s) {
		Singletonclass sc=new Singletonclass(s);
		return sc;
	}
	public void print() {
		System.out.println(str);
	}
}
