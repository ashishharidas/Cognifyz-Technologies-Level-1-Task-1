import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter");
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the option below:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Exit");
        int choice = sc.nextInt();
        if(choice == 1){
            convertCtoF();
        } else if(choice == 2){
            convertFtoC();
        } else if(choice == 3){
            System.out.println("Exiting the program. ");
            break;

        }
        }
    }
    public static void convertFtoC() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
       
     
    }
    public static void convertCtoF() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
       
     
    }
}