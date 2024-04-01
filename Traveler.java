/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.ArrayList;
import java.util.Scanner;

/**

* this class  is subclass 

* this class inheritance from person

* give  the traveler's personal data

* @author ma980

*/
public class Traveler extends Person{
    
        private String Nationality;

    

      private String passport ;

 

      private long ID ;

 

      private int numOfAdults ;

 

      private int numOfKids ; 

 

      private int disabled; 

      

      private Transport car;

      

       ArrayList<Super> supers =new ArrayList<Super>();

      

      ArrayList<Trip> trip=new ArrayList<Trip>();

      

    public Traveler() {

 

    }

    public Traveler(String Nationality,String Name,int Age, String passport, long ID ,int numOfAdults, int numOfKids,long phoneNumber,String Email, int disabled) {

        this.Nationality = Nationality;

        this.Name=Name;

        this.Age=Age;

        this.passport = passport;

        this.ID=ID;

        this.numOfAdults = numOfAdults;

        this.numOfKids = numOfKids;

        this.phoneNumber=phoneNumber;

        this.Email=Email;

        this.disabled = disabled;

    }

    

    public Traveler(String Nationality,String Name,int Age, String passport,long ID,long phoneNumber,String Email) {

        this.Nationality = Nationality;

        this.Name=Name;

        this.Age=Age;

        this.passport = passport;

        this.phoneNumber=phoneNumber;

        this.Email=Email;

    }

    

    public void setName(String Name) {

        this.Name = Name;

    }

 

    public void setAge(int Age) {

        this.Age = Age;

    }

 

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

 

    public void setEmail(String Email) {

        this.Email = Email;

    }

 

    public void setDay(int Day) {

        this.Day = Day;

    }

    

    public void setMonth(int month) {

        this.month = month;

    }

    

    public void setYear(int year) {

        this.year = year;

    }

    

    public void setPrice(double price) {

        this.price = price;

    }

    

    public void setPassport(String passport) {

 

        this.passport = passport;

    }

    public void setID(long ID) {

 

        this.ID = ID;

    }

    public void setNationality(String Nationality) {

 

        this.Nationality = Nationality;

    }

    public void setNumOfAdults(int numOfAdults) {

 

        this.numOfAdults = numOfAdults;

    }

    public void setNumOfKids(int numOfKids) {

 

        this.numOfKids = numOfKids;

    }

    public void setDisabled(int disabled) {

 

        this.disabled = disabled;

    }

    public void setCar(Transport car) {

        this.car = car;

    }

    public void setSupers(ArrayList<Super> supers) {

        this.supers = supers;

    }

    public void setTrip(ArrayList<Trip> trip) {

        this.trip = trip;

    }

    public String getName() {

        return Name;

    }

    public int getAge() {

        return Age;

    }

    public long getPhoneNumber() {

        return phoneNumber;

    }

    public String getEmail() {

        return Email;

    }

    public int getDay() {

        return Day;

    }

    public int getMonth() {

        return month;

    }

    public int getYear() {

        return year;

    }

    public double getPrice() {

        return price;

    }

    public String getPassport() {

        return passport;

    }

    public long getID() {

        return ID;

    }

    public String getNationality() {

        return Nationality;

    }

    public int getNumOfAdults() {

        return numOfAdults;

    }

    public int getNumOfKids() {

        return numOfKids;

 

    }

    public int getDisabled() {

 

        return disabled;

    }

    public Transport getCar() {

        return car;

    }

    public ArrayList<Super> getSupers() {

        return supers;

    }

    public ArrayList<Trip> getTrip() {

        return trip;

    }

    /***

* this method print Traveler information 

 */

      @Override

    public void print(){

     

    System.out.println("Nationality: "+this.Nationality+" Name: "+this.Name+" Age: "+this.Age+" passport: "+this.passport+" ID: "+this.ID+" phone number: "+this.phoneNumber+" email: "+this.Email);

    }

  /***

  * this method print Traveler information 

  */   

    public void print1(){

    System.out.println("Nationality: "+this.Nationality+" Name: "+this.Name+" Age: "+this.Age+" passport: "+this.passport+" ID: "+this.ID+" number of adults; "+this.numOfAdults+" number of Kids: "+this.numOfKids+" phone number: "+this.phoneNumber+" email: "+this.Email+" disabled: "+this.disabled);

    }

    /***

     * this method Give you Traveler information other person

     * @return object from the Traveler class

     */

