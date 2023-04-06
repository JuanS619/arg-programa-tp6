import java.util.Scanner;

public class prueba {
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
        int elegir = 0, valor=1;
        double numero1=0, numero2=0, contenedor=0;

        Scanner elegirOpcion = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);


        while (elegir!=5){
            opcion();
            elegir = elegirOpcion.nextInt();
            switch (elegir){
                case 1:
                    if(valor==1){
                        System.out.println("Digite dos valores: ");
                        numero1 = num1.nextDouble();
                        numero2 = num2.nextDouble();
                        contenedor = calculos.sumar(numero1,numero2);
                        System.out.println(numero1 +" + " + numero2 + " = " + contenedor);
                    }
                    else {
                        System.out.println("Digite un valor: ");
                        numero1 = num1.nextDouble();
                        contenedor = calculos.sumar(contenedor,numero1);
                        System.out.println(contenedor +" + " + numero1 + " = " + contenedor);
                    }

                    break;
                case 2:
                    if(valor==1){
                        System.out.println("Digite dos valores: ");
                        numero1 = num1.nextDouble();
                        numero2 = num2.nextDouble();
                        contenedor = calculos.restar(numero1,numero2);
                        System.out.println(numero1 +" - " + numero2 + " = " + contenedor);
                    }
                    else {
                        System.out.println("Digite un valor: ");
                        numero1 = num1.nextDouble();
                        contenedor = calculos.restar(contenedor,numero1);
                        System.out.println(contenedor +" - " + numero1 + " = " + contenedor);
                    }

                    break;
                case 3:
                    if(valor==1){
                        System.out.println("Digite dos valores: ");
                        numero1 = num1.nextDouble();
                        numero2 = num2.nextDouble();
                        contenedor = calculos.multiplicar(numero1,numero2);
                        System.out.println(numero1 +" * " + numero2 + " = " + contenedor);
                    }
                    else {
                        System.out.println("Digite un valor: ");
                        numero1 = num1.nextDouble();
                        contenedor = calculos.multiplicar(contenedor,numero1);
                        System.out.println(contenedor +" * " + numero1 + " = " + contenedor);
                    }
                    break;
                case 4:
                    if(valor==1){
                        System.out.println("Digite dos valores: ");
                        numero1 = num1.nextDouble();
                        numero2 = num2.nextDouble();
                        contenedor = calculos.dividir(numero1,numero2);
                        System.out.println(numero1 +" / " + numero2 + " = " + contenedor);
                    }
                    else {
                        System.out.println("Digite un valor: ");
                        numero1 = num1.nextDouble();
                        contenedor = calculos.dividir(contenedor,numero1);
                        System.out.println(contenedor +" / " + numero1 + " = " + contenedor);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ha seleccionado una opción fuera del rango. Reintente de nuevo");
                    break;

            }
            valor++;
        }

}
}
