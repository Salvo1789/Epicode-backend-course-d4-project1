package app.ElementoMultimediale;

public abstract class ElementoMultimediale {
	public String titolo;
	
	public ElementoMultimediale(String title){
		this.titolo = title;
	}
	
	@Override
	public String toString() {
		return this.titolo;
	}
}
