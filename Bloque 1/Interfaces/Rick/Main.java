import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Escoge una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int choice = sc.nextInt();

            System.out.println("Ingresa un número: ");
            int num1 = sc.nextInt();

            System.out.println("Ingresa otro número: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    calculator.setOperation(new BasicOperations.Addition());
                    break;
                case 2:
                    calculator.setOperation(new BasicOperations.Substract());
                    break;
                case 3:
                    calculator.setOperation(new BasicOperations.Multiplication());            
                    break;
                case 4:
                    calculator.setOperation(new BasicOperations.Division());
                case 5:
                    System.out.println("Ejecución terminada");
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            int result = calculator.calculate(num1, num2);
            System.out.println("El resultado es: " + result);
        }
    }
}