package com.demo.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer stringTokenizer = new StringTokenizer("This demo is for tokenizer");
		
		while(stringTokenizer.hasMoreTokens()) {
			String nextToken = stringTokenizer.nextToken();
			System.out.println(nextToken);
		}

	}

}
