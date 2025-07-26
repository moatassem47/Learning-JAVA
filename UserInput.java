import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        
        String Name = InputScanner.nextLine();
         
        System.out.print("enter your age:");
        
       int age = InputScanner.nextInt();
         InputScanner.nextLine(); //to clear the input buffer 

        System.out.print("what language do u use?");
        String language = InputScanner.nextLine();
         
        System.out.print("what's your GPA? ");
        double GPA = InputScanner.nextDouble();

        System.out.printf("your name is: %s\n", Name);
         
        System.out.printf("Your age is %d\n", age);

        System.out.printf("%s is a good language\n", language);

        System.out.printf("%f is good GPA", GPA);
        
        InputScanner.close();

    }
}
