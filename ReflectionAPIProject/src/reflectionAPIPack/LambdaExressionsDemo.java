package reflectionAPIPack;

/*
 * Functional Interface => an interface with a single method
 * Ex: Runnable
 */

interface IFunctional{
	
	int absFunction(int x);
	
}


public class LambdaExressionsDemo {
	
	public static void main(String[] args) {
		IFunctional obj = (int x)->{return x*3;};
		
		System.out.println(obj.absFunction(4));
//		LambdaExressionsDemo l = new LambdaExressionsDemo();
//		l.absFunction(4);
	}

//	@Override
//	public void absFunction(int x) {
//		System.out.println(3 * x);
//		
//	}
}
