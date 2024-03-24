package com.sathya.springex;

public class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("This is first Spring class");
		System.out.println("Ratan Sir wowwwwww");
		}
	public GreetingImpl() {
		System.out.println("GreetingImpl constructor :: object created");
	}
	
	
}
