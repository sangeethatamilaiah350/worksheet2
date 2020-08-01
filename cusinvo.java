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
class customer
{
    int id;
    String name;
    int discount;
     customer(int i,String n,int dis)
    {
        
        id=i;
        name=n;
        discount=dis;
    }
    int get_id()
    {
        return id;
    }
    String get_name()
    {
        return name;
    }
    int get_discount()
    {
        return discount;
    }
    void set_discount(int d1)
    {
        discount=d1;
    }
    public String toString()
    {
       return "customer details:\n"+"NAME: "+name+" discount: "+discount; 
    }
}
public class cusinvo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("first object of customer class");
        customer obj1=new customer(100,"sangeetha",10);//first object of customer class
        System.out.printf("ID :%d\n",obj1.get_id());
        System.out.printf("NAME:%s\n",obj1.get_name());
        System.out.printf("DISCOUNT:%d\n",obj1.get_discount());
        obj1.set_discount(5);
        System.out.printf("UPDATED DISCOUNT:%d\n",obj1.get_discount());
        System.out.println(obj1.toString());
        
        System.out.printf("\n");
        
        System.out.println("second object of customer class");
        customer obj2=new customer(200,"geetha",20);//second object of customer class
        System.out.printf("ID:%d\n",obj2.get_id());
        System.out.printf("NAME:%s\n",obj2.get_name());
        System.out.printf("DISCOUNT:%d\n",obj2.get_discount());
        obj2.set_discount(10);
        System.out.printf("UPDATED DISCOUNT:%d\n",obj2.get_discount());
        System.out.println(obj2.toString());
        
        System.out.printf("\n");

       System.out.println("first object of invoice class");
       invoice objj1=new invoice(300,obj1,1000);//first object of invoice class
       System.out.printf("ID:%d\n",objj1.get_id());
       System.out.printf("%s\n",objj1.get_customer());
       System.out.printf("AMOUNT:%f\n",objj1.get_amount());
       objj1.set_amount(7888);
       customer c2=new customer(400,"raghul",20);
       objj1.set_customer(c2);
       System.out.printf("UPDATED NAME:%s\n",objj1.getcustomer_name());
       System.out.printf("UPDATED AMOUNT:%f\n",objj1.get_amount());
       System.out.printf("AMOUNT AFTER DISCOUNT:%f\n",objj1.get_amount_after_discount());
       
       System.out.printf("\n");
       
       System.out.println("second object of invoice class");
       invoice objj2=new invoice(400,obj2,1000);//second object of invoice class
       System.out.printf("ID:%d\n",objj2.get_id());
       System.out.printf("%s\n",objj2.get_customer());
       System.out.printf("AMOUNT:%f\n",objj2.get_amount());
       objj2.set_amount(4888);
       customer c3=new customer(400,"raghu",20);
       objj1.set_customer(c2);
       System.out.printf("UPDATED NAME:%s\n",objj2.getcustomer_name());
       System.out.printf("UPDATED AMOUNT:%f\n",objj2.get_amount());
       System.out.printf("AMOUNT AFTER DISCOUNT:%f\n",objj2.get_amount_after_discount());
     
        
    }
    
}
class invoice
{
  int id;
  customer customer;
  double amount;
   
  invoice(int i,customer o1,double a)
  {
      id=i;
      customer=o1;
      amount=a;
      
  }
  int get_id()
  {
      return id;
  }
  customer get_customer()
  {
      return customer;
  }
  void set_customer(customer o2)
  {
      customer=o2;
  }
  double get_amount()
  {
      return amount;
  }
  void set_amount(double s)
  {
      amount=s;
  }
  String getcustomer_name()
  {
      return customer.name;
  }
  double get_amount_after_discount()
  {
      return amount-(amount*customer.discount)/100;
  } 
}