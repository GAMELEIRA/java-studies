package org.gameleira.app;

import org.gameleira.models.*;

public class App {

	public static void main(String[] args) {
		
		Document passport = new Passport();
	    Document idCard = new IdentityCard();
	    Document driverLicense = new DriverLicense();
	    Document specialIdentityCard = new SpecialIdentityCard();

	    passport.validateDocument();
	    idCard.validateDocument();
	    driverLicense.validateDocument();
	    specialIdentityCard.validateDocument();
	    
	}

}
