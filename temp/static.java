import java.util.Scanner;
class Perimeter
{
   public static void main(String args[]) 
    { 
 Scanner s=new Scanner(System.in);
System.out.println("Enter the radius:");  
      double r= s.nextDouble();      
 	double a =PerimeterOfCircle.area(r);
      System.out.println("Perimeter of Circle is: " + c);      
}
public static double area(double r)
{
double a= (22*2*r)/7;
return a;
}
}
