package com.concord.util;

public class HelperClass {
	public static String numberToWord(int n,String ch)
	  {
	    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};

	    String ten[]={" "," "," twenty"," thirty"," fourty"," fifty"," sixty","seventy"," eighty"," ninety"};

		if (n > 19) {
			return (ten[n / 10] + " " + one[n % 10]);
		} else {
			return one[n];
		}
		//if (n > 0)
			//return ch;
	  }
}
