package it.poligoni;

public class Rettangolo {
	private int base;
	private int altezza;
	
	public Rettangolo() {	
	}
	
	public int calcolaArea() {
		return base*altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
	

}
