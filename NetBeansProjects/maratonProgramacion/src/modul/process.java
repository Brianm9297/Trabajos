
package modul;
import view.inOut;
public class process {
    inOut vistas=new inOut();
    public process() {
    }
       public void regresarSeleccion(){
        int opcionM;
        do{
           opcionM= vistas.mostrarMen();
           ejecutarMenu(opcionM);
            
        }while(opcionM>=1 && opcionM<=6);
      }
      public void ejecutarMenu(int select){
          switch(select){
                  case 1:
                        
                        do{
                            
                        }while();
                  break;
                      
                  case 2:

                      do{
                          
                      }while();
                  break;    
                }      
      }
    
    
}
