import java.util.Calendar;
import java.util.GregorianCalendar;

public class StepsToMiles {
	// I'll start my code with our private variables: name, feet and inches
	private String name;
	private double feet;
	private double inches;

	
	public StepsToMiles() {
		/** We initialize our private variables in the default constructor 
		 * StepsToMiles(). To do so, we assign name (a string)  with null 
		 * and -1 for feet and inches with are numeric */
		name = null;
		feet = -1;
		inches = -1;
	}
	
	public StepsToMiles(String setName, double setFeet, double setInches) {
		/** In StepsToMiles(String setName, double setFeet, double setInches)
		 * we use the set method to re-define our private member variables */
		name = setName;
		feet = setFeet;
		inches = setInches;
	}
	
	/** The next six functions are simple enough. The get method returns the 
	 * value of the variable name. The set method takes a parameter and 
	 * assigns it to the name variable */
	public double getFeet() { 
		return feet; 
		}
	
	public double getInches() { 
		return inches; 
		}
	
	public String getName() { 
		return name;
		}
	
	public void setName(String name) { 
		this.name = name; 
		}
	
	public void setFeet(double feet) { 
		this.feet = feet; 
		}
	
	public void setInches(double inches) { 
		this.inches = inches; 
		}
	
	/** For the function height_inches we need to initialize a double (in 
	 * this instance I call it height_i) for the function value and covert 
	 * a given number of feet and inches in to solely inches. Well, 1 foot 
	 * = 12 inches. Knowing this, we can multiply the given feet into inches 
	 * and add the given inches to get hieght_inches */
	public double height_inches() {
		double height_i;
		// We use getFeet to return feet & likewise for getInches
		height_i = (getFeet() * 12) + getInches();
		return height_i;
	}
	
	/** The process we undergo for strideLength_inches is much like what I 
	 * described in height_inches above. We create a variable (in this case 
	 * a double) for the function value and use a formula to find the 
	 * function value */
	public double strideLength_inches() {
		double strideLength_i;
		strideLength_i = ((getFeet() * 12) + getInches()) * 0.413; 
		return strideLength_i ;
	}
	
	/** A bit repetitive, but like the two functions above we need to create 
	 * a variable (another double in this case) and manipulate a function 
	 * using our parameters to find the correct value */
	public double miles(int steps) {
		// This function is a little different because it involves step, a 
		// user-prompted input that is not included as a private variable
		double mi = ((((getFeet() * 12) + getInches()) * 0.413) * (steps)) / (12 * 5280);
		return mi;
	}
	
	/** Now for our next function, currDate() we use the Gregorian Calendar
	 * to get the day, month, and year. Another thing we have to take into 
	 * account for this is HOW exactly we want to return this function.
	 * Unlike miles, strideLength_inches and height_inches, currDate() is a
	 * STRING. We need to format it as such: mm/dd/yyyy */
	public String currDate() {
		Calendar calendar = new GregorianCalendar();
		// I will obtain the day, month, and year using the get method
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		// I will format these ints to strings so I can combine them into
		// one final string
		String str7 = String.format("%d", year);
		String str8 = String.format("%d", month);
		String str9 = String.format("%d", day);
		// I will now create our return string. Again, I need to return it
		// in the form mm/dd/yyyy so in this return string I also include 	 
		// slash marks
		String CD = "" + str8 + "/" + str9 + "/" + str7;
		return CD;
	}
	
	/** For our final function, formatAsString, we conjoin all of our 
	 * previous functions. We also need to include the requirements
	 * given in the rubric: column widths of 13 characters, and 
	 * precision 2 and the thousands comma */
	public String formatAsString(int steps) {
		// %13 for the width, & %.2 for float precision
		String str1 = String.format("%13s: %s%n", "Name", getName());
		String str2 = String.format("%13s: %.2f' %.2f\"%n", "Height", getFeet(), getInches());
		String str3 = String.format("%13s: %.2f%n", "Stride", strideLength_inches());
		String str4 = String.format("%13s: %,d%n", "Steps", steps);
		String str5 = String.format("%13s: %.2f miles%n", "Walk", miles(steps));
		// Now comes the result string, made by simply adding the other 
		// strings together and return it and we are finished with our
		// StepsToMiles class
		String result = str1 + str2 + str3 + str4 + str5;
		return result;
	}
	
}
