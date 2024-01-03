

//Assignment 1.5

//OOPS
//1. inheritance - one class extends other class. inherits the properties and methods of parent class
//method over riding is possible by having same name method in child class but different implementation.
//method overriding is a type of polymorphism

//2. encapsulaton- refers to keeping similar code similar data,methods together,bound.
//classes are a way of representing encapsulation as the methods and properties related to a single entity is clubbed together and kept
//spearate to the rest of the program

//3. abstraction - hiding the implementation details from viewer. using abstract classes and interfaces.

//4. polymorphism - refers to many forms during implementation. 2 major types of polymorphism 
//runtime - the method to be used can only be decided during runtime eg. method over riding
//compile time - the method to be used is decided in compile time since all information is available at compile time. eg. method overloading

package com.demo;

public class PrinciplesOfOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Chirag" , 20);
		Employee emp2 = new Analyst("Arun" , 20 , 1 , "Training");
		
		emp1.Task();
		emp2.Task();
	}

}


class Employee{
	String name;
	int age;
	
	Employee( String name , int age){
		this.name = name;
		this.age = age;
	}
	
	void Task() {
		System.out.println("Employee is doing task");
	}
}

class Analyst extends Employee{
	
	int team;
	String projectName;
	
	Analyst( String name , int age , int team , String projectName) {
		super(name , age);
		this.team = team;
		this.projectName = projectName;
	}
	
	void Task() {
		System.out.println("Analyst is doing task");
	}
}
