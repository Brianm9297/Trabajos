
package Modelo;
import Vista.inOut;
public class Proceso {
    private int TR=0;
    private int Terror=0;
    private int mc=0;
    private int Mayor=0;
    inOut o=new inOut();
    
    public int obtenerTCompra(int v, int c){
      return  v*c;
    }
    
    public void regresarCompra(){
        int opcion;
        do{
           opcion= o.mostrarMenu(); 
           ejecutarMenu(opcion);
            
        }while(opcion>=1 && opcion<5);
      }
        
    
    public int acumular(int dato1, int dato2){
        return dato1+dato2;  
    }
      public int evaluarMayor(int dato1, int dato2,int dato){
        
        if(dato1<dato2){
            mc=dato;
            return dato1;
        }else{
            return dato2;
        }
    }
        public void ejecutarMenu(int op){
           int vp,c=0,tc=0;
           int afil=0;
            TR=acumular(TR, tc);
            switch(op){
                case 1: vp=2000;
                        c=o.solicitarD("Ingrese cantidad peliculas de Terror");
                        afil=o.solicitarD("Ingrese si es afiliado si es afiliado digite 1 delo contrario 0");
                        if(afil==1){
                        //aplicar descuento
                        }
                        tc=obtenerTCompra(vp, c);
                        Terror=acumular(Terror, c);  
                        Mayor=evaluarMayor(Mayor, c,op);break;
              
                case 5: System.exit(0);  break;   
            }
            TR=acumular(TR, tc);
        }
        public int mayorCantidad(){
            if (mc==1) {
                return Terror;
            }
         
            return 0;

        }

    public int getTR() {
        return TR;
    }

    public int getTerror() {
        return Terror;
    }
    public int getMc() {
        return mc;
    }

    public int getMayor() {
        return Mayor;
    }

    public inOut getO() {
        return o;
    }
        
}
