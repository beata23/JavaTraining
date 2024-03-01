package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //psvm - public static void main
        //sout - system.out.println
        // ctrl + / żeby zakomentować lub odkomentować

        //--------------------------TWORZENIE OBIEKTÓW I UŻYCIE METODY GETTERA-----------------------------------------
//        Actor angelinaJolie = new Actor("Angelina","Jolie",3,false);
//        Actor bradPitt = new Actor("Brad", "Pitt", 5, true);
//        Actor jimCarrey = new Actor("Jim", "Carrey");
//        jimCarrey.setRating(18);
//
//        System.out.println("Rating Brada Pitta to: " + bradPitt.getRating());
//        System.out.println("Rating Angeliny Jolie to: " + angelinaJolie.getRating());
//        System.out.println("Rating Jima to: " + jimCarrey.getRating());
//
//        Movie titanic = new Movie("Titanic", 2000, 8);
//        Movie harryPotter = new Movie("Harry Potter", 2005, 13);
//
//        System.out.println(titanic);
//        System.out.println(harryPotter);
//
//        if(titanic.getRating() <= harryPotter.getRating()){
//            System.out.println("Titanic jest popularniejszy");
//        }
//        else{
//            System.out.println("Harry Potter jest popularniejszy");
//        }

        //--------------------------------------------WYŚWIETLANIE DANYCH-----------------------------------------------
//        int age = 33;
//        String imie = "Darek";
//        String aktorka = "Angelina";
//
//        System.out.println(imie + " i " + aktorka + " to dobrzy znajomi!");
//        System.out.println(aktorka + " ma " + age + " lata");
//        System.out.print(age + age);
//        System.out.println("" + age + age);

        //-----------------------------------POBIERANIE DANYCH Z KONSOLI------------------------------------------------
//        String imieKlientki;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Witam Panią! Jak Pani ma na imię?");
//        imieKlientki = scan.nextLine();
//        System.out.println("Witam Pani " + imieKlientki);

        //------------------------------POBIERANIE DANYCH Z KONSOLI + IF------------------------------------------------
//        System.out.println("Witamy zaproszonych gości. Proszę podaj imię: ");
//        String imieGoscia;
//        imieGoscia = scan.nextLine();
//
//        if(imieGoscia.equals("Angelina")){
//            System.out.println("Zapraszamy Pani Angelino!");
//        }
//        else if(imieGoscia.equals("Brad")){
//            System.out.println("Zapraszamy Panie Brad!");
//        }
//        else if (imieGoscia.equals("Jarek")) {
//            System.out.println("Nie ma wstępu!");
//        }
//        else {
//            System.out.println("Zapraszamy!");
//        }

        //------------------------------------------------TABLICE------------------------------------------------------
//        String movies[] = new String[3];
//        int ratings[] = new int[3];
//
//        Scanner scanner = new Scanner(System.in);
//
//        movies[0] = "Diuna";
//        movies[1] = "Pulp Fiction";
//        movies[2] = "Kill Bill";
//
//        System.out.println("Za chwilę zobaczysz 3 filmy, oceń każdy z nich w skali od 1 do 10.");
//        System.out.println("Oceń pierwszy film: " + movies[0]);
//        ratings[0] = scanner.nextInt();
//
//        System.out.println("Oceń drugi film: " + movies[1]);
//        ratings[1] = scanner.nextInt();
//
//        System.out.println("Oceń trzeci film: " + movies[2]);
//        ratings[2] = scanner.nextInt();
//
//        System.out.println("Film "+ movies[0] + " oceniłeś na " + ratings[0]);
//        System.out.println("Film "+ movies[1] + " oceniłeś na " + ratings[1]);
//        System.out.println("Film "+ movies[2] + " oceniłeś na " + ratings[2]);

        //----------------------------------------------LISTY---------------------------------------------------------
//        List <String> movies = new ArrayList<>();
//        List <Integer> ratings = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        movies.add("Diuna");
//        movies.add("Pulp Fiction");
//        movies.add("Kill Bill");
//        movies.add("Titanic");
//
//        System.out.println("Za chwilę zobaczysz 4 filmy, oceń każdy z nich w skali od 1 do 10.");
//        System.out.println("Oceń pierwszy film: " + movies.get(0));
//        ratings.add(scanner.nextInt());
//
//        System.out.println("Oceń drugi film: " + movies.get(1));
//        ratings.add(scanner.nextInt());
//
//        System.out.println("Oceń trzeci film: " + movies.get(2));
//        ratings.add(scanner.nextInt());
//
//        System.out.println("Oceń czwarty film: " + movies.get(3));
//        ratings.add(scanner.nextInt());
//
//        System.out.println("Film "+ movies.get(0) + " oceniłeś na " + ratings.get(0));
//        System.out.println("Film "+ movies.get(1) + " oceniłeś na " + ratings.get(1));
//        System.out.println("Film "+ movies.get(2) + " oceniłeś na " + ratings.get(2));
//        System.out.println("Film "+ movies.get(3) + " oceniłeś na " + ratings.get(3));

        //------------------------------------PĘTLE--------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę sekund:");
//        int liczbaSekund = scanner.nextInt();

//        while (liczbaSekund > 0){
//            System.out.println("Bomba wybuchnie za: " + liczbaSekund);
//            liczbaSekund--;
//        }
//
//        for(int i = liczbaSekund; i>0; i--){
//            System.out.println("Bomba wybuchnie za: " + i);
//            try {
//                Thread.sleep(1000); //zasymulowanie zatrzymania podczas odliczania
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("WYBUCH!");

        //-------------------------------------------FOR EACH----------------------------------------------------------
//        List <String> movies = new ArrayList<>();
//        List <Integer> ratings = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        movies.add("Diuna");
//        movies.add("Pulp Fiction");
//        movies.add("Kill Bill");
//        movies.add("Titanic");
//        movies.add("Harry Potter");
//        movies.add("Matrix");
//        movies.add("Gladiator");
//        movies.add("Nietykalni");
//
//        System.out.println("Liczba filmów: " + movies.size());

//        for (String movie : movies) {
//            System.out.println("Filmy na liście to: " + movie);
//        }

//        for (int i = 0; i <= movies.size()-1; i++){
//            System.out.println("Filmy na liście to: " + movies.get(i) + " Warner Bross");
//        }

        //----------------------------------------------WYWOŁYWANIE METOD---------------------------------------------
        Actor angelinaJolie = new Actor("Angelina","Jolie",3,false);
        Actor bradPitt = new Actor("Brad", "Pitt", 5, true);
        Actor jimCarrey = new Actor("Jim", "Carrey");

//        int salaryAngelina = angelinaJolie.calculateSalary(5,100000);
//        System.out.println(salaryAngelina);
//
//        int salaryBad = bradPitt.calculateSalary(7,300000);
//        System.out.println(salaryBad);
//
//        int salaryJim = jimCarrey.calculateSalary(6,250000);
//        System.out.println(salaryJim);
//
//        List<Actor> actorsList = new ArrayList<>();
//        actorsList.add(angelinaJolie);
//        actorsList.add(bradPitt);
//        actorsList.add(jimCarrey);

//        for (Actor actor : actorsList) {
//            System.out.println(actor.calculateSalary(5, 100000));
//        }
    }
}