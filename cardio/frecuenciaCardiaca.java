

package cardio;

public class frecuenciaCardiaca {
    private String nombre, apellido;
      private  int mes, dia, anio, edad, FreMax, FreEsp;
     
   public frecuenciaCardiaca(String n, String a, int m, int d, int y, int e, int FM, int FE){
         nombre = n;
         apellido = a;
         dia = d;
         mes = m;
         anio = y;
         edad = e;
         FreMax = FM;
         FreEsp = FE;
         
     }
     
     public void setNombre(String n){
         nombre = n;
     }
     
     public String getNombre(){
         return nombre;
     }
      public void setApellido(String a){
         apellido = a;
     }
     
     public String getApellido(){
         return apellido;
     }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = 2023-anio;
    }
     
     public void setFrecuenciaMax(int FM){
         FreMax = 220-edad;    
     
     }
     public int getFrecuenciaMax(){
         return FreMax;
     }
     public void setFrecuenciaEsp(int FE){
         FreEsp = FreMax*100/85;
     }
     
     public int getFrecuenciaEsp(){
         return FreEsp;
}
}

