import java.util.Random;

public class Gra{
    public static void main(String[] args){
        
        //Scanner in=new Scanner(System.in);
        Random rand = new Random();
        
        int a;
        int b;
        
       if(args.length!=1 || Integer.parseInt(args[0])>1 || Integer.parseInt(args[0])<0){System.out.println("Bład");}
        else{
            
           a=(rand.nextInt(2)+0);
           b=Integer.parseInt(args[0]); 
            System.out.println(a);
            
        
            if(a==b){System.out.println("Wygrales");}
            else{System.out.println("Przegrales");}
    }
    }
}