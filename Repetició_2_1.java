package Repetició_2;
import java.util.Scanner;
public class Repetició_2_1 {


	/*Escriu un programa que jugui a pedra-paper-tisora. El programa genera un número 0, 1 o 2 representant
	pedra, paper o tisora. El programa demana un número a l’usuari 0, 1 o 2 i mostra un missatge indicant
	si l’usuari o l’ordinador guanyen, perden o empaten. Revisa el programa per permetre a l’usuari jugar
	contínuament fins que o bé l’ordinador o bé l’usuari guanyi tres partides.*/
	
	public static void main(String[] args) {
		 int num = (int)(Math.random() * 3) + 1;
		 Scanner jc=new Scanner(System.in);
		 int puntos=0, puntos2=0;
		 
		 int num2=0;

		 while(puntos!=3 && puntos2!=3 ){
			 System.out.print("Indicate your selection [1=Rock, 2=Paper, 3=Scissors](press 9 to exit): ");
			 num2=jc.nextInt();
			switch(num) {
			 
			 case 1:
				 System.out.print("The rival choosed: ");
				 System.out.println("Rock");
				 switch ( num2 )
		        {
		        	case 1: System.out.println("It's a draw!"); break;
		        	case 2: System.out.println("You win!"); break;
		        	case 3: System.out.println("Your rival wins!"); break;
		        }
		        break;
			 case 2:
				 System.out.print("The rival choosed: ");
		        System.out.println("Paper");
		        switch ( num2 )
		        {
		        	case 1: System.out.println("Your rival wins!"); break;
		        	case 2: System.out.println("It's a draw!"); break;
		        	case 3: System.out.println("You win!"); break;
		        }
		        break;
		     case 3:
		   	  System.out.print("The rival choosed: ");
		            System.out.println("Scissors");
		            switch ( num2 )
		            {
		               case 1: System.out.println("You win!"); break;
		               case 2: System.out.println("Your rival wins!"); break;
		               case 3: System.out.println("It's a draw!"); break;
		            }
		            break;
			 }
			if(num2==num) {
				puntos++;
				System.out.println("Your rival has "+ puntos2 + " points");
				System.out.println("You have "+ puntos + " points");

			}else if(num2!=num) {
				puntos2++;
				System.out.println("Your rival has "+puntos2+ " points");
				System.out.println("You have "+ puntos+ " points");
				
			} 
		}
	}	 
}				//Luka Nozadze