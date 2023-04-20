package com.demo.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer stringTokenizer = new StringTokenizer("This demo is for tokenizer");
		
		while(stringTokenizer.hasMoreTokens()) {
			String nextToken = stringTokenizer.nextToken();
			System.out.println(nextToken);
		}
		
		String envInfo = "local/dev/qa/preprod/prod";
		
		StringTokenizer stringTokenizer1 = new StringTokenizer(envInfo,"/");
		
		
		while(stringTokenizer1.hasMoreTokens()) {
			
			String val = stringTokenizer1.nextToken();
			System.out.println(val);
		}
		
		

	}

}
