import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first number\n");
        number1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("enter the second number\n");
        number2 = scanner.nextDouble();
        scanner.nextLine();
       
        System.out.print("enter the operation\n");
        operation = scanner.nextLine();



        if (operation.equals("+")){
            System.out.println(number1 + number2);
        }
        else if (operation.equals("-")) {
            System.out.println(number1 - number2);
        }
        else if(operation.equals("*")){
            System.out.println(number1 *number2);
        }
        else if(operation.equals("/")){
            System.out.println(number1 / number2);
        }

        else{System.out.printf("%s is not a valid operation \n", operation);}

     scanner.close();   
    }
}
