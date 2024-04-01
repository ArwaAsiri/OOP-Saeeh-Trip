/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.Scanner;


/**
 * This class has 8 private vairabels , with diffrent data types 3 of String , 3 of int , 1 of boolean , 1 of double .
 * We used all of the setter and getter methods.
 * we override  6 methods from class super  ; age , meals , disable , discount , extra , toString .
 * @author Norah ALuhaimi
 */
public class Airplane implements Super {

    private String way;
    private int flexible;
    private String type;
    private String level;
    private boolean meal;
    private int luggage;
    private double BagWight;
    private int days;

    public Airplane() {
    }

    public Airplane(String way, int flexible, String type, String level, boolean meal, int luggage, double BagWight, int days) {
        this.way = way;
        this.flexible = flexible;
        this.type = type;
        this.level = level;
        this.meal = meal;
        this.luggage = luggage;
        this.BagWight = BagWight;
        this.days= days;
    }

   

    public void setWay(String way) {
        this.way = way;
    }

    public void setFlexible(int flexible) {
        this.flexible = flexible;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public void setBagWight(double BagWight) {
        this.BagWight = BagWight;
    }

    public void setTime(int days) {
        this.days = days;
    }

    public String getWay() {
        return way;
    }

    public int getFlexible() {
        return flexible;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }

    public boolean isMeal() {
        return meal;
    }

    public int getLuggage() {
        return luggage;
    }

    public double getBagWight() {
        return BagWight;
    }

    public int getdays() {
        return days;
    }
   
   
 
   
    /****
     * this method has a discount for people under 12 years old .
     * @param a int
     * @param b double
     * @return double
     */
   
@Override
    public double age(int a,double b){
        double z=0;
        System.out.println("because there"+a+"people under 12 years old you will have discount on price of the ticket ");
        z= b-(a*15);
       return z;
    }
   
    /****
     * in this method we're asking the patients if the require a special meal or not .
     * @return boolean
     */
    public boolean meal(){
        Scanner in =new Scanner(System.in);
        boolean bol = false ;
        do {
            try {
               
        System.out.println("does the patient wants a special meal?");
        System.out.println("1- yes \n 2- no");
        int x =in.nextInt();
       
        if(x==1){
             bol = false ;
             
            return true;
           
        }
        else if (x==2){
           
            bol = false ;
         
            return false;
        }else {
            System.out.println("Enter number  again");
            bol = true ;
        }
            }catch(Exception e){
               
                System.out.println(" Enter number  again ");
                bol = true ;
                in.next();
        }
            }while(bol);
       
         return false;
       
        }
   
   
    /****
     * this method is related   to  the past one so that seeks the patients require .
     * @param a int
     * @param meal boolean
     * @return double
     */
 
@Override
    public  double meals(int a,boolean meal){
        Scanner user=new Scanner(System.in);
        double z=0;
        boolean bol = false ;
        do {
            try {
                System.out.println("What kind of special meal does the patient want?");
                System.out.println("1-Diabetic meal\n2- gluten free meal\n3-vegetarian meal");
                int x=user.nextInt();
       
        switch(x){
            case 1:
                bol = false ;
                break ;
            case 2:
                bol = false ;
                break;
            case 3:
              z=15*a;
               bol = false ;
              break;
            default:
              System.out.println("wrong input try again");
              bol = true ;
        }
        }catch (Exception e){
                System.out.println(" Enter number  again ");
                bol = true ;
                user.next();
        }
        }while(bol);
      return z;  
    }
   
    /****
     * this method is to determine weather the passenger needs assistant or not .
     * @param a int
     * @return String
     */
   
@Override
    public String disable(int a){
        Scanner user=new Scanner(System.in);
        String s = "";
        boolean bol = false ;
        do {
            try {
               
        System.out.println("Does the patient need assistant during the plane flight?");
        System.out.println("1-yes\n2-no");
        int x=user.nextInt();
        if(x==1){
           
           
           s =  " assistant will be reserved ";
            bol = false ;
           return s ;
        }
        else if (x==2 ){
            s= "no assistant ";
             bol = false ;
             return s ;
             
        }
        else{

            System.out.println(" Enter number again");
          bol = true ;
           
        }
       
      }catch(Exception e) {
           System.out.println(" Enter number  again ");
                bol = true ;
                user.next();
       
    }
        }while (bol) ;
               
         return s ;
         
       
        }
    /****
     * this is a  %15 discount for groups .
     * @param b double
     * @param a int
     * @return double
     */
   
@Override
    public double discount(double b,int a){
      double z=0;
        if(a>=5){
        System.out.println("because you are a group there will be a special Discount 15% on room reservation");
         z=(b*15)/100;
       
        return z;
        }
        else{
         return z;  
        }
    }
    /****
     * this method determine if the passengers have a carry on and how are they .
     * @return double
     */
   
   @Override
    public double extra(){
         Scanner user=new Scanner(System.in);
         double z=50;
         boolean bol ;
         int x=0;
           //x = user.nextInt();
         do {
             try{
                 
        System.out.println("the number of bags allowed 2 per person");
        System.out.println("How many extra bags do you want to carry on the plane?");
         x = user.nextInt();
 
          bol = false ;
         
             }catch (Exception e) {
                 
                 System.out.println(" enter an integer number please  ");
                 bol = true ;
                 user.next();
             }
                 
         }while(bol) ;
         
        return x*z;
    }
   
    /****
     * this is a method to display every parameter in string .
     * @return String
     */
@Override
    public String toString() {
        return "Airplane{" + "way=" + way + ", flexible=" + flexible + ", type=" + type +
                ", level=" + level + ", meal=" + meal + ", luggage=" + luggage + ", BagWight=" + BagWight + ", days=" + days + '}';
    }
   
    /****
     * it's a method to know if the passenger would go for a one way  trip or a round trip and their prices  .
     * @param t Traveler
     * @return String
     */
      public String Direction (Traveler t){        
         Scanner in = new Scanner (System.in);
         String Direction= "";
        // int price = 0 ;
        boolean bol = false ;
        do {
         try {  
       
        System.out.println(" Enter 1 for one way and 2 for round trip ");
        int  D = in.nextInt();
       
        if (D  == 1 ) {
             Direction = "  one way ";
            t.price+=500;
            bol=false ;
           
           
        } else if (D == 2 ) {
           
           Direction=" round trip ";
 
             t.price+=1531;
           bol = false ;
           
        } else  {
           System.out.println(" pleas stick with the displayed numbers \n");
         bol = true ;
         
        }
         
       }catch( Exception e ) {
             System.out.println(" Enter number again  ");
             bol = true ;
             in.next();
         }
         
       }while(bol);
             
        return Direction;  
    }
     
   /****
    * this method for the passenger to chose the type and the suitable  airline for them and the prices .
     * @param t Traveler
    * @return String
    */
    public String Type (Traveler t ){
        Scanner in = new Scanner (System.in);
        int A ;
        String type = "";
       boolean bol = false ;
        do {
           try {
               
        System.out.println(" please choose an airline ");
       
        System.out.println("1 = Saudi Airlines \n 2 = Flynas Airlines \n  3 = Emirates Airlines ");
        A = in.nextInt();

        if (A == 1 ) {
           
             type = " Saudi Airlines ";
   
             t.price+=1531;
             bol = false ;
             
        } else if (A == 2 ){
            type = " Flynas Airline";
            t.price+=1039;
            bol = false ;
        }
   
        else if (A == 3 ){
            type = "Emirates Airlines ";
             t.price+=2273;
             bol = false ;
             
        } else {
            System.out.println("pleas stick with the displayed numbers \n");
            bol = true ;
           
           
        }
           }catch(Exception e) {
               System.out.println(" Enter number again   ");
               bol = true ;
               in.next();
               
           }
        }while(bol);
       
       return type ;  
       
    }
   /****
    * this method is to determine the bag weight .
    * @return int
    */
   public int BagWieght (){
      Scanner in = new Scanner (System.in);
      int L = 0 ;
      boolean bol = false ;
     
     do{
         try {
             
       System.out.println("pleas enter your bag weight in Kg ");
       L = in.nextInt();
       bol = false ;
       
         }catch(Exception e){
             System.out.println(" enter an integer number please ");
             bol = true ;
             in.next();
         }
           
       }while (bol);
     
       
       return L;
   }
   
   /****
    * it's a method for the passenger to chose the level of the seat weather First class or business or economy and
    displays its price .
     * @param t Traveler
    * @return String
    */
   public String Level (Traveler t ){
     
       Scanner in = new Scanner (System.in);
       int V = 0;
       String v = "";
       boolean bol = false ;
       do {
           try {
                  System.out.println(" what kind of level would you like ? \n pleas Enter 1 for Fist Class \n "
                          + "and 2 for Business class \n and 3 for Economy class");
                   V=in.nextInt();
         
       if ( V == 1){
           
           v = "First class";
           t.price+=1500;
           bol = false ;
           
       } else if  (V == 2) {
           
           v= "Business class";
            t.price+=100;
            bol = false ;
           
       } else if ( V == 3){
           v= " Economy class";
           t.price+=500;
           bol = false ;

       } else {
           System.out.println(" please stick with the desplayed numbers ");
           bol = true ;
       }
           }catch(Exception e ) {
               System.out.println(" Enter number again\n ");
               bol = true ;
               in.next();
               
           }
       }while(bol);
       return v ;
   }
   
   /****
    * this method is to know for how many days the passenger will stay in .
    * @return int
    */
   public int days (){
       Scanner in = new Scanner (System.in);
       int T = 0  ;
       
       boolean bol = false ;
       do {
           try {
           
           System.out.println(" for how many days are you staying ? ");
           T = in.nextInt();
           bol = false; 
           }catch (Exception e ) {
               System.out.println("the number must be an integar number\n");
               bol = true ;
               in.next();
           }
           
       }while(bol);
       
       return T ;
   
   }
   
   /****
    * this method to add more flexibility to the time they're staying in
    * @param a int
    * @return int  
    */
   public int Flix (int a){
        Scanner in = new Scanner (System.in);
        int F=0;
        boolean bol = true ;
        do {
            try {
               
        System.out.println(" if you are going to stay more than the selected days ( " +a+ " ) pleas Enter positive numbers "
                + "\n or if it's less than the selected days please Enter negative numbers ");
        F = in.nextInt();
        bol = false ;
       
            }catch (Exception e){
                System.out.println("the number must be an integar number");
               
               bol = true ;
               in.nextInt();
            }
        }while (bol);
        return F ;

   }
 
}
