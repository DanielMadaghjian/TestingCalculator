package com.example.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTests {
	@Test
	public void testIsValidExpression() {	
		String input = "";
		
		//test correct expression
		input = "12435+34569-12345*10+50";
		assertEquals( "Checking correct expression", 0, App.isValidExpression(input) ); 
		
		//test empty expression
		input = " ";
		assertEquals( "Checking empty expression",1, App.isValidExpression(input) );
		
		//test single value
		input = "3";
		assertEquals("Checking single value", 0, App.isValidExpression(input));
		
		//test operator at the beginning
		input = "+5-7*5";
		assertEquals( "Checking operator at the start", 1, App.isValidExpression(input) );
		
		//test operator at the end
		input = "5-7*5+";
		assertEquals( "Checking operator at the end",1, App.isValidExpression(input) );
		
		//test double operator
		input = "5-7*5++4 ";
		assertEquals( "Checking double operator",1, App.isValidExpression(input) );
		
		//test unknown character
		input = "10/2 + f";
		assertEquals("Checking unknown character",2, App.isValidExpression(input));
		
		//test decimal values
		input = "3.5*6+10.2";
		assertEquals("Checking decimal values",3, App.isValidExpression(input));
		
		//test leading zeros
		input = "3+067-56";
		assertEquals("Checking leading zero",4, App.isValidExpression(input));	
	}
}
