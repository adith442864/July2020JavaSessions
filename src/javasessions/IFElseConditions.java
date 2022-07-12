package javasessions;

public class IFElseConditions {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		if(a==b) {
			System.out.println("they are equal");
		} 
		else {
			System.out.println("they are not equal");
		}
		
		//dead code:
		if(false) {
			System.out.println("hi");
		}
		
		else {
			System.out.println("bye");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		int number=100;
		
		if(number<=100) {
			if(number>=90) {
				System.out.println("GRADE A");
			}
			
			if(number>=75) {
				System.out.println("GRADE B");
			}
		}else {
			System.out.println("invalid number");
		}
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			System.out.println("launching chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launching firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launching safari");
		}
		else if(browser.equals("IE")) {
			System.out.println("launching IE");
		}
		else {
			System.out.println("please pass the correct browser");
		}
		
		
		
		
		
		
		

	}

}
