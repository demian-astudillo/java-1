import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        String nombre = "cato";
        String cuenta = "paypal";
        double saldo = 1500.0;
        int opcion = 0;
        int resto = 0;
        int suma = 0;

        System.out.println("*****");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + cuenta);
        System.out.println("Saldo Disponible: " + saldo);


        String menu = """
                \n
                *** Elija una opción 
                
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                
                """;


        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("\nSu saldo es de: " + saldo);
                break;

            case 2:
                System.out.println("\n¿Cuanto necesita retirar?");
                resto = teclado.nextInt();
                if (resto > saldo){
                    System.out.println("Valor supera el saldo total, ingrese nuevamente.");
                } else{
                    saldo = saldo - resto;
                }

                break;

            case 3:
                System.out.println("\n¿Cuanto desea depositar? ");
                suma = teclado.nextInt();
                saldo = saldo + suma;
                break;

            default:
        }
        }

    }
}
