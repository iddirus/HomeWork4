package methods;

public class LearnMethods {

	public static void main(String[] args) {
		System.out.println("welcome to my methods");
		System.out.println("***********non return type without parameter************");
		LearnMethods learnmethods = new LearnMethods();
		learnmethods.doGym();
		learnmethods.getFlightTicket();
		learnmethods.doShopping();
		LearnMethods.getAge();
		LearnMethods.doPractice();
		System.out.println("**********Non return type with parameter*****************");
		LearnMethods.getName("Iddir");
		LearnMethods.getEmployeeInfo(100, "Jhon", "NY", "Jhon@gmail.com");
		learnmethods.doCarMaintenance("Synthetic", 65);
		learnmethods.haveDinner("8 pm", "Home", "mahmud");
		learnmethods.runBusiness(500000, "IT");
		System.out.println("******** Return type method without parameter******************");
		learnmethods.getPizza();
		LearnMethods.orderFood();
		learnmethods.getHousePrice();
		LearnMethods.PrintSumOfTwoNumbers();
		learnmethods.doGroupStudy();
		System.out.println("***********return type method with parameter**********************");
		LearnMethods.doMultiplication(45, 12);
		learnmethods.getDailySalary(50.75, 9.1);
		LearnMethods.getWeeklySalary(450.23);
		learnmethods.getStudentInformation("Iddir", "NJ", "Iddir@gmail.com");
		LearnMethods.assignTask("Done", 10.25);
		System.out.println("this is a good bye from my method ");

	}

	// A. Non return type method without parameter

	public void doGym() {
		System.out.println("this is do gym method");
	}

	public void getFlightTicket() {
		System.out.println("this is get flight ticket method");
	}

	public void doShopping() {
		System.out.println("this is do shopping method");

	}

	public static void getAge() {
		System.out.println("this is get age method");
	}

	public static void doPractice() {
		System.out.println("this is do practice method");
	}

	// B.Non return type method with parameter

	public static void getName(String name) {
		System.out.println("my name is " + name);
	}

	public static void getEmployeeInfo(int employeeId, String employeeName, String employeeAddress,
			String employeeEmail) {
		System.out.println(" Employee Id :" + employeeId + " Employee name is " + employeeName + " Employee Address :"+ employeeAddress + " Employee Email :" + employeeEmail);
	}

	public void doCarMaintenance(String oilChangeType, int oilChangePrice) {
		System.out.println("Oil change type :" + oilChangeType + " Oil change price :" + oilChangePrice);
	}

	public void haveDinner(String dinnerTime, String dinnerLocation, String dinnerGuest) {
		System.out.println(" Dinner time is at " + dinnerTime + " Dinner location is :" + dinnerLocation+ " Dinner guest is :" + dinnerGuest);
	}

	public void runBusiness(int businessCost, String businessType) {
		System.out.println(" Business Cost : " + businessCost + " Business type is : " + businessType);
	}

	// C. Return type method without parameter

	public int getPizza() {
		int pizzaPrice = 25;
		int pizzaQuantity = 12;
		int totalPayment = pizzaPrice * pizzaQuantity;
		System.out.println("total to pay is " + totalPayment);
		return totalPayment;
	}

	public static String orderFood() {

		String foodType = "chineese";
		System.out.println("food type is " + foodType);
		return foodType;
	}

	public double getHousePrice() {
		double squareFeet = 1200.45;
		double squareFeetPrice = 250.25;
		double housePrice = squareFeet * squareFeetPrice;
		System.out.println("House price is " + housePrice);
		return housePrice;
	}

	public static int PrintSumOfTwoNumbers() {

		int num1 = 45;
		int num2 = 19;
		int sum = num1 + num2;
		System.out.println("Summation of two numbers is " + sum);
		return sum;
	}

	public String doGroupStudy() {
		String time = "5pm";
		System.out.println("group study is for monday at " + time);
		return time;
	}

	// D. Return type method with parameter

	public static int doMultiplication(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		int output = num1 * num2;
		System.out.println("Multiplication of two numbers is " + output);
		return output;
	}

	public double getDailySalary(double hourlyPay, double totalHours) {
		double perHourpay = hourlyPay;
		double hours = totalHours;
		double dailysalary = perHourpay * hours;
		System.out.println("daily salaty is " + dailysalary);
		return dailysalary;
	}

	public static double getWeeklySalary(double dailySalary) {
		double weeklySalary = dailySalary * 5;
		System.out.println("Monthly salary is " + weeklySalary);
		return weeklySalary;
	}

	public String getStudentInformation(String stName, String stAddress, String stEmail) {
		System.out.println("Student name  " + stName + " student Address is " + stAddress + " student email " + stEmail);
		System.out.println("student name " + stName);
		return stName;
	}

	public static String assignTask(String homeWorkStatus, double submissionTime) {
		System.out.println("homeWork is " + homeWorkStatus + " submissin time is " + submissionTime);
		System.out.println("homeWork " + homeWorkStatus);
		return homeWorkStatus;
	}

}
