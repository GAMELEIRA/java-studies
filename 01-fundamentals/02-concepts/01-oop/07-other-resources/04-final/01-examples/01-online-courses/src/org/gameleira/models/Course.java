package org.gameleira.models;

public class Course {
	
	//NAO PODE SER ALTERADO DEPOIS DE INICIALIZADO
	public final String name; 
	private int workload;
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, int workload) {
		super();
		this.name = name;
		this.workload = workload;
	}
	
	//NAO PODE SER SOBREESCRITO
	public final void initializeCourse() {
        System.out.println("Curso " + this.name + " iniciado!");
	} 

	public String getName() {
		return name;
	}
	
	public int getWorkload() {
		return workload;
	}
	
	public void setWorkload(int workload) {
		if (workload > 0 ) {
			this.workload = workload;
		}
	}
		
}
