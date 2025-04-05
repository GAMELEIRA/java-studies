package org.gameleira.models;

public record Movie(
		String nome, 
		int yearOfRelease, 
		int minutesDuration, 
		Gender gender,
		Director director) {

}
