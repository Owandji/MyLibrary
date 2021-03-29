package be.iccbxl.poo;

import java.util.Scanner;

public class MainApplication1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
			
		System.out.println("Bienvenue à la librarie Les AS");
		System.out.println("------------------------------");
		
	int cmd = 0;
			
			do {
				// Affichage du menu principal 
					System.out.println("1 - Créer un membre\n" 
					   +"2 - Créer un livre\n"
					   +"3 - Emprunter un livre\n"
					   +"4 - Afficher les statistiques\n"
					   +"0 - Quitter\n");
				
				//Lire le choix de l'utilisateur
				System.out.println("Entrez votre choix: ");	
				cmd = s.nextInt();
				
				//Traiter la demande de l'utilisateur 
				switch(cmd) {
				case 1:
					System.out.println("Ajouter un membre");
					break;
				case 2:
					System.out.println("Ajouter un livre");
					break;
				case 3:
					System.out.println("Emprunter un livre");
					break;
				case 4:
					System.out.println("Afficher les statistiques");
					break;
				}
			
				
			} while(cmd!=0);
			

		}

}
