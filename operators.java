public class operators {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        //addition
        System.out.println(number1 + number2);

        //subtraction

        System.out.println(number2 - number1);

        //multiply
        System.out.println(number1*number2);

        //division
        System.out.println(number2/number1);

        // modulus

        System.out.println(number2%number1);

        number1+= number2;
        System.out.println(number1); //number1 has become 30
    
        number1-=number2; //30-20 =10
        System.out.println(number1);

        //reltional operator
        System.out.println(number1<number2); //should be true
        System.out.println(number1 == number2); //should be false 
        System.out.println(number1 != number2); //shoulb be true 




        //logical operators

        int age = 25;
        System.out.println(age>=18 && age <=40);//should be true


        boolean isstudent = true;
        boolean librarymember = false;


        System.out.println(isstudent || librarymember); //true 
        


    
    }
}
