
package factura;

public class Factura {
	private String numPza;
	private String descPza;
	private int qtyPzas;
	private double precPza;
	
	//Constructor
	public Factura(){
		
		this.numPza = "A0000";
		this.descPza = "Vacio";
		this.qtyPzas = 0;
		this.precPza = 0.0;
	}
	
	public void establecerNumPza(String numPza){
		this.numPza = numPza;
	}
	
	public String obtenerNumPza(){
		return numPza;
	}
	
	public void establecerDescPza(String descPza){
		this.descPza = descPza;
	}
	
	public String obtenerDescPza(){
		return descPza;
	}
	
	public void establecerQtyPzas(int qtyPzas){
		if(qtyPzas > 0){
			this.qtyPzas = qtyPzas;
		}
		else{
			System.out.println("===VALOR ERRONEO===");
		}
	}
	
	public int obtenerQtyPzas(){
		return qtyPzas;
	}
	
	public void establecerPrecPza(double precPza){
		if(precPza > 0){
			this.precPza = precPza;
		}
		else{
			System.out.println("===VALOR ERRONEO===");
		}
	}
	
	public double obtenerPrecPza(){
		return precPza;
	}
	
	public void obtenerMontoFactura(){
		
			System.out.printf("El monto de la factura es: $%.2f", qtyPzas*precPza);
		
	}
	
	public void obtenerDatosFactura(){
		
		System.out.println("Numero de pieza: " + numPza +
							"\nDescripcion: " + descPza +
							"\nCantidad de pzas : " + qtyPzas +
							"\nPrecio x pza: " + precPza);
		
		
	}
	

}


