
package cardio;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFrecuenciaCardiaca {
     public static  void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        frecuenciaCardiaca miCardio = new frecuenciaCardiaca("luis","martinz ",04,11,2002,30,150,200);
        
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
     
        String nombre = JOptionPane.showInputDialog ("Escribe tu nombre: ");  
        miCardio.setNombre(nombre);
        
        String apellido = JOptionPane.showInputDialog("Escribe tu apellido: ");
        miCardio.setApellido(apellido);
        
        String dia = JOptionPane.showInputDialog ("Escribe tu dia de nacimiento: ");
        int di = Integer.parseInt(dia);
        miCardio.setDia(di);
        
         String mes = JOptionPane.showInputDialog ("Escribe tu mes de nacimiento: ");
        int me = Integer.parseInt(mes);
        miCardio.setMes(me);
        
          String ani = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
        int anio = Integer.parseInt(ani);
        miCardio.setAnio(anio);
        
        miCardio.setEdad(anio);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());
        
          JOptionPane.showMessageDialog(null,"Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "Tu edad es: " + miCardio.getEdad() + "Tu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "Tu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
     }
}

