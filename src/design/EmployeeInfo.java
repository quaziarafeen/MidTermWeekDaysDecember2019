package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	public final static String companyName= "PnT";





	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

	int employeeID;
	String employeeName;
	public EmployeeInfo(int employeeId) {

		this.employeeID = employeeId;
		System.out.println("Employee ID is: " + employeeId);

	}

	public EmployeeInfo(String name, int employeeId) {

		this.employeeName = name;
		System.out.println("Name is: " + name + " and ID is: " + employeeId);


	}

	void benefits() {
		System.out.println("there are benefits in employee info class");
	}

	void employeebenefits(){
		benefits();

		super.benefits();
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(int numberOfYearsWithCompany, double salary, String performance) {

		double bonus;
		double total;
		switch (performance) {
			case "best":
				bonus = salary * 0.1;
				break;
			case "average":
				bonus = salary * 0.08;
				break;
			case "poor":
				bonus = salary * 0.06;
				break;
			default:
				bonus = salary * 0.04;
		}

		if(numberOfYearsWithCompany >= 20) {
			total = bonus * 1.50;
		} else if(numberOfYearsWithCompany >= 10) {
			total = bonus * 1.25;
		} else {
			total = bonus * 1;
		}
		System.out.println("Employee bonus is: " + total);
		return total;
	}




	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension(int salary) {

		double total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);


		String startYear=convertedJoiningDate.substring(convertedJoiningDate.length()-4,convertedJoiningDate.length());
		String currentYear=convertedTodaysDate.substring(convertedTodaysDate.length()-4,convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);


		total = salary * (current-start) * 0.05;

		System.out.println("Employee Pension is = $ " +total);

		return total;





		//implement numbers of year from above two dates
		//Calculate pension


		//     return total;
	}

	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate  + extractMonth[1];

			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}

}
