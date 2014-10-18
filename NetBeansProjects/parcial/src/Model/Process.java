
package Model;

    import View.inOut;
    import javax.swing.JOptionPane;
    import Model.Candidato;

public class Process {
   
    inOut obj_vista = new inOut();
    Candidato obj_ClasesCandidato = new Candidato();
    int cantidadCandidatos=0;
    public int vectorVotoss[];
    public String vectorNombreCandidatos[];
    public int mayor;
    public int posicion;
    //no se que ees T basado en el codigo de la profesora 
    //ya que no tiene nombres entendibles es confuso
    
    public Process(int y){
        vectorVotoss=new int [y];
        vectorNombreCandidatos=new String[y];
        mayor=0;
        posicion=0;
    }
    public Process(){}
    
    public void ingresarCandidatos(){
        //cargar el vector de Nombres
        for (int i = 0; i < vectorNombreCandidatos.length; i++) {
            vectorNombreCandidatos[i]=obj_vista.pedirDatoString("Ingrese el nombre del candidato " +(i+1));
        }
    }

    public void imprimeCandidatos(){
        String lista = " los candidatos Son\n";
        for (int i = 0; i < vectorNombreCandidatos.length; i++) {
            lista=lista+" Id "+(i+1)+" * "+vectorNombreCandidatos[i]+" \n";
        }
        obj_vista.imprimir(lista);
    }
    
    public void imprimirResultado(){
        String lista = " resultados de la votacion";
        for (int i = 0; i < vectorNombreCandidatos.length; i++) {
            lista = lista + "\t    "+vectorVotoss[i]+"\n";
        }
        obj_vista.imprimir(lista);
    }
    
    public void puntuarCandidatos(){       
        for (int i = 0; i < vectorNombreCandidatos.length; i++) {
            vectorVotoss[i]=0;    
        }
    }
    public String RecoorerVector(){
        for (int i = 0; i < vectorVotoss.length; i++) {
            obj_ClasesCandidato.setMayor(obtenerElGanador(obj_ClasesCandidato.getMayor(), vectorVotoss[i], i));
        }
        return "el ganador es "+vectorNombreCandidatos[obj_ClasesCandidato.getPosicion()]+ " con " + obj_ClasesCandidato.getMayor()+" votos";
    }
    
    public int acumuladdores(int ids){
    return ids+1;
    }
    //p = posicion 
    public int obtenerElGanador(int data1,int data2,int p){
        if (data1>data2) {
            return data1;
        } else {
            obj_ClasesCandidato.setPosicion(p);
            return data2;
        }
    }
    
    
    
    public void votosPuntuar(){
    int solicitud;
        do {            
            imprimeCandidatos();
            int opcionCandidato = obj_vista.pedirDatoEntero("Seleccione el Id del Candidato");
            vectorVotoss[opcionCandidato-1]=acumuladdores(vectorVotoss[opcionCandidato-1]);
            solicitud=obj_vista.pedirDatoEntero("1 para votar y 2 para dejar de  votar");
        } while (solicitud==1);
    }
    public boolean validarP_info(int validar){
        if (validar>0){
            return  true;
        } else {
            return false;
        }
    }
}


