import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                *************************************************
                BIENVENIDOS AL CONVERSOR DE MONEDAS!
                **************************************************
                1-Convertir de USD (Dolares) => ARS (Peso Argentino)
                2-Convertir de ARS (Peso Argentino) => a USD (Dolares).
                3-Convertir de USD (Dolares) => a KRW (Won de Corea del Sur).
                4-Convertir de KRW (Won de Corea del Sur) => a USD (Dolares).
                5-Convertir de USD (Dolares) => a VES (Bolivar Venezolano).
                6-Convertir de VES (Bolivar Venezolano) => a USD (Dolares).
                7-Convertir de USD (Dolares) => a NZD (Dolar de Nueva Zelanda).
                8-Convertir de NZD (Dolar de Nueva Zelanda) => a USD (Dolares).
                9-Salir
                """;

        int opcion;
        int seguir;
        do {
            System.out.println(menu);
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "ARS", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 2:
                    convertirMoneda("ARS", "USD", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 3:
                    convertirMoneda("USD", "KRW", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 4:
                    convertirMoneda("KRW", "USD", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 5:
                    convertirMoneda("USD", "VES", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 6:
                    convertirMoneda("VES", "USD", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 7:
                    convertirMoneda("USD", "NZD", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }
                case 8:
                    convertirMoneda("NZD", "USD", scanner);
                    System.out.println("Desea seguir Convirtiendo? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        opcion = 9;
                        break;
                    }

                case 9:
                    System.out.println("***********************************");
                    System.out.println(" ");
                    System.out.println("GRACIAS POR USAR EL PROGRAMA...");
                    System.out.println(" ");
                    System.out.println("***********************************");
                    break;
                default:
                    System.out.println("Opción no válida, escoja una opción del menú.");
            }
        } while (opcion != 9);
        System.out.println("**********************************");
        System.out.println(" ");
        System.out.println("GRACIAS POR USAR EL PROGRAMA!");
        System.out.println(" ");
        System.out.println("**********************************");

        scanner.close();
    }

    private static void convertirMoneda(String baseCode, String targetCode, Scanner scanner) {
        System.out.println("Ingrese el monto total a convertir: ");
        double amount = scanner.nextDouble();
        Conversor conversion = new Conversor(baseCode, targetCode, amount);
        try {
            double result = conversion.convert();
            System.out.println(amount + " " + baseCode + " son " + result + " " + targetCode);
            System.out.println("*************************************");
            System.out.println("MONEDA CONVERTIDA CORRECTAMENTE!");
            System.out.println("**************************************");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}