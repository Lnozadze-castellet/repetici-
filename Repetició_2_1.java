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

	            System.out.print("Indicate your selection [1=Rock, 2=Paper, 3=Scissors] (press 9 to exit): ");
	            num2 = jc.nextInt();

	            if (num2 == 9) {
	                System.out.println("Exiting the game...");
	                break;
	            }

	            System.out.print("The rival chose: ");
	            switch (num) {
	                case 1:
	                    System.out.println("Rock");
	                    break;
	                case 2:
	                    System.out.println("Paper");
	                    break;
	                case 3:
	                    System.out.println("Scissors");
	                    break;
	            }

	            switch (num) {
	                case 1:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("It's a draw!");
	                            empates++;
	                            break;
	                        case 2:
	                            System.out.println("You win!");
	                            puntos++;
	                            break;
	                        case 3:
	                            System.out.println("Your rival wins!");
	                            puntos2++;
	                            break;
	                    }
	                    break;
	                case 2:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("Your rival wins!");
	                            puntos2++;
	                            break;
	                        case 2:
	                            System.out.println("It's a draw!");
	                            empates++;
	                            break;
	                        case 3:
	                            System.out.println("You win!");
	                            puntos++;
	                            break;
	                    }
	                    break;
	                case 3:
	                    switch (num2) {
	                        case 1:
	                            System.out.println("You win!");
	                            puntos++;
	                            break;
	                        case 2:
	                            System.out.println("Your rival wins!");
	                            puntos2++;
	                            break;
	                        case 3:
	                            System.out.println("It's a draw!");
	                            empates++;
	                            break;
	                    }
	                    break;
	            }

	            System.out.println("Your rival has " + puntos2 + " points");
	            System.out.println("You have " + puntos + " points");
	            System.out.println();
	        }

	        if (puntos == 3) {
	            System.out.println("Congratulations! You won the game!");
	        } else if (puntos2 == 3) {
	            System.out.println("Your rival won the game. Better luck next time!");
	        }

	        //canvi exercici git
	        System.out.println("\n--- Final Statistics ---");
	        System.out.println("Your points: " + puntos);
	        System.out.println("Rival points: " + puntos2);
	        System.out.println("Draws: " + empates);

	        jc.close();
	    }
	}			//Luka Nozadze