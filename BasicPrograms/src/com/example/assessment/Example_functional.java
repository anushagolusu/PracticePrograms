package com.example.assessment;
@FunctionalInterface
interface Example{
	void hello();
	static void welcome() {
     System.out.println("Welcome");
}
}
public class Example_functional implements Example {
public static void main(String[] args) {
	Example_functional e=new Example_functional();
	e.hello();
	Example.welcome();
}

@Override
public void hello() {
	System.out.println("Hello Anu!");
	
}
}
