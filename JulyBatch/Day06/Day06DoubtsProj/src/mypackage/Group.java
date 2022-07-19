package mypackage;

import java.util.Scanner;

//WAP to store a group of objects into an array and retrieve the 
//object data and display.
class Employee{
	//instance variables
	int id;
	String name;
	
	//to store data
	Employee(int i, String n){
		this.id=i;
		this.name=n;
	}
	void displayData() {
		System.out.println(id+"  "+name);
	}
}

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Employee arr[]=new Employee[5];
		
		//arr[0]=20;//error
		//arr[0]= {1,"Jay"};//error
		//arr[0]=new Employee(101,"jay");//it works
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter Data of "+(i+1)+" Employee:");
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			
			System.out.println("Enter Name:");
			String name=sc.next();
			
			arr[i]=new Employee(id,name);
		}
		
		System.out.println("\nThe employee data is:");
		//display the Employee data from the array
		for(int i=0;i<5;i++) {
			arr[i].displayData();
		}
	}

}
