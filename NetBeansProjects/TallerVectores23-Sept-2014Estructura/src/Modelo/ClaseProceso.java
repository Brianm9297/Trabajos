
package Modelo;

import Vista.ClaseVista;

public class ClaseProceso {
    
        Vista.ClaseVista obj_Vista = new ClaseVista();
        public int[] vectorA = new int [0];
        public int[] vectorB = new int [0];
        public int[] Resultado = new int [0];
        public void redireccionarMenu(){
           int opcionMenu;
           do{
              opcionMenu =  obj_Vista.solicitarInfo((obj_Vista.mostrarMenus()));
             solicitarVectores(opcionMenu);
           }while(opcionMenu!=5);
       }

        public void solicitarVectores(int opcionMenu){
           //ingreso tamaño vector 
           if(opcionMenu != 5){ 
            
            int tamVectorA = 0;
            
            tamVectorA = obj_Vista.solicitarInfo("Ingrese tamaño Vector");
          // Ingreso de vectores
            vectorA = new int [tamVectorA];
            int validaA =0;
            for (int i = 0; i < vectorA.length; i++) {
                if (opcionMenu==4) {
                validaA = obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al primer vector");
                if (validaA!=0) {
                        vectorA[i] = validaA;
                    }
                while (validaA == 0) {
                    validaA =  obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al primer vector");
                    if (validaA!=0) {
                        vectorA[i] = validaA;
                    }
                 }
                }else{
                vectorA[i] = obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al primer vector");
                }
            }
            int tamVectorB = tamVectorA;
            obj_Vista.imprimeString("Ahora Ingrese los datos del Segundo vector");
            vectorB = new int [tamVectorB];
            int validaB =0;
            
               for (int i = 0; i < vectorB.length; i++) {
                   if (opcionMenu==4) {
                       validaB = obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al Segundo vector");
                       if (validaB != 0) {
                                vectorB[i] = validaB;
                        } 
                       while (validaB == 0) {
                            validaB =  obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al Segundo vector");
                            if (validaB != 0) {
                                vectorB[i] = validaB;
                            }
                         }
                   } else {
                       vectorB[i] = obj_Vista.solicitarInfo("Ingrese dato "+(i+1)+" al Segundo vector");
                   }
                   
               }  
               
            Resultado = new int [tamVectorB];   
            
         }   
           String mensageVect="";
           
            switch(opcionMenu){
                
                case 1: // case de suma de vectores 
                   // obj_Vista.imprimeString("la suma entre vectores");
                    for (int i = 0; i < vectorA.length; i++) {
                        
                            Resultado[i] = (vectorA[i] + vectorB[i]);
                    }    
                    mensageVect = mensageVect + "Primer vector\n";
                            
                        for (int i = 0; i < vectorA.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorA[i]+" ]";
                        }
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect + "Segundo vector\n";
                            
                        for (int i = 0; i < vectorB.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorB[i]+" ]";
                        }
                            
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect +" Resultado de la suma del Vector\n";
                        
                        for (int z = 0; z < Resultado.length; z++) {
                            mensageVect = mensageVect +"[ "+ Resultado[z]+" ]";
                        }
                        obj_Vista.imprimeString(mensageVect);
                        
                    break;
                    
                case 2: // case de resta de vectores
                    for (int i = 0; i < vectorA.length; i++) {
                        
                            Resultado[i] = (vectorA[i] - vectorB[i]);
                    }    
                    mensageVect = mensageVect + "Primer vector\n";
                            
                        for (int i = 0; i < vectorA.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorA[i]+" ]";
                        }
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect + "Segundo vector\n";
                            
                        for (int i = 0; i < vectorB.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorB[i]+" ]";
                        }
                            
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect +" Resultado de la suma del Vector\n";
                        
                        for (int z = 0; z < Resultado.length; z++) {
                            mensageVect = mensageVect +"[ "+ Resultado[z]+" ]";
                        }
                        obj_Vista.imprimeString(mensageVect);
                        
                    break;
                    
                case 3: // case de multiplicacion de vectores
                    for (int i = 0; i < vectorA.length; i++) {
                        
                            Resultado[i] = (vectorA[i] * vectorB[i]);
                    }    
                    mensageVect = mensageVect + "Primer vector\n";
                            
                        for (int i = 0; i < vectorA.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorA[i]+" ]";
                        }
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect + "Segundo vector\n";
                            
                        for (int i = 0; i < vectorB.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorB[i]+" ]";
                        }
                            
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect +" Resultado de la suma del Vector\n";
                        
                        for (int z = 0; z < Resultado.length; z++) {
                            mensageVect = mensageVect +"[ "+ Resultado[z]+" ]";
                        }
                        obj_Vista.imprimeString(mensageVect);
                        
                    break;
                    
                case 4: // case de division de vectores ojo con la division por 0
                     for (int i = 0; i < vectorA.length; i++) {
                        
                            Resultado[i] = (vectorA[i]/vectorB[i]);
                    }    
                    mensageVect = mensageVect + "Primer vector\n";
                            
                        for (int i = 0; i < vectorA.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorA[i]+" ]";
                        }
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect + "Segundo vector\n";
                            
                        for (int i = 0; i < vectorB.length; i++) {
                                mensageVect = mensageVect +"[ "+  vectorB[i]+" ]";
                        }
                            
                        mensageVect = mensageVect + "\n";
                        mensageVect = mensageVect +" Resultado de la suma del Vector\n";
                        
                        for (int z = 0; z < Resultado.length; z++) {
                            mensageVect = mensageVect +"[ "+ Resultado[z]+" ]";
                        }
                        obj_Vista.imprimeString(mensageVect);
                        
                    break;
                    
                case 5: System.exit(0);
            }
        }
    
}
