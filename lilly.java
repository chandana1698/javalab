public class lilly
 {

   public static void main(String args[])
{
      int num1=80;
      if( num1 < 100 )
{
	  System.out.println("number is less than 100");
      }
   
     int num2=120;
     if( num2 < 80 ){
	System.out.println("num is less than 80");
     }
     else {
	System.out.println("num is greater than or equal 80");
     }
     int num3=8;
     switch(num3+8)
     {
        case 1:
	  System.out.println("Case1: Value is: "+num3);
	case 2:
	  System.out.println("Case2: Value is: "+num3);
	case 3:
	  System.out.println("Case3: Value is: "+num3);
        default:
	  System.out.println("Default: Value is: "+num3);
      }
  
         int i=10;
         while(i>1){
              System.out.println(i);
              i--;
         }
         int j=10;
         do{
              System.out.println(i);
              j--;
         }while(j>1);
    
         for(i=10;i>1;i--){
              System.out.println("The value of i is: "+i);
         }
}
}	
    



























