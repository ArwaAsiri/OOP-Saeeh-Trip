/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;


import java.util.Scanner;

/**
 * This class implements the interface Super
 *This class allows the user to reserve the type of accommodation he desires by displaying the options available to him
 * @author razan
 */
public class Accomodation implements Super {
   private String type;
   private int stars;
   private int numOfRoom;
   private boolean meal;

    public Accomodation() {
    }

    public Accomodation(String type, int stars, int numOfRoom, boolean meal) {
        this.type = type;
        this.stars = stars;
        this.numOfRoom = numOfRoom;
        this.meal = meal;
        
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }


    public String getType() {
        return type;
    }

    public int getStars() {
        return stars;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public boolean getMeal() {
        return meal;
    }

    /****
     * this method Make a discount on the price of the meal, according to the number of children
     * @param a as int to get the number of kids 
     * @param b as double to get the price of the meal
     * @return double to return the price after calculation 
     * @author razan
     */
    @Override
    public double age(int a,double b){
        double z=b;
        System.out.println("because there"+a+"people under 12 years old you will have discount on the price of the meal ");
        z=b-(a*20);
       return z; 
    }
    
    
    /****
     * this method Calculates the price of the selected paid meal type and multiplies it with the number of trip members
     * @param a as int to get the numbers of all the members in the trip
     * @param meal as boolean if the user want a meal in the first place or not
     * @return double to return the price after calculation 
     * @author razan
     */
    @Override
    public  double meals(int a,boolean meal){
        Scanner user=new Scanner(System.in);
        double z=0;
        boolean bol=false;
        do{
         try {
           System.out.println("what paid meals would you have?");
           System.out.println("1-breakfast only\n2-lunch Only\n3-dinner only\n4-Breakfast and lunch\n5-Breakfast and dinner.\n6-Lunch and dinner\n7-All three meals");
           int x=user.nextInt();
            switch(x){
            case 1:
              z=50*a;
              bol=false;
              break;
            case 2:
            case 3:
             z=70*a;
             bol=false;
             break;
            case 4:
            case 5:
              z=120*a;
              bol=false;
              break;
            case 6:
              z=140*a;
              bol=false;
              break;
            case 7:
              z=160*a;
              bol=false;
              break;
            default:
                System.out.println("wrong input try again");
                bol=true;
        }
         }
         catch(Exception e) {
             
            System.out.println("please enter a number");
            bol=true;
            user.next();
         }
         
        }while(bol);
        
      return z;  
    }
    /****
     * this method Asks the user if the disabled person needs a room designated for the disable
     * @param a as int to get the number of disabled
     * @return String to print it in the reservation
     * @author razan 
     * 
     */
    @Override
    public String disable(int a){
        
        Scanner user=new Scanner(System.in);
        if(a>0){
         boolean bol=false;
         do{
        try{
        System.out.println("Does the patient need a room for the disabled?");
        System.out.println("1-yes\n2-no");
        int x=user.nextInt();
        if(x==1){ 
            return "adisabled room will be reserved ";
        }
        else if(x==2){
            return".";
        }
        else{
           System.out.println("wrong input try again");
           bol=true; 
        }
        }
        catch(Exception e){
          System.out.println("please enter a number");
          bol=true;
          user.next();
        }
         }while(bol);
        }
        return".";
    }
    /****
     *  this method Calculate the discount for group trips
     * @param b as double to get the price for the total reservation
     * @param a as int to  get the numbers of all the members in the trip
     * @return double to return the price after calculation 
     * @author razan
     */
     @Override
    public double discount(double b,int a){
        double z=b;
        if(a>=5){
        System.out.println("because you are a group there will be a special Discount 20% on airline tickets");
         z=(b*20)/100;
        
        return z;
        }
        else{
         return z;   
        }
    }
    /****
     * this method ask the user if he wants additional paid services
     * @return double to return the price after calculation 
     * @author razan
     */
    @Override
    public double extra(){
        Scanner in=new Scanner(System.in);
        double z=0;
        boolean bol=false;
        do{
        try{
        System.out.println("If you want additional paid services such as the availability of household appliances, an extra bed, a meeting room, a salon, and others enter 1 for yes and 2 for no");
        int x=in.nextInt();
        if(x==1){
           z=300; 
           bol=false;
        }
        else if(x==2){
           bol=false; 
        }
        else{
            System.out.println("wrong input try again");
            bol=true;
            
        }
        }
        catch(Exception e){
           System.out.println("please enter a number");
           bol=true;
           in.next();
        }
        }while(bol);
        return z;
    }
    /****
     * this method brings together all the important options then the user chooses the appropriate booking for him
     * @param a as int to get the number of days to stay
     * @return double to return the price after calculation 
     * @author razan
     */
    public double Aco(int a){
        Scanner in=new Scanner(System.in);
        double z=0.0;
        System.out.println("The type of accommodation you would like to book ?");
        boolean bol=false;
        do{
        try{
        System.out.println("1- Hotel \n2-Villa \n3-Resort \n4- Apartment");
        System.out.println("Please choose a number");
        int x =in.nextInt();
        if(x==1){
            bol=false; 
            
            this.type="Hotel";
            do{
            try{
            System.out.println("How many stars should your accommodation have 1-5 ?");
            this.stars=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            
            do{
            try{
            System.out.println("How many rooms do you want?");
            this.numOfRoom=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            do{
             try{
            System.out.println("Would you like the reservation to include meals?");
            System.out.println("1-Yes \n2-No");
            int x1 =in.nextInt();
            if(x1==1){
                this.meal=true;
                 bol=false;
            }
            else if(x1==2){
                this.meal=false;
                bol=false;
            }
            else{
                System.out.println("wrong input try again");
                bol=true;
            }
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            z=(100+(stars*30)+(numOfRoom*50))*a;   
        }
        else if(x==2){
            bol=false;
            this.type="Villa";
            do{
            try{
            System.out.println("How many stars should your accommodation have 1-5 ?");
            this.stars=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            
            do{
            try{
            System.out.println("How many rooms do you want?");
            this.numOfRoom=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            do{
             try{
            System.out.println("Would you like the reservation to include meals?");
            System.out.println("1-Yes \n2-No");
            int x1 =in.nextInt();
            if(x1==1){
                this.meal=true;
                 bol=false;
            }
            else if(x1==2){
                this.meal=false;
                bol=false;
            }
            else{
                System.out.println("wrong input try again");
                bol=true;
            }
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
           z=(200+(stars*60)+(numOfRoom*80))*a;  
        }
        else if(x==3){
             bol=false;
            this.type="Resort";   do{
            try{
            System.out.println("How many stars should your accommodation have 1-5 ?");
            this.stars=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            
            do{
            try{
            System.out.println("How many rooms do you want?");
            this.numOfRoom=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            do{
             try{
            System.out.println("Would you like the reservation to include meals?");
            System.out.println("1-Yes \n2-No");
            int x1 =in.nextInt();
            if(x1==1){
                this.meal=true;
                 bol=false;
            }
            else if(x1==2){
                this.meal=false;
                bol=false;
            }
            else{
                System.out.println("wrong input try again");
                bol=true;
            }
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
          z=(150+(stars*50)+(numOfRoom*75))*a;   
        }
        else if(x==4){
             bol=false;
            this.type="Apartment";   do{
            try{
            System.out.println("How many stars should your accommodation have 1-5 ?");
            this.stars=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            
            do{
            try{
            System.out.println("How many rooms do you want?");
            this.numOfRoom=in.nextInt();
            bol=false; 
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
            do{
             try{
            System.out.println("Would you like the reservation to include meals?");
            System.out.println("1-Yes \n2-No");
            int x1 =in.nextInt();
            if(x1==1){
                this.meal=true;
                 bol=false;
            }
            else if(x1==2){
                this.meal=false;
                bol=false;
            }
            else{
                System.out.println("wrong input try again");
                bol=true;
            }
            }catch(Exception e){
             System.out.println("please enter a number");
              bol=true;
              in.next();
             }
            }while(bol);
           z=(100+(stars*10)+(numOfRoom*30))*a;  
        }
        else{
            System.out.println("wrong input try again");
            bol=true;
        }
       }catch(Exception e){
           System.out.println("please enter a number");
           bol=true;
           in.next();
        }
       }while(bol);
       return z;
    }
/****
 *  this method print all the attributes as String
 * @return String 
 * @author razan
 */
    @Override
    public String toString() {
        return "Accomodation{" + "type=" + type + ", stars=" + stars + ", numOfRoom=" + numOfRoom + ", meal=" + meal +'}';
    }
   
   
}
