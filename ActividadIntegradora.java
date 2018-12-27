package actividadintegradora;
import java.util.Scanner;
/**
 *
 * @author Laura
 */
public class ActividadIntegradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        int n1,n2,n3;
        
        System.out.println("Ingrese primer valor");
        n1=sc.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        n2=sc.nextInt();
        
        System.out.println("Ingrese el tercer valor");
        n3=sc.nextInt();
        
        if (n1>n2 && n1>n3){
        System.out.println("El valor mayor es: "+n1);
    }
        else{
            if (n2>n1 && n2>n3){
                System.out.println("El valor mayor es: "+n2);
                
                 }
            else{
                System.out.println("El valor mayor es: "+n3);
            }
        }
       
        
        
        
        
    }
    
}
