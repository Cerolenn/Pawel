public class Iloczyn{
    public static void main(String[] args){
        
       
        
        
        float b=1;
        float c;
        
        if(args.length<2 || args.length>10){System.out.println("Bład");}
        else{
            
            for(int a=0;a<args.length;a++){
                c=Float.parseFloat(args[a]);
                b=b*c;
            }
             System.out.println(b);
        }
        
        
    }
}