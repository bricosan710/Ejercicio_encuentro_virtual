
import java.util.Scanner;


public class Triangulo
{
      
    private double lado1;
    private double lado2; 
    private double lado3;
    private double Area;
    private double semiperim;
    private double Perimetro;
    
    
    public Triangulo () {
      Scanner teclado= new Scanner (System.in);
    System.out.println ("Ingrese lado 1 del triangulo ");
    lado1= teclado.nextInt ();
    System.out.println ("Ingrese lado 2 del triangulo ");
    lado2= teclado.nextInt ();
    System.out.println ("Ingrese lado 3 del triangulo ");
    lado3= teclado.nextInt ();
        }
    
         public void hallarPerimetro () {
        Perimetro= lado1 + lado2 + lado3;
        System.out.println ("El perimetro es: "+ Perimetro);
    }
    
    public void semiperim() {
        semiperim= (lado1 + lado2 + lado3) / 2;
    }
    
    public void hallarArea () {
        Area= (Math.sqrt (semiperim *(semiperim-lado1)*(semiperim-lado2)*(semiperim-lado3)));
        System.out.println ("El area es: "+ Area);
        
    }
        
    public static void main (String [] args) {
            
        Triangulo objeto= new Triangulo ();
        
        objeto.semiperim ();
        objeto.hallarPerimetro ();
        objeto.hallarArea ();
        
                 
    }
    }
    
