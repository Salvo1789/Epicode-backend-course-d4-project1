package app.ElementoMultimediale;

public class Immagine extends ElementoMultimediale{
	int luminosità;
	
	public Immagine(String title, int lum){
		super(title);
		this.luminosità = lum;
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
	
	
	public void show() {
		System.err.print(this.titolo);
		for(int i = 0; i<this.luminosità; i++) {
			if (i != luminosità -1){
				System.out.print("*");
			}else {
				System.out.println("*");
			}
		}
	}
}
