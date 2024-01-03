//Assignment 1.3 and 1.4


//Array
//datatype to store multiple values of the same type
//length has to be defined at the time of initialization of array
//index based searching and retrieval


//String
// class in java which represents a collection/sequence of characters
//methods like length, indexOf, toUpperCase etc are commonly used inbuilt string methods


//loops and decision making
//loops are used to iterate the same code until a certain condition or criteria is fulfilled
//common usage include traversing arrays
//decision making includes combination of if else or switch statements to do specific tasks given a certain circumstance

public class StringsAndArrays {

	public static void main(String[] args) {
		String[] employeeNames = {"Arun" , "Shubham"};
		
		//retrieve element of array
		System.out.println("0th employee of ISS is " + employeeNames[0]);
		
		//replace / change element
		
		employeeNames[0] = "Chirag";
		
		System.out.println("0th employee after replacement " + employeeNames[0]);

		//looping the array aka traversing the array
		for (int i = 0; i < employeeNames.length; i++) {
			System.out.println("employee number " + i + " is " + employeeNames[i]);
		}
		
		//string length method
		System.out.println("length of employee 0 name " + employeeNames[0].length());
		
		//indexOf method
		System.out.println("index of h letter in employee 0s name " + employeeNames[0].indexOf("h")  );

		
//		only print employee index 1 name
		System.out.println("conditonal printing");
		for (int i = 0; i < employeeNames.length; i++) {
			if(i == 1)
				System.out.println("employee number " + i + " is " + employeeNames[i]);
	
	}
	}
}
