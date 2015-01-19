package com.hannonhill.secret;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Contains secret() function 
 * @author TheresaLeah
 *
 */
public class Secret {

	private boolean[] primeMatrix;	
	private List<Integer> primes;
	private int limit;

	public Secret(int limit) {
		this.limit = limit;
		primeMatrix = new boolean[limit*2]; // multiplied by 2 since maximum summation of prime numbers is 38
		solvePrimes();
	}

	/**
	 * Fastest way to determine prime numbers is to cross out multiples of
	 * integers in our array. The remaining indexes will be prime numbers
	 */
	private void solvePrimes() {
		Arrays.fill(primeMatrix, true);
		
		primeMatrix[0] = false;
		primeMatrix[1] = false;
		
		primes = new ArrayList<Integer>();
		
		for (int i = 2;  i < primeMatrix.length; i++) {
			if (primeMatrix[i]) {
				
				// Putting our prime numbers from 0-limit in a separate list 
				if (i  < limit ) primes.add(i);
				
				for (int j = 2; i * j < primeMatrix.length; j++) {
					primeMatrix[i * j] = false;
				}
			}
		}
	}
	
	public boolean isPrime(int x) {
		return primeMatrix[x];
	}
	
	public int getLimit() {
		return limit;
	}
	
	public List<Integer> getPrimes() {
		return primes;
	}

	public int secret(int n) {
		return Math.abs(n);
		
		
	}
	
	// this is a different implementation if we are to talk about solving for additive primes
	// where if secret(83) : 8 + 3 = 11 and 11 is prime
	public int secret2(int n) {
		int total = 0;
		int number = 83;
		
		while (number > 0) {
		    System.out.println( number % 10);
		    number = number / 10;
		    total += number;
		}
		return total;
		
	}

}
