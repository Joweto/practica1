
package github;


public class Github {

  
    public static void main(String[] args) {
        int resres, resmul;
    
   
   resres = resta(20,10);
   resmul = multiplicacion(12,10);
   
   System.out.print("\n La resta es:" + resres);
   System.out.print("\n La multiplicacion es:" + resmul);
        
    }
    
    public static int resta (int a, int b){
        int res;
        res = a - b;
        return res;
        

    }
  
  public static int multiplicacion (int a, int b){
        int res;
        res = a * b;
        return res;
    }
    
    
    
    
    
    
}
