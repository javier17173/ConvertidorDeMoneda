package moneda;

import java.util.ArrayList;


public class Conversor {
	
	 private Moneda monedaBase;
	 public static ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
	    
	    
	    public Conversor() {

	    }

	    public Conversor(Moneda monedaBase, Moneda otraMoneda) {
	        this.monedaBase = monedaBase;

	        listaMonedas.add(monedaBase);
	        listaMonedas.add(otraMoneda);
	    }

	    public void setLlistaMonedas(ArrayList<Moneda> listaMonedas) {
	       
	        Conversor.listaMonedas = listaMonedas;
	    }

	    public ArrayList<Moneda> getLlistaMonedas() {
	        return listaMonedas;
	    }

	    public String getNomMonedaBase() {
	        return this.monedaBase.getNom();
	    }

	    public double cambio(Moneda monedaOrigen, Moneda monedaDestino, double cantidad) {
	        double cambio = ((cantidad * monedaOrigen.getValor()) / monedaDestino.getValor());
	        return cambio;
	    }

	    public boolean agregarMoneda(Moneda monedaNueva) {
	        boolean agregar = false;
	        for (int i = 0; i < this.getLlistaMonedas().size(); i++) {
	            if(getLlistaMonedas().get(i).getNom().equals(monedaNueva.getNom())){
	                agregar = true;
	                break;
	            }
	        }
	        if(agregar == false){
	        listaMonedas.add(monedaNueva);
	        }
	        return agregar;
	    }

	    
	    public void ModificarMoneda(int pos, Moneda moneda) {
	        listaMonedas.set(pos, moneda);
	    }

	    
	    public void eliminarMoneda(Moneda moneda) {
	        Conversor.listaMonedas.remove(moneda);
	    }
}
