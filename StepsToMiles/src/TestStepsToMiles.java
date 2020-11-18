import java.util.Scanner;
public class TestStepsToMiles {

	public TestStepsToMiles() {
		/** Empty constructor. Will show up in UML diagram */
	}
	
	/** In the main function of the TestStepsToMiles we test our two instances:
	 * Jane and John Doe. */
	public static void main(String[] args) {
		
		/* For each instance we need to prompt the user for their name, height. 
		 * I'll then output the date and ask for how many steps they want to 
		 * take. Finally, I'll call formatAsString and we'll be finished */
		System.out.printf("Enter Name: ");
		System.out.printf("\n");
		System.out.printf("Enter Height (ft and in): ");
		System.out.printf("\n");
		//Beginning John Doe
		StepsToMiles stm1 = new StepsToMiles("John Doe", 6, 1.1);
		System.out.printf("Today's Date: " + stm1.currDate());
		System.out.printf("\n");
		System.out.printf("Input the number of steps you want to take: ");
		// We need to prepare for a user input so we use scanner to give steps 
		// a value
		Scanner input = new Scanner(System.in);
		int steps = input.nextInt();
		System.out.printf(stm1.formatAsString(steps));
		System.out.printf("\n");
		
		// Beginning of Jane Doe instance
		System.out.printf("Enter Name: ");
		System.out.printf("\n");
		System.out.printf("Enter Height (ft and in): ");
		System.out.printf("\n");
		// Now, as prompted in the assignment rubric we need to use the set 
		// method for the second instance
		stm1.setName("Jane Doe");
		stm1.setFeet(5);
		stm1.setInches(4.5);
		System.out.printf("Today's Date: " + stm1.currDate());
		System.out.printf("\n");
		System.out.printf("Input the number of steps you want to take: ");
		// Now since I'm sure Jane wants her own value for steps, we prompt 
		// her to input something new
		steps = input.nextInt();
		System.out.printf(stm1.formatAsString(steps));
		System.out.printf("\n");
		// Since this is the last instance for us we are now done with out 
		// TestStepsToMiles class
	}
	}


