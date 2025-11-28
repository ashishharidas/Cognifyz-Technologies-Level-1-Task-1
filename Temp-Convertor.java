import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter");
        
        while(1){
        System.out.println("Choose from the option below:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        if(choice == 1){
            convertCtoF();
        } else if(choice == 2){
            convertFtoC();
        } else {
            System.out.println("Invalid choice. Please try again.");

        }
        }
    }
    public static void convertFtoC() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        scanner.close();
     
    }
    public static void convertCtoF() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        scanner.close();
     
    }
}