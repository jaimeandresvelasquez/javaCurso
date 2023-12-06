
package operadoraritmetico;

public class OperadorAritmetico {

    public static void main(String[] args) {
        
        var a =3;
        var b =4;
        
        
        var c =a!=b;
        var d = a==b;
       System.out.println("C= "+c);
       
       var g=a<=b;
       
        System.out.println("g="+g);
        
        if (a%2 == 0) {
            System.out.println("la variable a es par");
            
        }
        else{
            System.out.println("la variable a es impar");
        }
        
        var edad=30;
        var adulto=18;
        
        if (edad>=adulto){
            System.out.println("Es adulto");
        
        }
        else{
            System.out.println("es menor de edad");
        
        }
        
      
       
    }
    
}
