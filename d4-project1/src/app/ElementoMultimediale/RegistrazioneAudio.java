package app.ElementoMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale implements Playable {
	int volume, durata;
	
	
	public RegistrazioneAudio(String title) {
		super(title);
	}
	
	
	public RegistrazioneAudio(String title, int vol, int dur ){
		super(title);
		this.volume = vol;
		this.durata = dur;
	}
	
	
	@Override
	public void play() {
		for (int i = 0; i<durata; i++){
			System.out.print(this.titolo);
			for (int j = 0; j<volume; j++) {
				if (j != this.volume-1) {
					System.out.print("!");
				}else {
					System.out.println("!");
				}
			}
		}
	}
	
	
	public void abbassaVolume(int minus){
		int i=0;
		
		do {
			this.volume -= i;
			i++;
		}while(i != minus);
	}
	
	
	public void alzaVolume(int plus){
		int i=0;
		
		do {
			this.volume += i;
			i++;
		}while(i != plus);
	}
	
}
