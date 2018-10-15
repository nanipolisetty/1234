package testcases;

class  Sample2{
	
	
	public static void main(String[] args) {
	String[] ab=args;
	for (String x:ab){
		
		System.out.println(x);
		
	}
		
		System.out.println("main method of class Sample1");
	}

}

public class Sample1{
	
	public static void main(String[] args) {
	Sample2 s= new Sample2();	
	String[] x= {"xasda","djasjsda","shagdsjk"};
	
	s.main(x);
	
	}
	
}
