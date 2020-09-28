package com.cg;
import java.util.*;
import java.util.regex.*;

public class PinCode {
	public static void PincodeValidator(String input) {
		String regex = "^(?<![0-9])[0-9]{6}(?![0-9])";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Pincode Validated");
		}
		else {
			System.out.println("Pincode Not Validated");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to pincode Problem!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pincode : ");
		String pincode = sc.nextLine();
		PincodeValidator(pincode);
	}
}
