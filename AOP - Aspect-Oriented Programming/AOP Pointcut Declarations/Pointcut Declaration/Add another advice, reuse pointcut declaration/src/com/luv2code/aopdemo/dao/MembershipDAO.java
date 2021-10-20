package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addGreatMember() {
		
		System.out.println(getClass() + ": Doing Stuff :  ADDING A MEMBERSHIP ACCOUNT");
		 
		return true;
	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + ": I'm going to sleep now..");
		 
	}

}
