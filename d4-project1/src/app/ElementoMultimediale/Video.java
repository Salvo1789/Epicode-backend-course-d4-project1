package app.ElementoMultimediale;

public class Video extends ElementoMultimediale implements Playable{
int volume, durata, luminosità;
	
	public Video(String title, int vol, int dur, int lum ){
		super(title);
		this.volume = vol;
		this.durata = dur;
		this.luminosità = lum;
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
				for (int k = 0; k < this.luminosità; k++) {
					if (j != this.luminosità-1) {
						System.out.print("*");
					}else {
						System.out.println("*");
					}
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
	
	
	public void abbassaLuminosità(int minus){
		int i=0;
		
		do {
			this.luminosità -= i;
			i++;
		}while(i != minus);
	}
	
	
	public void alzaLuminosità(int plus){
		int i=0;
		
		do {
			this.luminosità += i;
			i++;
		}while(i != plus);
	}
}
