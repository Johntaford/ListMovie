import java.util.ArrayList;
import java.util.Scanner;

public class Movieapp {
	public static void main(String[] args) {
		// String title, String category
		ArrayList<ListMovies> MovieList = new ArrayList<>();
		MovieList.add(new ListMovies("Citizen Kane", "Drama"));
		MovieList.add(new ListMovies("Casablanca", "Drama"));
		MovieList.add(new ListMovies("The Godfather", "Drama"));
		MovieList.add(new ListMovies("Star Wars ", "SiFi"));
		MovieList.add(new ListMovies("Psycho", "Horror"));
		MovieList.add(new ListMovies("Raging bull", "Drama"));
		MovieList.add(new ListMovies("Karate Kid", "Action"));
		MovieList.add(new ListMovies("The Pelican Breif", "Thriller"));
		MovieList.add(new ListMovies("James Bond", "Action"));
		MovieList.add(new ListMovies("Enter the dragon", "Action"));
		MovieList.add(new ListMovies("Screwball ", "Comedy"));
		MovieList.add(new ListMovies("Deadpan", "Comedy"));
		MovieList.add(new ListMovies("Slapstick", "Comedy"));
		MovieList.add(new ListMovies(" A Chorus Line", "Musical"));
			
		//System.out.println(MovieList.toString());
		String answer = null;
		//Boolean answer = true;
		do {
			
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Welcome to the Movie List Application!\n");

		
			System.out.println("There are 14 movies in this list!, Whats category do you want to see?");
			String userInput = scan.nextLine();
			for (ListMovies movies : MovieList) {
				if (movies.getcategory().equals(userInput)) {
					//System.out.println(movies.toString());
					System.out.println(movies.gettitle().toString());
					System.out.println("Would you like to continue?");
					answer = scan.next();
				}
			}
		}
		
		}  while (answer.equalsIgnoreCase("Yes"));
	}

}
