package algorithim;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		float temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature in fahrenheit:- ");
		temp=sc.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("Temperature in Celsius:- "+temp);
	}
}
