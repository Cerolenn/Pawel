public class BMI{
    public static void main(String[] args){
        
        
        if(args.length<2 || args.length>2){System.out.println("Bład Danych");}
        else{
        float a=Integer.parseInt(args[0]);
        float b=Integer.parseInt(args[1]);
        float c=(a/(b*b));
        
        if (c<18.5) {System.out.println("Niedowaga");}
        else if(c>24.99){System.out.println("Nadwaga");}
        else{System.out.println("Waga prawidlowa");}
        }
        
    }
}