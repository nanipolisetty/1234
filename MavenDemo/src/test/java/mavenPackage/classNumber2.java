package mavenPackage;
import java.io.*;
public class classNumber2 {
void addition(int x, int y){
		int total= x+y;
		System.out.println("sum of a and b ="+ total);
	}	
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter value of a:");
	int a=Integer.parseInt(br.readLine());
System.out.println("Enter the value of b:");
int b=Integer.parseInt(br.readLine());
classNumber2 bb=new classNumber2();
bb.addition(a, b);

}
}


