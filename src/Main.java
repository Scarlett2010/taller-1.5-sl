import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carta carta = new Carta("Carta con poder");
        carta.jugar();
        carta.descripcion();

        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("El maso de cartas que tienes es de 1-7");
        System.out.print("Ingresa un número de tu carta: ");
        int numeroIngresado = scanner.nextInt();

        try {
            boolean pertenece = false;
            for (int numero : numeros) {
                if (numero == numeroIngresado) {
                    pertenece = true;
                }
            }
            if (pertenece) {
                System.out.println("El número de carta ingresado pertenece a tu maso");
                if (numeroIngresado != 4 & numeroIngresado != 7) {
                    System.out.println("La carta ingresada no tiene efecto especial, te han bloqueado tu participacion");
                }
                if (numeroIngresado == 4 || numeroIngresado == 7) {
                    CartaEspecial cartaEspecial = new CartaEspecial("Carta 4", 4, true);
                    CartaEspecial cartaEspecial1 = new CartaEspecial("Carta 7", 7, true);

                    cartaEspecial.activarEfectoEspecial();
                } else {
                    System.out.println("El número de carta ingresado no pertenece al array.");
                }
            }
        }catch (ArithmeticException e){
            System.out.println("El numero ingresado no pertenece a tus cartas");
        }
        double numeroC = (double) numeroIngresado;
        System.out.println("** Conversion de variable: "+numeroC+" **");
    }
}





