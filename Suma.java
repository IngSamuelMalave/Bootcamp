public class Suma{

  static int resultado1(int i){
     int r = i * 12;
     return r;
  }
  public static void  main (String args[]){

   int a = 5;
   int b = 2;
   int c = 5;
   int resultado2 = 0;
   

   resultado2 = a + b + c;

   int resultado3 = resultado1(resultado2);
   System.out.print("5 + 2 + 5 =" );
   System.out.println(" Tu suma es:" + resultado3);
  }
  
  }
  
