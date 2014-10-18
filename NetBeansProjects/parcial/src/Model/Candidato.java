
package Model;

public class Candidato {
    
    public static int id;   
    public static String nombre;
    public static int puntuacion;
    public int vectorVotoss[];
    public String vectorNombreCandidatos[];
    public int mayor;
    public int posicion;
    public int getId() {
        return id;
    }

    public int[] getVectorVotoss() {
        return vectorVotoss;
    }

    public String[] getVectorNombreCandidatos() {
        return vectorNombreCandidatos;
    }
            
    public int getMayor() {
        return mayor;
    }

    public int getPosicion() {
        return posicion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setVectorVotoss(int[] vectorVotoss) {
        this.vectorVotoss = vectorVotoss;
    }

    public void setVectorNombreCandidatos(String[] vectorNombreCandidatos) {
        this.vectorNombreCandidatos = vectorNombreCandidatos;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Candidato() {
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
    
    
    
}
