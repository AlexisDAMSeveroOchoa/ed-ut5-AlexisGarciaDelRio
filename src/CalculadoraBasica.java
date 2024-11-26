//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class CalculadoraBasica {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Creacion de Scanner inicial e inicializacion condicion de bucle
        boolean exitprogram = false;

        do {

            // mostrar menu y leer elección
            System.out.println("Introduzca uno de los números designados para elegir la operación a realizar:\n0 - Salir del programa.\n1 - Sumar dos números.\n2 - Restar dos números.\n3 - Calcular la potencia de un número.\n4 - Dividir dos números.\n5 - Calcular el factorial de un número.");
            int option = sc.nextInt();

            sc.nextLine();

            switch (option) {
                case 0:
                    exitprogram = true;
                    break;

                case 1: // llamada método suma
                    System.out.print("Resultado: " + suma() + "\n");
                    break;
                case 2: // llamada método resta
                    System.out.print("Resultado: " + resta()  + "\n");;
                    break;
                case 3: // llamada método potencia
                    System.out.print("Resultado: " + potencia()  + "\n");
                    break;
                case 4: // llamada método division
                    System.out.print("Resultado: " + division()  + "\n");;
                    break;
                case 5: // llamada método factorial
                    System.out.print("Resultado: " + factorial()  + "\n");
                    break;
                default:
                    System.out.print("Entrada no reconocida, por favor, use los números especificados. + \"\\n\"");
                    break;
            }
        } while (!exitprogram);

    }

        // Definicion de metodos estáticos

        // Metodo de suma - opcion 1
        public static double suma() {

            System.out.print("Introduzca el primer número a sumar: ");
            double num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introduzca el segundo número a sumar: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            return (num1 + num2);
        }

        // Metodo de resta - opcion 2
        public static double resta() {

            System.out.print("Introduzca el número al que restar: ");
            double num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introduzca el número que restar: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            return (num1 - num2);
        }

        // Metodo de potencia - opcion 3
        public static double potencia() {

            System.out.print("Introduzca la base: ");
            double num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introduzca el exponente: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            double resultado_potencia = 1;

            for (int i = 1; i <= num2; i++) {
                resultado_potencia *= num1;
            }

            return resultado_potencia;
        }

        // Metodo de division - opcion 4
        public static double division() {
            System.out.print("Introduzca dividendo: ");
            double num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introduzca el divisor: ");
            double num2 = sc.nextDouble();

            while (num2 == 0){ // comprobar que el divisor no sea 0
                System.out.print("Imposible dividir entre 0, introduzca otro número: ");
                num2 = sc.nextDouble();
            }

            sc.nextLine();

            return (num1 / num2);
        }

        // Metodo de factorial - opcion 5
        public static double factorial() {

            System.out.print("Introduzca un número entero positivo para calcular el factorial: ");
            int num1 = sc.nextInt();

            // comprobar que el número provisto es positivo
            while (num1 < 0){
                System.out.print("El número provisto no es positivo. Introduzca un número positivo: ");
                num1 = sc.nextInt();
            }
            sc.nextLine();

            double factorial = 1;

            for (int i = 1; i <= num1; i++){ // bucle cálculo del factorial
                factorial *= i;
            }

            return factorial;
        }

    }