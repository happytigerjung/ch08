package ch08;

public class InterImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		impl.method1();
		impl.method2();
		ImClassChild implChild = new ImClassChild();
		
		implChild.method1();
		implChild.method2();
		implChild.method3();
		
		

	}

}
