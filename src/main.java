import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        menu();

    }
    public static void opcion(){
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    public static void menu(){
        calcular calculos = new calcular();
        int elegir = 0;

        opcion();
        Scanner elijaOpcion = new Scanner(System.in);
        elegir = elijaOpcion.nextInt();


        double contenedor=0;
        double numero1 = 0, numero2 = 0;
        System.out.println("Digite dos números para realizar un calculo: ");
        System.out.printf("1er número: ");
        Scanner ingresarNumero1 = new Scanner(System.in);
        numero1 = ingresarNumero1.nextDouble();
        System.out.printf("2do número: ");
        Scanner ingresarNumero2 = new Scanner(System.in);
        numero2 = ingresarNumero2.nextDouble();
        switch (elegir){
                case 1:
                    contenedor = calculos.sumar(numero1,numero2);
                    System.out.println(numero1 +" + "+ numero2+ " = " + contenedor);
                    break;
                case 2:
                    contenedor = calculos.restar(numero1,numero2);
                    System.out.println(numero1+ " - " + numero2 +" = " + contenedor);
                    break;
                    case 3:
                        contenedor = calculos.multiplicar(numero1,numero2);
                        System.out.println(numero1+ " * " + numero2 +" = " + contenedor);
                        break;
                    case 4:
                        contenedor = calculos.dividir(numero1,numero2);
                        System.out.println(numero1+ " / " + numero2 +" = " + contenedor);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
        System.out.println("¿quiere agregar otro calculo al resultado dado? ");
        opcion();
        elegir = elijaOpcion.nextInt();
        while (elegir!=5) {

            if(elegir==1){
                System.out.println("ingrese un numero");
                numero1 = ingresarNumero1.nextDouble();
                System.out.println("La suma es: "+ calculos.sumar(numero1,contenedor));
            } else if (elegir==2) {
                System.out.println("ingrese un numero");
                numero1 = ingresarNumero1.nextDouble();
                System.out.println("La resta es: "+ calculos.restar(contenedor,numero1));
            }else if (elegir==3) {
                System.out.println("ingrese un numero");
                numero1 = ingresarNumero1.nextDouble();
                System.out.println("La multiplicación es: "+ calculos.multiplicar(contenedor,numero1));
            }else if (elegir==4) {
                System.out.println("ingrese un numero");
                numero1 = ingresarNumero1.nextDouble();
                System.out.println("La División: "+ calculos.dividir(contenedor,numero1));
            }
            System.out.println("¿quiere agregar otro núm?");
            opcion();
            elegir = elijaOpcion.nextInt();
        }



    }
}
