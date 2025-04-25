package org.gameleira.app;


import org.gameleira.models.Certificate;
import org.gameleira.models.Course;

public class App {

	public static void main(String[] args) {
		Course course = new Course("TI", 300);
		course.initializeCourse();
		course.setWorkload(600);
        System.out.println("Carga horária atual: " + course.getWorkload());
                
        Certificate certificate = new Certificate();
        certificate.generatedCertificate();
        certificate.getVersionCertificate();
	}

}
