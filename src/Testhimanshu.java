import java.util.Scanner;

/**
 *mid terms
 * @author himan
 */
public class Testhimanshu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to UserProfile Creation!");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.println("Choose your favorite genre:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.println("4. Fantasy");
            System.out.println("5. Science Fiction");
            System.out.print("Enter the number corresponding to your favorite genre: ");
            int genreChoice = scanner.nextInt();
            String genre;
            
            switch (genreChoice) {
                case 1:
                    genre = "Action";
                    break;
                case 2:
                    genre = "Comedy";
                    break;
                case 3:
                    genre = "Drama";
                    break;
                case 4:
                    genre = "Fantasy";
                    break;
                case 5:
                    genre = "Science Fiction";
                    break;
                default:
                    System.out.println("Invalid genre choice. Defaulting to Action.");
                    genre = "Action";
                    break;
            }   
            System.out.println("Your userProfile was created:");
            System.out.println("Name: " + name);
            System.out.println("Favorite Genre: " + genre);
            
        }
    }
}
