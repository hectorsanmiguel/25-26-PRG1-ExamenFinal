package entregas.sanmiguelHector.documentos;

import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validacion = true;

        menuPrincipal();

        int opcionElegida = scanner.nextInt();

        if (opcionElegida == 1) {

            menuLongitud();
            int conversionElegida = scanner.nextInt();
            final int NUMERO_MAXIMO_DE_OPCIONES = 6;

            if (conversionElegida < 1 || conversionElegida > NUMERO_MAXIMO_DE_OPCIONES) {
                mensajeError();

            } else {
                System.out.print("Valor: ");
                double valorDelUsuario = scanner.nextDouble();

                if (conversionElegida == 1) {
                    System.out.println(valorDelUsuario + " m = " + (valorDelUsuario / 1000) + " km");
                } else if (conversionElegida == 2) {
                    System.out.println(valorDelUsuario + " km = " + (valorDelUsuario * 1000) + " m");
                } else if (conversionElegida == 3) {
                    System.out.println(valorDelUsuario + " m = " + (valorDelUsuario * 0.000621371) + " mi");
                } else if (conversionElegida == 4) {
                    System.out.println(valorDelUsuario + " mi = " + (valorDelUsuario * 1609.34) + " m");
                } else if (conversionElegida == 5) {
                    System.out.println(valorDelUsuario + " cm = " + (valorDelUsuario * 0.393701) + " in");
                } else if (conversionElegida == 6) {
                    System.out.println(valorDelUsuario + " in = " + (valorDelUsuario * 2.54) + " cm");
                } else {
                    mensajeError();
                }
            }
        } else if (opcionElegida == 2) {

            menuPeso();
            int conversionElegida = scanner.nextInt();
            final int NUMERO_MAXIMO_DE_OPCIONES = 6;

            if (conversionElegida < 1 || conversionElegida > NUMERO_MAXIMO_DE_OPCIONES) {
                mensajeError();

            } else {
                System.out.print("Valor: ");
                double valorDelUsuario = scanner.nextDouble();

                if (conversionElegida == 1) {
                    System.out.println(valorDelUsuario + " kg = " + (valorDelUsuario * 1000) + " g");
                } else if (conversionElegida == 2) {
                    System.out.println(valorDelUsuario + " g = " + (valorDelUsuario / 1000) + " kg");
                } else if (conversionElegida == 3) {
                    System.out.println(valorDelUsuario + " kg = " + (valorDelUsuario * 2.20462) + " lb");
                } else if (conversionElegida == 4) {
                    System.out.println(valorDelUsuario + " lb = " + (valorDelUsuario * 0.453592) + " kg");
                } else if (conversionElegida == 5) {
                    System.out.println(valorDelUsuario + " g = " + (valorDelUsuario * 0.035274) + " oz");
                } else if (conversionElegida == 6) {
                    System.out.println(valorDelUsuario + " oz = " + (valorDelUsuario * 28.3495) + " g");
                } else {
                    mensajeError();
                }
            }
        } else if (opcionElegida == 3) {
            
            menuTemperatura();
            int conversionElegida = scanner.nextInt();
            final int NUMERO_MAXIMO_DE_OPCIONES = 4;

            if (conversionElegida < 1 || conversionElegida > NUMERO_MAXIMO_DE_OPCIONES) {
                mensajeError();

            } else {
                System.out.print("Valor: ");
                double valorDelUsuario = scanner.nextDouble();

                if (conversionElegida == 1) {
                    System.out.println(valorDelUsuario + " C = " + (valorDelUsuario * 9 / 5 + 32) + " F");
                } else if (conversionElegida == 2) {
                    System.out.println(valorDelUsuario + " F = " + ((valorDelUsuario - 32) * 5 / 9) + " C");
                } else if (conversionElegida == 3) {
                    System.out.println(valorDelUsuario + " C = " + (valorDelUsuario + 273.15) + " K");
                } else if (conversionElegida == 4) {
                    System.out.println(valorDelUsuario + " K = " + (valorDelUsuario - 273.15) + " C");
                } else {
                    mensajeError();
                }
            }
        } else {
            mensajeError();
        }
    }

    static void mensajeError() {
        System.out.println("Opcion no valida");
    }

    static void menuPrincipal() {
        System.out.println("Conversor de Unidades - Version 2.1");
        System.out.println("[1] Longitud");
        System.out.println("[2] Peso");
        System.out.println("[3] Temperatura");
        System.out.print("Tipo de conversion: ");
    }

    static void menuLongitud() {
        System.out.println("Conversion de longitud:");
        System.out.println("[1] Metros a Kilometros");
        System.out.println("[2] Kilometros a Metros");
        System.out.println("[3] Metros a Millas");
        System.out.println("[4] Millas a Metros");
        System.out.println("[5] Centimetros a Pulgadas");
        System.out.println("[6] Pulgadas a Centimetros");
        System.out.print("Opcion: ");
    }

    static void menuPeso() {
        System.out.println("Conversion de peso:");
        System.out.println("[1] Kilogramos a Gramos");
        System.out.println("[2] Gramos a Kilogramos");
        System.out.println("[3] Kilogramos a Libras");
        System.out.println("[4] Libras a Kilogramos");
        System.out.println("[5] Gramos a Onzas");
        System.out.println("[6] Onzas a Gramos");
        System.out.print("Opcion: ");
    }

    static void menuTemperatura() {
        System.out.println("Conversion de temperatura:");
        System.out.println("[1] Celsius a Fahrenheit");
        System.out.println("[2] Fahrenheit a Celsius");
        System.out.println("[3] Celsius a Kelvin");
        System.out.println("[4] Kelvin a Celsius");
        System.out.print("Opcion: ");
    }
 }
