/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.Scanner;

/**
 * This class is a sub class from person.
 * This class will make the user able to choose if they want a guide or not.
 * if the user want a gudie this class will help them to choose between 10 guides.
 * @author wjood Al-eissa
 */

public class Guide extends Person {
    private String Guide;
    private String Language;
    private int Experience;



    public Guide() {
    }

    public Guide(String Name,int Age,String Guide, String Language, int Experience,long phoneNumber,String Email,double price) {
        this.Name=Name;
        this.Age=Age;
        this.Guide = Guide;
        this.Language = Language;
        this.Experience = Experience;
        this.phoneNumber=phoneNumber;
        this.Email=Email;
        this.price=price;
    }


    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public String getGuide() {
        return Guide;
    }

    public void setGuide(String Guide) {
        this.Guide = Guide;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * **
     * this method print all the attributes as String
     *
     * @author wjood Al-eissa
     */
    @Override
    public void print() {
        System.out.println("Name: " + this.Name + " Age :" + this.Age + " specialist: " + this.Guide + " language : " + this.Language + " Experience : " + Experience + " years of Experience   phone number : " + this.phoneNumber + " email : " + this.Email + " price : " + this.price);
    }
     
     
      /****
      *
      * @param per
      * @return 
      * this method has an exception ، if the user enterd an letter , the program won't stop.
      * also if the user enterd a number out of range.
      * if the user chose number 2 , all gudides informations will be printed.
      */

     public static Guide tourGuide(Person [] per){
       Scanner in=new Scanner(System.in);
        for(int i=9,j=1;i<per.length&&i>=0;i--,j++){
            System.out.print(j+"- ");
            per[i].print();
        }
        boolean bol = false ;
        do {
        try {
        System.out.println("choose the number of the tour guide you want");
        int x =in.nextInt();
        switch(x){
                case 1:
                    bol = false;   
                return (Guide) per[9];
                case 2:
                    bol = false;
                return (Guide) per[8];
                case 3:
                    bol = false;
                return (Guide) per[7];
                case 4:
                    bol = false;
                return (Guide) per[6];
                case 5:
                    bol = false;
                return (Guide) per[5];
                case 6:
                    bol = false;
                return (Guide) per[4];
                case 7:
                    bol = false;
                return (Guide) per[3];
                case 8:
                    bol = false;
                return (Guide) per[2];
                case 9:
                    bol = false;
                return (Guide) per[1];
                case 10:
                    bol = false;
                return (Guide) per[0];
                default:
                    System.out.println("please choose a number in range");
                    bol = true;

            }
            }catch (Exception e){
                  System.out.println("wrong input try again"); 
                    bol = true;
                    in.next();

            }
        }while (bol);

           return null;



     }
}






      

