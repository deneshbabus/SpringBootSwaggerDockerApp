package com.concord.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concord.exception.InputOutOfRangeException;
import com.concord.util.HelperClass;

@Service
public class UserServiceImpl implements UserService{
	
	@Override
	public long totalNoOfVowels(List<String> nos){
		System.out.println("Input nos:"+ nos.toString());
		long totalNoOfVowels = 0;
		for(String no: nos){
			Integer n =Integer.valueOf(no);
			
			if(n>100){
				 throw new InputOutOfRangeException("Input number should not exceeds 100");
			}
			
			
			StringBuilder sb = new StringBuilder();
			sb.append(HelperClass.numberToWord(((n/100)%10)," hundred"));
			sb.append(HelperClass.numberToWord((n%100)," "));
			
			long NoOfVowels =sb.chars().filter(ch ->  (ch == 'a'||ch == 'e'|| ch == 'i'||ch == 'o' ||ch == 'u') ).count();
			totalNoOfVowels +=NoOfVowels;
			
			System.out.println(" There are  ["+  NoOfVowels  +"] no of Vowels in  ->    ["+sb+"]");
		}
				
		
		
		System.out.println("Ouput : "+totalNoOfVowels);
		return totalNoOfVowels;
		
	}
}
