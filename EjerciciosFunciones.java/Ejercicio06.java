public class Ejercicio06{
    public static void main(String[] args){
        int d = 2;
        int e = 5;
        int f = 6;
        System.out.println("Maximo de "+d+" - "+e+" - "+f+" es = "+maximo(d,e,f));
    }

   
   
   
   
   public static int maximo(int a, int b, int c){
    int maximo = 0;
    if(a > b && a > c){
        maximo = a;
    }else if(b > a && b > c){
         maximo = b;
    }else if(c > a && c >b){
         maximo = c;
    }
   return maximo;
}
}