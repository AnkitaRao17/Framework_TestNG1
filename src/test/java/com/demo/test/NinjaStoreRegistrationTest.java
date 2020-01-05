package com.demo.test;

import org.testng.annotations.Test;

import com.demo.actions.NinjaStoreRegistration;

public class NinjaStoreRegistrationTest {
	
	
	NinjaStoreRegistration action=new NinjaStoreRegistration();
	
	@Test
	public void  registrations() throws InterruptedException {
		action.registration();
		
	}

}
