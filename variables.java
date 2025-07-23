public class variables {
  static   int GlobalVar=500;



    public static void main(String[] args){
    int Age =20;

       System.out.println("first age is: "+ Age);

        Age = 99; // the value will change after this line

        System.out.println("I am " + Age + " years old");

        System.out.println("the global variable is : " + GlobalVar);

        GlobalVar = 900;
        System.out.println(GlobalVar); //global variables can be re-declared in the local method
        
}
}