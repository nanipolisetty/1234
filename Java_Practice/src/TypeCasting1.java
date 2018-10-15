class Parent{
	
	void show(){
		System.out.println("parent class show method");
		}
	void display(){
		System.out.println("parenet class display method");
	}
}
class Child extends Parent{
		void show(){
		System.out.println("child class show method");
		}		
	     void print(){
		System.out.println("child class print method");	
	}
	}	

public class TypeCasting1 {
public static void main(String[] args) {
//Child c = new Child();
//c.show();
//c.display();
//c.print();

// up casting
	// if a child class object is referred by parent class reference variable then it is called UC.

/*Parent p=new Child();
p.show();
p.display();*/
//p.print();

	
	// down casting 
	//If a parent class object is refered by child class reference variable then  it is called as DC.
Child c=(Child)new Parent();
c.show();
c.print();
c.display();
}
}
