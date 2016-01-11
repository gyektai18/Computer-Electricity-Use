import java.util.Scanner;

public class ElectricityComp


{

	public static void main(String[] args)
	{
		

		int allComputerCost;
		Scanner initCost = new Scanner(System.in);
		System.out.println("What was the cost of your Computer?");
		allComputerCost = initCost.nextInt();
		System.out.println(allComputerCost);
		
		int screenSize;
		Scanner inchScreen = new Scanner(System.in);
		System.out.println("What is the size of your screen in inches?");
		screenSize = inchScreen.nextInt();
		System.out.println(screenSize);
	
		int sizeHardDrive;
		Scanner HardDrive = new Scanner(System.in);
		System.out.println("How large is your Hard Drive?");
		sizeHardDrive = HardDrive.nextInt();
		System.out.println(sizeHardDrive);
		
		int mouseCost;
		Scanner costMouse = new Scanner(System.in);
		System.out.println("How much did your mouse cost?");
		mouseCost = costMouse.nextInt();
		System.out.println(mouseCost);
		
		int lengthComputerIsKept;
		Scanner yearsKept = new Scanner(System.in);
		System.out.println("How many years will you keep your computer?");
		lengthComputerIsKept = yearsKept.nextInt();
		System.out.println(lengthComputerIsKept);
		
		int hoursPerDay;
		Scanner dailyHours = new Scanner(System.in);
		System.out.println("How many hours will you use the Computer each Day?");
		hoursPerDay = dailyHours.nextInt();
		System.out.println(hoursPerDay);

		String brandCPU;
		Scanner CPU = new Scanner(System.in);
		System.out.println("What CPU are you using?");
		brandCPU = CPU.nextLine();
		System.out.println(brandCPU.toLowerCase());
		
		
		
		
		
		
		
		
		
		
	}
}
