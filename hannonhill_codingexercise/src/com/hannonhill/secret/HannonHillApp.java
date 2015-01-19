package com.hannonhill.secret;

/**
 * Our main class
 * @author TheresaLeah
 *
 */
public class HannonHillApp {
	
	public static void main(String args[]) {
		
		// Secret  takes an N limit of prime numbers
		Secret secret= new Secret(20);
		EvaluatePredicate pred = new EvaluatePredicate();
		
		// Will evaluate additive functions given all the prime numbers
		pred.evaluate(secret);
		
	}

}
