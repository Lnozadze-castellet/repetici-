package Repetició_2;
import java.util.Scanner;
public class Repetició_2_1 {


	/*Escriu un programa que jugui a pedra-paper-tisora. El programa genera un número 0, 1 o 2 representant
	pedra, paper o tisora. El programa demana un número a l’usuari 0, 1 o 2 i mostra un missatge indicant
	si l’usuari o l’ordinador guanyen, perden o empaten. Revisa el programa per permetre a l’usuari jugar
	contínuament fins que o bé l’ordinador o bé l’usuari guanyi tres partides.*/
	
	 public static void main(String[] args) {
	        Scanner jc = new Scanner(System.in);
	        int puntos = 0, puntos2 = 0;
	        int empates = 0;

	        int num2 = 0;

	        while (puntos != 3 && puntos2 != 3) {
	            int num = (int)(Math.random() * 3) + 1; 

	            System.out.print("Indica tu elección [1=Piedra, 2=Papel, 3=Tijeras] (pulsa 9 para salir): ");
	            num2 = jc.nextInt();

	            if (num2 == 9) {
	                System.out.println("Saliendo del juego...");
	                break;
	            }

	            System.out.print("Tu rival ha elegido: ");
	            switch (num) {
	                case 1:
	                    System.out.println("Piedra");
	                    break;
	                case 2:
	                    System.out.println("Papel");
	                    break;
	                case 3:
	                    System.out.println("Tijeras");
	                    break;
	            }

	            switch (num) {
	                case 1:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("Es un empate!");
	                            empates++;
	                            break;
	                        case 2:
	                            System.out.println("Tú ganas"!");
	                            puntos++;
	                            break;
	                        case 3:
	                            System.out.println("Tu rival gana!");
	                            puntos2++;
	                            break;
	                    }
	                    break;
	                case 2:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("Tu rival gana!");
	                            puntos2++;
	                            break;
	                        case 2:
	                            System.out.println("Es un empate!");
	                            empates++;
	                            break;
	                        case 3:
	                            System.out.println("Tú ganas!");
	                            puntos++;
	                            break;
	                    }
	                    break;
	                case 3:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("Tú ganas!");
	                            puntos++;
	                            break;
	                        case 2:
	                            System.out.println("Tu rival gana!");
	                            puntos2++;
	                            break;
	                        case 3:
	                            System.out.println("Es un empate!");
	                            empates++;
	                            break;
	                    }
	                    break;
	            }

	            System.out.println("Tu rival tiene " + puntos2 + " puntos");
	            System.out.println("Tú tienes " + puntos + " puntos");
	            System.out.println();
	        }

	        if (puntos == 3) {
	            System.out.println("Enhorabuena! Has ganado el juego!");
	        } else if (puntos2 == 3) {
	            System.out.println("Tu rival ha ganado el juego. Mejor suerte a la próxima!");
	        }

	        //canvi exercici git
	        System.out.println("\n--- Estadísticas finales ---");
	        System.out.println("Tus puntos: " + puntos);
	        System.out.println("Puntos del rival: " + puntos2);
	        System.out.println("Empates: " + empates);

	        jc.close();
	    }
	}			//Luka Nozadze