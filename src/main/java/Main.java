import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a command:");
        while(true) {
            String in = scanner.nextLine();
            String[] inargs = in.split("\\s+");
            for(String a : inargs) {
                System.out.println(a);
            }
            switch (inargs[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(inargs[1]), Integer.parseInt(inargs[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(inargs[1]), Integer.parseInt(inargs[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(inargs[1]), Integer.parseInt(inargs[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(inargs[1]), Integer.parseInt(inargs[2])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(inargs[1])));
                    break;
                case "fib":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inargs[1])));
                    break;
                default:
                    System.out.println("Unknown method");
            }
        }
    }

}
