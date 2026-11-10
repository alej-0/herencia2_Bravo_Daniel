import Geometria.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int opcion=1;
        FiguraGeometrica fg=new FiguraGeometrica();

        while (opcion!=0){
            System.out.println("##### MENU #####");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("Color circulo:");
                    String colorC =sc.nextLine();
                    System.out.println("Radio: ");
                    double radioC =sc.nextDouble();
                    fg=new Circulo(colorC, radioC);
                    fg.imprimirDatos();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Color rectangulo:");
                    String colorR =sc.nextLine();
                    System.out.println("Base: ");
                    double baseR =sc.nextDouble();
                    System.out.println("Altura: ");
                    double alturaR=sc.nextDouble();
                    fg=new Rectangulo(colorR, baseR,alturaR);
                    fg.imprimirDatos();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Color cuadrado:");
                    String colorCu =sc.nextLine();
                    System.out.println("Lado: ");
                    double lado=sc.nextDouble();
                    fg=new Cuadrado(colorCu, lado);
                    fg.imprimirDatos();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Color triangulo:");
                    String colorT =sc.nextLine();
                    System.out.println("Lado 1: ");
                    double lado1 =sc.nextDouble();
                    System.out.println("Lado 2: ");
                    double lado2 =sc.nextDouble();
                    System.out.println("Lado 3: ");
                    double lado3 =sc.nextDouble();
                    fg=new Triangulo(colorT, lado1,lado2,lado3);
                    fg.imprimirDatos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    opcion=0;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}