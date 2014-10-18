package ejercicio_clases;

public class Punto3D {

    private double x;
    private double y;
    private double z;
    private double suma;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Punto3D sumar(Punto3D otroPunto) {
        Punto3D suma = new Punto3D();
        suma.setX(this.x + otroPunto.x);
        suma.setY(this.y + otroPunto.y);
        suma.setZ(this.z + otroPunto.z);
        
        return suma;
    }
    
     public Punto3D resta(Punto3D otroPunto) {
        Punto3D resta = new Punto3D();
        resta.setX(this.x - otroPunto.x);
        resta.setY(this.y - otroPunto.y);
        resta.setZ(this.z - otroPunto.z);
        
        return resta;
    }
    
     public Punto3D multiplicarPorEscalar(Punto3D otroPunto) {
        Punto3D porEscalar = new Punto3D();
        porEscalar.setX(this.x * otroPunto.x);
        porEscalar.setY(this.y * otroPunto.y);
        porEscalar.setZ(this.z * otroPunto.z);
        
        return porEscalar;
    }   
}
