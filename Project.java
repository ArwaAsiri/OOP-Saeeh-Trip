/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;

import java.util.Scanner;

/**
 *
 * @author razan
 */
public class Project {

    public static void main(String[] args) {
        
       
        System.out.println("Welcome to the (SAAEH TRIP) site for coordinating trips to some tourist cities in the Kingdom of Saudi Arabia. On this website, we help you book flights and accommodation, and if you want to get a tour guide or a car for transportation ");
         System.out.println("° . ·   . ✧ °  . ੭");
        Scanner in=new Scanner(System.in);
        Person[] per=new Person[30];
         per[0]= new Guide("Maz",30,"Personal","English",8,0555544344,"Maz@gmail.com",375);
         per[1]= new Guide("Ahmad",27,"Personal","English,Arabic",5,0506644344,"a@gmail.com",490);
         per[2]=new Guide("Saleh",29,"Group","English,Arabic,Spanish",4,0555575644,"S@gmail.com",600);
         per[3]=new Guide("Yasser",30,"Personal","Arabic",14,0555575321,"Y1@gmail.com",490);
         per[4]= new Guide("Mohamed",34,"Personal or Group","Arabic",4,0555544344,"M@gmail.com",460);
         per[5]=new Guide("Noura",24,"Personal or Group","English",2,055545567,"Mike@gmail.com",500);
         per[6]=new Guide("Asmaa",20,"Personal","English",1,0554563111,"T@gmail.com",600);
         per[7]=new Guide("Razan",38,"Group","English",10,0567764321,"J@gmail.com",670);
         per[8]=new Guide("Arwa",26,"Personalor Group","English, Spainsh",5,044454344,"Y@gmail.com",550);
         per[9]=new Guide("Reyam",20,"Personal","Fernch",4,0553565344,"Reyam@gmail.com",600);
         
         

       Traveler t=Traveler.tra();
       
         t.info();
         t.print();
          System.out.println("° . ·   . ✧ °  . ੭");
       int memb=(t.getNumOfAdults()+t.getNumOfKids());
         if(memb>1){
           t.mem(memb, per); 
           for(int i=1,j=10;i<=memb-1;i++,j++){
           per[j].print();
           }
         }  
          System.out.println("° . ·   . ✧ °  . ੭");
      
       
       boolean bol2 = false ;
       int c = 0;
      do{
          try{
             System.out.println("Please select the number of cities you want to visit, knowing that the number of cities available is 6 :\"Makkah,Jeddah,Riydah,Alkobar,Alula,Abha\"");
             c=in.nextInt(); 
             bol2=false;
          }catch(Exception e){
             System.out.println("please enter a number"); 
                    bol2 = true;
                    in.next(); 
          }
      }while(bol2); 
     
      t.Newtrip(c);
       System.out.println("° . ·   . ✧ °  . ੭");
      
      
      
      for(int i=1;i<=c;i++){
       boolean n=false;
       double me = 0;   
       double ag=0; 
       double discount=0;  
          
       Airplane air1 = new Airplane();
       String a=air1.Direction(t);
       String b=air1.Type(t);
       String d=air1.Level(t);
       
       String dis1=".";
       if(t.getDisabled()>0){
       n=air1.meal();
       me=air1.meals(memb,n); 
       dis1=air1.disable(t.getDisabled());
       }
       double s=air1.BagWieght();
       double ex =air1.extra();
       
       int days =air1.days();
       int e=air1.Flix(days);
       if(t.getNumOfKids()>0){
       ag=air1.age(t.getNumOfKids(),me+ex);
       discount=air1.discount(ag, memb);
       }
      else{
       discount=air1.discount(me+ex, memb);    
      }
       
       t.price+=discount;
       
       air1.setWay(a);
       air1.setFlexible(e);
       air1.setType(b);
       air1.setLevel(d);
       air1.setMeal(n);
       air1.setLuggage((2*memb));
       air1.setBagWight(s);
       air1.setTime(days);
       System.out.println(air1.toString()+" "+dis1);
       t.NewsuperAir(air1);
      
       
        System.out.println("° . ·   . ✧ °  . ੭");
      
       
       Accomodation aco=new Accomodation();
         double co= aco.Aco(days);//1,2,3,4
         String dis = ".";
         double meals=0.0;//5
         double age=0.0;//6
         if(aco.getMeal()){
          meals= aco.meals(memb,aco.getMeal());
          
         }
        if(t.getNumOfKids()>0){
           age= aco.age(t.getNumOfKids(), meals);
        }
        
        dis =aco.disable(t.getDisabled()); 
        double extra= aco.extra();//7
        double disc=aco.discount(age+extra+co, memb);
        t.price+=disc;
        System.out.println(aco.toString()+" "+dis);
        t.NewsuperAcco(new Accomodation(aco.getType(), aco.getStars(), aco.getNumOfRoom(), aco.getMeal()));
       
       }
        
       
             
       
        
         System.out.println("° . ·   . ✧ °  . ੭");
        
        System.out.println("do you want a tour guide to help you duirng the trip? enter 1 for yes and 2 for no");
        boolean bol = false ;
        do {
         try {   
        int v=in.nextInt();
        if(v==1){
        bol = false ;
          Guide G=Guide.tourGuide(per);
            t.price+=G.getPrice();
        }
        else if (v==2){
            bol = false;
         System.out.println("No guide needed");   
         }
        else{
            bol = true;
         System.out.println("please choose a number in range");     

        }
        }catch (Exception e ) {
          System.out.println("please choose a number not a letter"); 
                    bol = true;
                    in.next();

        }
        }while (bol);
         
         System.out.println("° . ·   . ✧ °  . ੭");


        
        Transport car=new Transport();
         double transport= car.carInformation(car.getCategory(),car.getKind(),car.getConsumption(), car.getFuel(),car.getCylinder(),car.getModel(),car.getSeats(),car.getLocation());
       
        t.setCar(car);
        
         System.out.println("° . ·   . ✧ °  . ੭");
        System.out.println("  ("+t.getPrice()+")  This is the price of the entire trip. Price details have been sent to the email that was registered after searching for the best and most suitable reservation requirements that you have chosen. If the price exceeds your budget, you can contact the support team via the email that the price details were sent to and they will help you to obtain get a new booking that fits your budget");
        
        System.out.println("");
        System.out.println("Thank you for visiting our website. We hope it was a nice experience and we are pleased to serve you again in the future");
        
    }
}
