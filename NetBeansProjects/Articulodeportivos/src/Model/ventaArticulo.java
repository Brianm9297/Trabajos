
package Model;
public class ventaArticulo {
    private int TR=0;
    private int A1=0;
    private int A2=0;
    private int A3=0;
    private int A4=0;
    private int A5=0;
inOut view=new inOut();    
    public int obtenerTCompra(int valor, int cant){
        return valor*cant;
    }
    public void regresarCompra(){
        int opc;
         do{
            opc=view.mostrarMenu();
        ejecutarMenu(opc);
        }while(opc>=1&&opc<=6);
    }
    public int acumular(int da,int dn){
        return da*dn;
    }
    public int evaluarmayor(int d1,int d2){
        if (d1>d2) {
            return d1;
        }else{
            return d2;
        }
    }
    public int obtenerMayot(){
        int Mayor=0;
          for(int i=1;i<=5;i++){
             Mayor=evaluarmayor(Mayor,A2);
            }
    }
}
