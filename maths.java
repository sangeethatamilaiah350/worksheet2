/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author SANGEETHA
 */
class arithmatic
{
   int a;
   int b;
    void add(int a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println("Subraction is "+(a-b));
    }
    void mul(int a,int b)
    {
        System.out.println("Multiplication is "+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println("Division is "+(a/b));
    }
    
}
public class maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arithmatic obj=new arithmatic();
        System.out.println("enter two number");
        Scanner objt=new Scanner(System.in);
        obj.a=objt.nextInt();
        obj.b=objt.nextInt();
        obj.add(obj.a,obj.b);
        obj.sub(obj.a,obj.b);
        obj.mul(obj.a,obj.b);
        obj.div(obj.a,obj.b);
    }
    
}
