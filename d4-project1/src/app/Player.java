package app;

import java.util.Scanner;
import app.ElementoMultimediale.ElementoMultimediale;
import app.ElementoMultimediale.Immagine;
import app.ElementoMultimediale.RegistrazioneAudio;
import app.ElementoMultimediale.Video;

public class Player {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ElementoMultimediale[] raccolta = new ElementoMultimediale[5];
		int i = 0, x;
		String name;
		do {
			System.out.print("Inserisci l'elemento multimediale num°" + (i+1) + ": ");
			name = scanner.nextLine();
			System.out.println("Che tipo di file vuoi aggiungere?");
			System.out.println("1 - Audio");
			System.out.println("2 - Video");
			System.out.println("3 - Image");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("Inserisci il volume: ");
				int vol = scanner.nextInt();
				System.out.print("Inserisci la durata: ");
				int len = scanner.nextInt();
				raccolta[i] = new RegistrazioneAudio(name, vol, len);
				scanner.nextLine();
				break;
			case 2:
				System.out.print("Inserisci il volume: ");
				vol = scanner.nextInt();
				System.out.print("Inserisci la durata: ");
				len = scanner.nextInt();
				System.out.print("Inserisci la luminosità: ");
				int lumen = scanner.nextInt();
				raccolta[i] = new Video(name, vol, len, lumen);
				scanner.nextLine();
				break;
			case 3:
				System.out.print("Inserisci la luminosità: ");
				lumen = scanner.nextInt();
				raccolta[i] = new Immagine(name, lumen);
				scanner.nextLine();
				break;
			}
			i++;
		}while(i < 5);
		do {
			System.out.println("Che elemento vuoi riprodurre?");
			for (int cont = 0; cont < 5; cont++) {
				System.out.println(raccolta[cont].toString());
			}
			x = scanner.nextInt();
			if (raccolta[x-1] instanceof RegistrazioneAudio) {
				((RegistrazioneAudio) raccolta[x-1]).play();
			}else if(raccolta[x-1] instanceof Video){
				((Video) raccolta[x-1]).play();
			}else {
				((Immagine) raccolta[x-1]).show();
			}
		}while(x < 1);
		scanner.close();
	}

}
