package com.driver;

public class Main {
public static void main(String[] args){
    Product p=new Product();
    System.out.println(p.product(3,4));
    System.out.println(p.product(3,4,5));
    System.out.println(p.product(3.1,4.12));
}
}
class Product{
   int x;
   int y;
   int z;
   double a;
   double b;
   int product(int x,int y){
       this.x=x;
       this.y=y;
       return x*y;
   }
    int product(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
        return x*y*z;
    }
    double product(double x,double y){
       a=x;
       b=y;
       return a*b;
    }
}