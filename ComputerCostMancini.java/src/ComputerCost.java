import java.util.*;
import java.util.Scanner;

public class ComputerCost


{

	public static void main(String[] args)
	{
		//scanner used for finding if it is a laptop or a desktop
		//useful to know if there is a battery for the computer
		String laptopComp;
		int laptopBatt = 0;
		Scanner laptopOrComp = new Scanner(System.in);
		System.out.println("Is your computer a laptop or a desktop?");
		laptopComp = laptopOrComp.nextLine();
		if (laptopComp.equalsIgnoreCase("Laptop")){
			laptopBatt = 33;
		}

		//scanner used for finding the initial cost of the computer
		int allComputerCost;
		Scanner initCost = new Scanner(System.in);
		System.out.println("What was the cost of your Computer?");
		allComputerCost = initCost.nextInt();
		
		//scanner used for finding the size of the screen
		int screenSize;
		Scanner inchScreen = new Scanner(System.in);
		System.out.println("What is the size of your screen in inches?");
		screenSize = inchScreen.nextInt();
		int screenElecW = 0;
		//creating a hash map with numbers would get comfusing, so if statements suffice
		if (screenSize == 15) {
			screenElecW = 18;
		}
		else if (screenSize == 17) {
			screenElecW = 20;
		}
		else if (screenSize == 19) {
			screenElecW = 22;
		}
		else if (screenSize == 20) {
			screenElecW = 26;
		}
		else if (screenSize == 21) {
			screenElecW = 30;
		}
		else if (screenSize == 22) {
			screenElecW = 40;
		}
		else if (screenSize == 24) {
			screenElecW = 50;
		}
		else if (screenSize == 30) {
			screenElecW = 60;
		}
		else if (screenSize == 32) {
			screenElecW = 70;
		}
		else if (screenSize == 37) {
			screenElecW = 80;
		}
		else if (screenSize == 42) {
			screenElecW = 120;
		}
		else if (screenSize == 50) {
			screenElecW = 150;
		}
		
		//scanner used for finding the size of the hard drive
		double sizeHardDrive;
		Scanner hardDrive = new Scanner(System.in);
		System.out.println("Is your Hard Drive 2.5 or 3.5 inches?");
		sizeHardDrive = hardDrive.nextDouble();
		double hardDriveElec;
		if (sizeHardDrive == 2.5){
			hardDriveElec = 1.85;
		}
		else if (sizeHardDrive == 3.5){
			hardDriveElec = 7.75;
		}
		else {
			System.out.println("You should've just rounded to 2.5 or 3.5.");
		}
		
		//scanner used for finding the cost of the mouse
		int mouseCost;
		Scanner costMouse = new Scanner(System.in);
		System.out.println("How much did your mouse cost?");
		mouseCost = costMouse.nextInt();
		
		//scanner used for finding how long the user will keep the computer
		int lengthComputerIsKept;
		Scanner yearsKept = new Scanner(System.in);
		System.out.println("How many years will you keep your computer?");
		lengthComputerIsKept = yearsKept.nextInt();
		
		//scanner used for finding the hours the user uses their computer each day
		int hoursPerDay;
		Scanner dailyHours = new Scanner(System.in);
		System.out.println("How many hours will you use the Computer each Day?");
		hoursPerDay = dailyHours.nextInt();

		//scanner used for finding the CPU
		String brandCPU;
		Scanner CPU = new Scanner(System.in);
		System.out.println("What CPU are you using?");
		brandCPU = CPU.nextLine();
		int CPUW = 0;
		//I didn't want to create another hash map, so if statements work well enough
		if (brandCPU.equalsIgnoreCase("Intel Core i3")){
			CPUW = 62;
		}
		else if (brandCPU.equalsIgnoreCase("Intel Core i5")){
			CPUW = 84;
		}
		else if (brandCPU.equalsIgnoreCase("Intel Core i7")){
			CPUW = 86;
		}
		else if (brandCPU.equalsIgnoreCase("Intel Core i7-E")){
			CPUW = 140;
		}
		else if (brandCPU.equalsIgnoreCase("AMD 2 Cores")){
			CPUW = 80;
		}
		else if (brandCPU.equalsIgnoreCase("AMD 4 Cores")){
			CPUW = 95;
		}
		else if (brandCPU.equalsIgnoreCase("ADM 8 Cores")){
			CPUW = 110;
		}
		else {
			System.out.println("Choose between the Intel Core i3, i5, i7, the fancy i7-E,"
					+ " or the AMD with 2, 4 or 8 cores."
					+ "That probably should've been specified.");
		}
			
		//scanner used for finding if the mouse needs batteries
		String mouseBatteries;
		Scanner batteriesForMouse = new Scanner(System.in);
		System.out.println("Does your Mouse Need Batteries?");
		mouseBatteries = batteriesForMouse.nextLine();
		double mouseBattCostYr = 0;
		double mousePowerCostW = 0;
		if (mouseBatteries.equalsIgnoreCase("yes")){
			mouseBattCostYr = 9.23;
		}
		else if (mouseBatteries.equalsIgnoreCase("no")){
			mousePowerCostW = .5;
		}
		else {
			System.out.println("It was a yes or no question. You messed that up.");
		}
		
		//scanner used for finding what ram the user has
		String ram;
		Scanner ramDDR = new Scanner(System.in);
		System.out.println("Are you using a DDR1, DDR2, or DDR3 RAM?");
		ram = ramDDR.nextLine();
		double ramW;
		if (ram.equalsIgnoreCase("DDR1")){
			ramW = 4.75;
		}
		else if (ram.equalsIgnoreCase("DDR2")){
			ramW = 3.75;
		}
		else if (ram.equalsIgnoreCase("DDR3")){
			ramW = 2.5;
		}
		else {
			System.out.println("You should've typed what I told you to."
					+ "It would've made your life easier");
		}
		
		//scanner used for finding the state the user lives in
		String state;
		Scanner stateIn = new Scanner(System.in);
		System.out.println("What is the abbreviation of the State you live in?");
		state = stateIn.nextLine();
		
		//this hash map is useful for the many states and their electricity costs
		HashMap states = new HashMap();
		states.put("MA", new Double(15.34));
		states.put("NY", new Double(16.25));
		states.put("WA", new Double(7.15));
		states.put("HA", new Double(33.53));
		
		//this code here was copied from the internet
		//the hashmap wouldn't work without it
		Set set = states.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	    Object stateCost;
	    stateCost = states.get(state);
	    Double stateCostReal = (Double) stateCost;
	    //to change the object to a double
		double kWh = hoursPerDay * CPUW + hoursPerDay * mousePowerCostW + hoursPerDay * screenElecW;
		double allElecCostYr = stateCostReal * (kWh + mouseBattCostYr + laptopBatt)  / 1000;
		double allElecCostAllYrs = allElecCostYr * lengthComputerIsKept;
		//the final math to end it all
		System.out.println("Final Cost is " + allElecCostAllYrs);
		//the user has to know the amount somehow, and printing it works
				
		
		
	}
}
}