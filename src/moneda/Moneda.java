package moneda;

public class Moneda {
	
	 private String nombre;
	 private double valor;
	 public Moneda(String nom, double valorMonedaBase) {
		 this.nombre = nom;
	     this.valor = valorMonedaBase;
	 }
	 
	 public double getValor() {
	     return this.valor;
	 }

	 public void setValor(double valor) {
		 this.valor = valor;
	 }
	 
	 public String getNom() {
	      return this.nombre;
	 }

	 public void setNom(String nom) {
	      this.nombre = nom;
	 }
}
