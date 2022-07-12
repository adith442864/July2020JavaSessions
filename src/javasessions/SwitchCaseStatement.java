package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		//break cannot be used with else if condition...
		
		String browser = " CHROME ";
		
		switch (browser.toLowerCase().trim()) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "Edge":
			System.out.println("launch Edge");
			break;

		default:
			System.out.println("please pass the right browser name....");
			break;
		}
		
		
		int marks=10;
		switch (marks) {
		case 100:
			System.out.println("GRADE A");
			break;
		case 90:
			System.out.println("GRADE B");
			break;
		case 70:
			System.out.println("GRADE C");
			break;
		
		default:
			System.out.println("FAIL");
			break;
		}
		
		//
//		int num=10;
//		switch (num<=10) {
//		case num<=10:
//			
//			break;
//
//		default:
//			break;
//		}
		
		String env = "qa";
		switch (env) {
		case "qa":
			System.out.println("qa environment");
			break;
		case "dev":
			System.out.println("dev environment");
			break;
		case "uat":
			System.out.println("uat environment");
			break;
		case "prod":
			System.out.println("prod environment");
			break;

		default:
			System.out.println("please pass the right environment");
			break;
		}
		
		// < <= >= > == !=
		double d1 = 12.33;
		double d2 = 23.33;
		
		if(d1==d2) {
			
		}
		
		boolean flag = true;
		if(!flag) {
			System.out.println("BYE");
		}else {
			System.out.println("PASS");
		}
		
		
		String name = "Test";
		
		switch (name) {
		case "Harsh":
			System.out.println("100 Marks");
			break;
		case "Ravi":
			System.out.println("90 Marks");
			break;
		case "Naveen":
			System.out.println("700 Marks");
			break;
		case "Vicky":
			System.out.println("60 Marks");
			break;

		default:
			System.out.println("name not found...." +name);
			break;
		}
		
		int mark = 91;
		// boolean flag = true;
		switch (mark) {
		case 91:
			System.out.println("Science");
			break;

		case 80:
			System.out.println("Comm");
			break;

		case 70:
			System.out.println("Arts");
			break;

		default:
			System.out.println("FAILED....");
			break;
		}
		
		String emp = "Naveen";
		int salary = 0;
		switch (emp) {
		case "Naveen":
			salary = 20;
			break;
		case "Sharath":
			salary = 80;
			break;
		case "Monika":
			salary = 90;
			break;

		default:
			System.out.println("emp is not found....");
			break;
		}
		
		System.out.println("emp : " + emp + " having salary : " + salary);
		
		

	}

}
