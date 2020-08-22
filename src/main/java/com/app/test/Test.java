package com.app.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
		  String s="Hello World Hi Hello"; String[] se=s.split("\\s");
		  System.out.println(Arrays.toString(se)); Map<String,Long> map
		  =Stream.of(se).collect(Collectors.groupingBy(Function.identity(),Collectors.
		  counting())); System.out.println(map);//{Hi=1, Hello=2, World=1}
		 
	Integer[] i= {2,5,6,7,8,9};
   var list=Stream.of(i).filter(j->(j%3)==0).map(j->j*3).collect(Collectors.toList());
	System.out.println(list);

	
	
	
	
		
    }
	
}
 