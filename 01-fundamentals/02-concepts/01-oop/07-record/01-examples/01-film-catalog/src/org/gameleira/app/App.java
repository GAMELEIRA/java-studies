package org.gameleira.app;

import java.util.ArrayList;

import org.gameleira.models.*;

public class App {

	public static void main(String[] args) {
		
        ArrayList<Movie> movies = new ArrayList<>();

        Director director1 = new Director("Gabriel", 25, "Brasil");
        Gender gender1 = new Gender("Aventura", "Descobertas");
        movies.add(new Movie("Minecraft", 2025, 120, gender1, director1));

        Director director2 = new Director("Sophia", 42, "França");
        Gender gender2 = new Gender("Drama", "Histórias emocionantes");
        movies.add(new Movie("Entre Estações", 2018, 95, gender2, director2));

        Director director3 = new Director("Hiroshi", 39, "Japão");
        Gender gender3 = new Gender("Animação", "Filmes animados para todas as idades");
        movies.add(new Movie("O Jardim Secreto", 2021, 110, gender3, director3));

        Director director4 = new Director("Amanda", 34, "Canadá");
        Gender gender4 = new Gender("Terror", "Suspense e medo");
        movies.add(new Movie("A Casa do Eco", 2023, 100, gender4, director4));

        Director director5 = new Director("Lucas", 47, "EUA");
        Gender gender5 = new Gender("Ficção Científica", "Tecnologia, futuro e espaço");
        movies.add(new Movie("Galáxia Perdida", 2020, 130, gender5, director5)); 

        //LAMBDA
        movies.forEach(movie -> System.out.println(movie));

        //METODO POR REFERENCIA
        movies.forEach(System.out::println);
        
	}

}
