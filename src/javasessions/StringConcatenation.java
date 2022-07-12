package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String s = "hello world";
		String s1 = "100";
		String ph = "988989833";
		String cc = "1234 3433 1234 5678";
		
		String x="Hello";
		String y = "Testing";
		
		int a=100;
		int b=200;
		
		System.out.println(a+b); //addition
		System.out.println(x+y); //concat operator
		
		System.out.println(x+a);
		System.out.println(a+x);
		System.out.println(a+b+x+y); //300HelloTesting
		System.out.println(x+y+a+b); //HelloTesting100200
		System.out.println(x+y+(a+b)); //HelloTesting300
		
		
		System.out.println(x+y+a+b+a+b); //HelloTesting100200100200
		System.out.println("the value of a :" +a);
		System.out.println("the value of b :" +b);
		System.out.println("the sum :" +(a+b));
		
		System.out.println(x +" "+y);
		
		
		double c = 12.33;
		double d = 23.44;
		
		System.out.println(x+y+c+d); //HelloTesting12.3323.44
		
		char c1='a'; //97
		char c2='b'; //98
		
		System.out.println(c1+c2); //195 (ascii)
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println(c1+" "+c2);
		

	}

}

