package pack1;

public class ExplicitThrow {

	public static  void throwEx(){
		
		try{
		   // If a condition is not satisfied	
			throw  new ArithmeticException("arith");
		}catch (ArithmeticException aex ){
			System.out.println("This is thrown inside throwEx ");
			throw aex;
		}
	}
	
	public static void main(String...args){
		
		try{
			System.out.println("The following happens inside the main()");
			System.out.println("Calling throwEx will throw 'aex' out of the method and'");
			throwEx();
		}catch(ArithmeticException aex){
			System.out.println("aex is now catch inside main()'s catch");
			System.out.println("The exception is "+ aex);
		}
		
	}
}