    public static Traveler tra(){

        Scanner in=new Scanner(System.in);

        long ID=0;

        int numOfAdults=0;

        int numOfKids=0;

        long phoneNumber=0;

        int disabled=0;

        int Age=0;

        boolean bol=false;

        System.out.println("please enter your personal information");

        System.out.println("1- enter your Nationality ");

        String Nationality=in.nextLine();

        System.out.println("2-enter your full name");

        String Name=in.nextLine();

        do{

        try{

        System.out.println("3-enter your age");

        Age=in.nextInt();

        bol=false;

        }catch(Exception e1){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

        System.out.println("4-enter your passport");

        String passport=in.next();

        do{

        try{

        System.out.println("5-emter your ID");

        ID=in.nextLong();

        bol=false;

        } catch(Exception e1){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

         do{

        try{
         
        System.out.println("Note: the maximum number of people allowed is 20");
        System.out.println("6-How many adults are on the trip including you ");

        numOfAdults=in.nextInt();

        bol=false;

        }catch(Exception e2){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

        do{

        try{

        System.out.println("7-How many children are on the trip");

        numOfKids=in.nextInt();

        bol=false;

        } catch(Exception e3){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

        do{

        try{

        System.out.println("8- enter your phone number");

        phoneNumber=in.nextLong();

        bol=false;

        }catch(Exception e4){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

        System.out.println("9- enter your email");

        String Email=in.next();

        do{

        try{

        System.out.println("10-how manny people with disabilities? if not enter 0");

        disabled=in.nextInt();

         bol=false;

        }

        catch(Exception e6){

         System.out.println("Please verify that the number is correct");

         bol=true;

         in.next();

        }

        }while(bol);

       return new Traveler(Nationality, Name, Age, passport, ID, numOfAdults, numOfKids, phoneNumber, Email, disabled);

    }   

    /***

     * this method Give you information about the reason for travel

     */

    public void info() {

        Scanner sc = new Scanner(System.in);

        boolean bol = false;

        do {

            try {
                System.out.println("Enter the number of why travel:(1-Stady,2-work,3-tourism)");

                int ch = sc.nextInt();

                switch (ch) {

                    case 1:

                        bol = false;

                        System.out.println("Stady");

                        break;

                    case 2:

                        bol = false;

                        System.out.println("work");

                        break;
                    case 3:
                        bol = false;
                        System.out.println("tourism");
                        break;

                    default:

                        System.out.println("wrong input try again");

                        bol = true;

                }

            } catch (Exception e) {

                System.out.println("Please verify that the number is correct");

                bol = true;

                sc.next();

            }

        } while (bol);

    }

    /***

     * this method Give you Traveler information other person

     * @param a

     * @param per 

     * @return  

     */

    public void mem(int a,Person[] per ){

        Scanner in=new Scanner(System.in);

        long phone=0;

        long I=0;

        int Ag=0;

        boolean bol=false;

           for(int i=1,j=10;i<=a-1;i++,j++){

               System.out.println("please enter the personal information of your members ");

               System.out.println("1- enter their Nationality ");

               String Nat=in.next();

               System.out.println("2-enter their full name");

               String x=in.nextLine();

               String Na=in.nextLine();

               do{

               try{

               System.out.println("3-enter their age");

               Ag=in.nextInt();

               bol=false;

               } catch(Exception e1){

               System.out.println("Please verify that the number is correct");

               bol=true;

               in.next();

                }

                }while(bol);

               System.out.println("4-enter their passport");

               String pass=in.next();

               do{

               try{

               System.out.println("5-emter their ID");

               I=in.nextLong();

               bol=false;

               }catch(Exception e2){

                 System.out.println("Please verify that the number is correct");

                 bol=true;

                 in.next();

                 }

               }while(bol);

               do{

               try{

               System.out.println("8- enter their phone number if exist if not enter 0");

               phone=in.nextLong();

               bol=false;

               } catch(Exception e3){

               System.out.println("Please verify that the number is correct");

               bol=true;

               in.next();

               }

               }while(bol);

               System.out.println("9- enter their email if exist if not enter (no)");

               String Ema=in.next();

               per[j]=new Traveler(Nat, Na, Ag, pass, I, phone, Ema);

           }
    }

    /***

     * this method shows the choice of the cities that he will travel to and the places he will visit,

       such as restaurants the city of games, the nature and museums

     * @param c 

     */

     public void Newtrip(int c) {
      Scanner in=new Scanner(System.in);

    int i;
    for(i=1;i<=c;i++){
    System.out.println("please choose a city");
    System.out.println("Makkah,Jeddah,Riydah,Alkobar,Alula,Abha");
    String city = in.next();
    switch (city){
       case "Jeddah","jeddah" :
      String nature5 ="King Fahd's Fountain, Silver Sands Beach"; //
      String museum5 ="Al Tayebat International City, Matbouli House Museum";
      String restarant5= "Al Nakheel Restaurant , Twina Park";
      String history5 ="Al-Balad ,Alrahmah Mosque";
      String mall5="Red Sea Mall , Alyasamen Mall";//
      String game5 = "Al-Shallal Theme Park , Jeddah Water Front Park";//
      
       
       Trip tr=new Trip(nature5,museum5,restarant5,history5,mall5,game5);
       System.out.println(tr);
      System.out.println("° . ·   . ✧ °  . ੭");
      trip.add(tr);
       
      break;
       case "Makkah","makkah" :
       System.out.println("Note : there is some places only muslims,"
               + " can enter these place due to religious beliefs! ");     
      String nature1="Jabal Alnour , City of Mina";
      String museum1 ="Mecca museum , Clock Tower Museum";
      String restarant1="Altazaj , Albaik";
      String history1="Almathag , Al Shorfa";
      String mall1="Makkah Mall , Alhijaz";
      String game1="Alhikir , Bowling Rush";
      
      Trip tr2=new Trip(nature1,museum1,restarant1,history1,mall1,game1);
      System.out.println(tr2);
      System.out.println("° . ·   . ✧ °  . ੭");
       trip.add(tr2);
        
      break;
      case "Abha","abha" :
      String nature6="The Art Street , The fog walkway ";
      String museum6 ="Al Raqdi Museum, Aljhali Museum";
      String restarant6="Al sinara , N lounge";
      String history6="Shamsan Ottoman Castle , Al Basta District";
      String mall6="Asir Mall , Abha Mall";
      String game6="FabyLand Amusement Park , Abha Palace Theme Park";
      Trip tr3=new Trip(nature6,museum6,restarant6,history6,mall6,game6);
      System.out.println(tr3);
      System.out.println("° . ·   . ✧ °  . ੭");
      trip.add(tr3);
     
      
       
      break;
      case "Alula","alula" :
      String nature3 ="Jabal Alfil ,Stargazing";
      String museum3 ="AlUla Old Town,AlUla Museum";
      String restarant3="Beit Wafa , Alfa's lounge";
      String history3 ="Al Ula Heritage Village , Jabal Khuraibah";
      String mall3="Sadu Al Ula shop , Arabic Scripts";
      String game3="PEAKS , Mahfol Makfol";
      
       Trip tr4=new Trip(nature3,museum3,restarant3,history3,mall3,game3);
       System.out.println(tr4);
      System.out.println("° . ·   . ✧ °  . ੭");
       trip.add(tr4);
        
      break;
      case "Riyadh","riydah" :
      String nature2="Riyadh's Wild Horse-riding , Riydah season";
      String museum2 ="Museum of Illusions";
      String restarant2 ="Mama Noura ,COYA Riyadh";
      String history2="Al Masmak Fort , Edge of The World";
      String mall2 ="Riyadh park mall , Alsalam mall";
      String game2 ="Escape Arabia , FunXtreme";
      
      Trip tr5=new Trip(nature2,museum2,restarant2,history2,mall2,game2);
      System.out.println(tr5);
      System.out.println("° . ·   . ✧ °  . ੭");
       trip.add(tr5);
        
      break;
      case "Alkhobar","alkhobar" :
      String nature4="Khobar Sea Front , Corniche";
      String museum4="Ithra , Scitech Technology Center";
      String restarant4 ="Restaurant Khobar Traditional Village , Al-Romansiah";
      String history4 =" Maghaer Shuaib , Masjid at-Tawba";
      String mall4 ="Al-Rashid Mall , Khobar Mall";
      String game4 ="UnknownRoom , Dar VR";
      
      Trip tr6=new Trip(nature4,museum4,restarant4,history4,mall4,game4);
      System.out.println(tr6);
      System.out.println("° . ·   . ✧ °  . ੭");
       trip.add(tr6);
       
      break;

    }
    
    }
   
    }
     
    
    /***
     * This method Add accommodation reservation to Super Array list

     * @param aco 
     */
    public void NewsuperAcco(Accomodation aco){

      supers.add(aco);

    }
     /***
      * This method Add flight booking in super Array list
      * @param air 
      */
     public void NewsuperAir(Airplane air){

      supers.add(air);

    }

    
}
