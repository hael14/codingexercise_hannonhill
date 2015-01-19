package com.hannonhill.secret;

import java.util.HashSet;
import java.util.Set;

/**
 *  This predicate class evaluates if Secret with prime number less than N will have an additive function
 * @author TheresaLeah
 *
 */
public class EvaluatePredicate {
	
	public void evaluate(Secret func) {
		Set<Integer> computedSet = new HashSet<Integer>();	
		System.out.println("Prime numbers until  "+ func.getLimit() + ":  " + func.getPrimes());
		
		for (int y : func.getPrimes()) {
			for (int x: func.getPrimes()) {
				if (x== y) continue; 
				int xysum  = func.secret(x) + func.secret(y);
				int sum = func.secret(x + y);
				
				// we need to store already computed combinations of prime numbers
				if (  !computedSet.contains(xysum) )
					computedSet.add(xysum);
				else
					continue;
				
				if (func.isPrime(xysum) && sum == xysum){
					System.out.println(" secret(" + y + " + " + x + ") = secret("+x+") + secret("+y+") is an additive function");
				}
				else {
					System.out.println(" secret(" + y + " + " + x + ") = secret("+x+") + secret("+y+") is NOT an additive function because " + xysum + " is not prime.");
				}
			}
		}
	}
	
}
