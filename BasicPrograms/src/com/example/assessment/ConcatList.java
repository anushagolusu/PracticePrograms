package com.example.assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatList {
public static void main(String[] args) {
	List<String> listOne=Arrays.asList("Anu","Bhanu","Chanu");
	List<String> listtwo=Arrays.asList("Dhanu","Jhanu","Rhanu");
	Stream<String> list=Stream.concat(listOne.stream(), listtwo.stream());
	list.forEach((str)->System.out.println(str));
	
}
}
