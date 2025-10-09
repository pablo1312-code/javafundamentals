package basics;

import java.net.Authenticator;

public class OperatorsTest {
	
	public static void main(String[]args) {
		
		arithmeticOperationTest();
		unaryOperatorsTest();
		//assignment operators test
		assignmentOperatorsTest();
			
	}

	private static void assignmentOperatorsTest() {
		int number1 = 3; 
		int number2 = 20;
		float result = number1+ number2; 
		System.out.println(result);
		result+= number1;//result = result+ number 1
		System.out.println(result);
		result /= number1;//result = result / number1;
		System.out.println(result);
		// TODO Auto-generated method stub
		
	}

	private static void unaryOperatorsTest() {
		/**
		 * Unary plus(positive value)
		 * Increment(pre/post)
		 * Decrement(pre/post)
		 * Logical NOT
		 * Bitwise complement
		 */
		int num1 = -234;
		num1++;//increment
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		/**
		 * In this case, the compiler first print the value of the variable,
		 * then add 1 to variable,as if they were two lines of code like 
		 * the following:
		 * System.out.println(num1);
		 *num1 = num1 + 1;
		 */
		
		System.out.println(num1++);
		num1--;
		--num1;
		
	}

	private static void arithmeticOperationTest() {
		//declaring three integer variables 
		int num1= 5,num2,num3= 50;
		num1= 3;
		System.out.println(num1);
		num2= 3;
		int result;
		/**
		 * 1 Se leen los valores de los operandes del lado derecho 
		 * 2 Se realiza la operacion con los operandes 
		 * 3 Se asigna el resultado de la operacion a la variable al lado
		 * izquierdo
		 */
		result= num1+num2;
		System.out.println("the result is " + result); 
		
		//substraction 
		result=result-num3;
		System.out.println("the result is " + result); 
		//multiplication
		result=result* 2;
		System.out.println("the result is " + result); 
		//division 
		result= result/ 2;
		System.out.println("the result is " + result); 
			// TODO Auto-generated method stub
		
	}

}
