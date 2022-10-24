import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Opcion 0: Terminar programa");
            System.out.println("Opcion 1: Ingresar un nuevo vehículo");
            System.out.println("Opcion 2: Ver informacíon de vehículos almacenados");
            System.out.println("Opcion 3: Ver cantidad de vehículos almacenados");
            System.out.println("Opcion 4: Ver informacíon de los vehículos verdes");
            System.out.println("Opcion 5: Ver informacíon de los vehículos modelos entre 2000 y 2021");
            System.out.println("Opcion 6: Ingresar un nuevo sensor");
            System.out.println("Opcion 7: Ver informacíon de sensores almacenados");
            System.out.println("Opcion 8: Ver cantidad de sensores almacenados");
            System.out.println("Opcion 9: Ver informacíon de sensores de temperatura");
            System.out.println("Opcion 666: Ver informacíon de sensores temperatura por valor");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            switch (numero) {
                case 1:
                    if (Vehiculo.posAnadir < 10) {
                        System.out.println("Ingrese modelo:");
                        int modelo = sc.nextInt();
                        System.out.println("Ingrese marca:");
                        String marca = sc.next();
                        System.out.println("Ingrese valor comercial");
                        double valorComercial = sc.nextDouble();
                        System.out.println("Ingrese color");
                        String color = sc.next();
                        Vehiculo v1 = new Vehiculo(modelo, marca, valorComercial, color);
                    } else {
                        System.out.println("Error, la base de datos está llena");
                    }
                    break;

                case 2:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;

                case 3:
                    System.out.println(Vehiculo.cantidadVehiculos());
                    break;

                case 4:
                    System.out.println("La información de los vehículos verdes es:");
                    System.out.println(Vehiculo.toStringVerdes());
                    break;

                case 5:
                    System.out.println("La información de los vehículos modelo 2000 hasta 2021 es: ");
                    System.out.println(Vehiculo.toStringModelos());
                    break;

                case 6:
                    if (Sensor.posAnadir < 8) {
                        System.out.println("Ingrese tipo:");
                        String tipo = sc.next();
                        System.out.println("Ingrese valor:");
                        int valor = sc.nextInt();
                        Sensor s1 = new Sensor(tipo, valor);
                        System.out.println("Caracteristicas del Sensor:");
                        System.out.println(s1.toString());
                    } else {
                        System.out.println("Error, base de datos llena");
                    }
                    break;

                case 7:
                    System.out.println(Sensor.toStringSensores());
                    break;

                case 8:
                    System.out.println(Sensor.cantidadSensores());
                    break;

                case 9:
                    System.out.println("La informacion de los sensores tipo temperatura es:");
                    System.out.println(Sensor.toStringTemperatura());
            }
        }
    }
}