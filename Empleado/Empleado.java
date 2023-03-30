
package Empleado;

import java.util.Scanner;

public class Empleado {
	
	private String primNom;
	private String apePat;
	private double salMen;
	
	public Empleado(){
		
		this.primNom = "";
	    this.apePat = "";
		this.salMen = 0.0;
		
	}
	
	public void establecerPrimNom(String primNom){
		this.primNom = primNom;
	}
	
	public String obtenerPrimNom(){
		return primNom;
	}
	
	public void establecerApePat(String apePat){
		this.apePat = apePat;
	}
	
	public String obtenerApePat(){
		return apePat;
	}

	public void establecerSalMen(double salMen){
		if(salMen > 0)
		this.salMen = salMen;
	}
	
	public double obtenerSalMen(){
		return salMen;
	}
	
	public void obtenerDatosEmpleado(){
		
		System.out.println("Primer Nombre: " + primNom + 
						   "\nApellido Paterno: " + apePat + 
						   "\nSalario mensual: $" + salMen);
		
	}
	
	
}