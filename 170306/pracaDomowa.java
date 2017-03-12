import static java.lang.Math.*;

public class pracaDomowa{
    
     String toDouble(double a){
        
       
        String Zwykly = "";
        double e=String.valueOf(a).length();
        double b=(pow(2,e-1));
        double c;
        double d=0;
        while (b>=1){
          c=a/(pow(10,(e-1)));
            if(c>=1){d=d+b;
        a=a-(pow(10,e-1));
            }
            b=b/2;
        e=e-1;
        }
        String f=d+"";
        
        return f;
    }
    
    public static void main(String[] agrs){
        pracaDomowa funkcje=new pracaDomowa();
     
    System.out.println(funkcje.toDouble(1110));
        
    }
}