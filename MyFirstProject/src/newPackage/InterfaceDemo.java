package newPackage;

public class InterfaceDemo extends TestClass implements IDemoInterface, IDemoInterface2{

	@Override
	public void printInfo() {
		System.out.println("Method from interface1");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.printInfo();
		id.info();
		
	}
	
}
