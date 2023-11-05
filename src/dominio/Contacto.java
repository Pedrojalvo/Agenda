package dominio;
import java.io.Serializable;

public class Contacto implements Serializable{

    private String nombre;
    private int númeroDeTeléfono;

    public void setNombre(String nombre){
		this.nombre = nombre; 
	}
	public void setNúmeroDeTeléfono(int númeroDeTeléfono){
		this.númeroDeTeléfono = númeroDeTeléfono;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNúmeroDeTeléfono(){
		return númeroDeTeléfono;
	}

    Public String toString(){
        String result = ("Contacto: " +nombre+ "número de teléfono: " +númeroDeTeléfono+ "Agenda\n");
        return result;

    }
}