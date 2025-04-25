package org.gameleira.models;

public class Certificate {
	
	public final String versionCertificate = "SENAI";
	
    public void generatedCertificate() {
        System.out.println("Certificado gerado.");
    }
    
    public final void getVersionCertificate() {
        System.out.println(this.versionCertificate);
    }
}
