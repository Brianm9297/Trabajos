
package ejecriciocondicional;
import java.util.Scanner;
public class EjecricioCondicional {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese Numero para determinar si es par o impar:\n");
        num = leer.nextInt();
        if(determinar(num)) {
            System.out.println("El Numero es Par "+num);
        } else {
           System.out.println("El Numero es imPar "+num);
        }
        
        System.out.println("Digite un numero para determinar la cantidad de digitos"); 
        int numCanDigitos = 0;
        numCanDigitos=leer.nextInt();
        cantDigitos(numCanDigitos);    
        
        System.out.println("validacion letra");
        int enter=0;
        System.out.println("Ingrese 1 para validacion letra de lo contrario ingrse 0"); 
        enter = leer.nextInt();
        if (enter==1) {
            letraValida(enter);
        }else{
            System.out.println("Ok bye bye");
        }
      
    System.out.println("Ingrese Sintomas para determinar el Diagnostico");
    diagnostico(1);
        int valorAbrigo=0;
        System.out.println("Compra Abrigo");
        System.out.println("Digite el valor del Abrigo");
        valorAbrigo = leer.nextInt();
        compraAbrigo(valorAbrigo);
        
        int digitoDeTres=0;
        System.out.println("Ingrese digito de 3 Cifras");    
        digitoDeTres=leer.nextInt();
        diigitodeTress(digitoDeTres);
    }
    public static boolean determinar(int numero){
        if (numero%2==0) {
            return true;
        }else{
            return false;
        }
    }
    public static int cantDigitos(int numero){
            int CantDig = 0;
            int valor = numero;

            while (valor>0){
              valor = valor/10;
              CantDig++;
            }
            System.out.println("El Numero "+numero + " tiene " + CantDig + " dígitos");
            return 0;
    }
    public static char letraValida(int enter){
    char letra=0;
    Scanner leer = new Scanner(System.in);
      do{
          System.out.println("Ingrese Letra:\n");
          letra=leer.next().charAt(0);
          System.out.println("letra ingresada es : "+letra);
        if (letra=='a'){
            System.out.println("letra ingresada correcta : "+letra);
        } else {
            System.out.println("error incorrecta : "+letra);
        }
        }while(letra!='a');    
      
    
        return letra;
    }
    public static void diagnostico(int valida){
        Scanner leer = new Scanner(System.in);
        int resp=0;
        int resp2=0;
        int resp3=0;
            System.out.println("Lista de Sintomas");
            System.out.println("1) Dolor de Cabeza");
            System.out.println("2) Fiebre");
            System.out.println("3) Escalofrios");
            System.out.println("4) Cansancio Extremo");
            System.out.println("5) Fatiga");
            System.out.println("6) Dolor de Estomago");
            System.out.println("Ingrese numero del Primer Sintoma\n");
            resp=leer.nextInt();
            System.out.println("Ingrese numero del Segundo Sintoma\n");
            resp2=leer.nextInt();
            System.out.println("Ingrese numero del Tercer Sintoma\n");
            resp3=leer.nextInt();
            int suma=0;
            suma=resp+resp2+resp3;
            if(suma==6){
                System.out.println("Diagnostico Gripa\n");
            }if(suma==10){
                System.out.println("Diagnostico Estres\n");
            }if (suma==9) {
                System.out.println("Diagnostico Esta Intoxicado\n");
            }if(suma!=9 && suma!=6 && suma!=10){
                System.out.println("sin Diagnostico\n");
            }           
            
    }
    public static void compraAbrigo(int valorAbrigo){
        Scanner leer = new Scanner(System.in);
        int ahorroMaria=0;
        int dineroPadre=0;
        int dineroMadre=0;
        int mitad=0;
        int sumaDinero=0;
        int compra=0;
        int res=0;
        System.out.println("Digite el ahorro de Maria");
        //dinero ahorradopor Maria
        ahorroMaria = leer.nextInt();
        System.out.println("Digite Dinero Total el Padre");
        dineroPadre = leer.nextInt();
        //Mitad guarda el dinero aportado por el padre
        mitad=dineroPadre/2;
        System.out.println("Dinero aportado por Padre "+mitad);
        //la madre de maria la  tercera parte de lo que aporto el padre
        dineroMadre=mitad/3;
        System.out.println("Dinero aportado por la Madre "+dineroMadre);
        //suamar ahorros y aportes
        sumaDinero=ahorroMaria+mitad+dineroMadre;
        //validar 
        if (sumaDinero>=valorAbrigo) {
            res=sumaDinero-valorAbrigo;
            System.out.println("Compra el Abrigo ");
            System.out.println("Cambio "+res);
        }if(valorAbrigo>sumaDinero){
            res=valorAbrigo-sumaDinero;
            System.out.println("No alcanza para la Compra del Abrigo ");
            System.out.println("Falta "+res+" para comprar el Abrigo");
        }
        
        
    }
    public static void diigitodeTress(int digito){
        int digito1=0;
        int diez=10;
        digito1=digito%diez;
        System.out.println("Digito es  "+digito1);
        if((digito1==3) || (digito1==6) || (digito1==9)){
            System.out.println("El ultimo digito es multiplo Tres : "+digito1);
        }else{
            System.out.println("El ultimo digito NO es multiplo Tres "+digito1);
        }
      
        
    }
    
}
