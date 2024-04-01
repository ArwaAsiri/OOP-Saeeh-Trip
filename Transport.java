/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.Scanner;
/**
 *This class displays a list of rented car choices for the user, asks the user to input
 *the choice for each feature, then saves the information and prints it at the end
 * @author أروى
 *
 */
public class Transport{
    
    private String category;
    private int cylinder;
    private String kind;
    private String consumption;
    private String fuel;
    private int seats;
    private int model;
    private String location;
    

    public Transport() {

    }

    public Transport(String category, int cylinder, String kind, String consumption, String fuel, int seats, int model, String location) {
        this.category = category;
        this.cylinder = cylinder;
        this.kind = kind;
        this.consumption = consumption;
        this.fuel = fuel;
        this.seats = seats;
        this.model = model;
        this.location = location;
        
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getConsumption() {
        return consumption;
    }


    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * **
     * This method displays a list of cars features and takes the user choice
     * each time as an integr input then moves to the next feature
     *
     * @param category as String
     * @param kind as String
     * @param consumption as String
     * @param fuel as String
     * @param seats as int
     * @param cylinder as int
     * @param model as int
     * @param location as String
     * @return double price
     */
    
 public double carInformation(String category, String kind, String consumption,String fuel, int seats, int cylinder, int model, String location) {
       
        double price=0;
        Scanner src = new Scanner(System.in);
        boolean bol=false;
        int c=0;
        do{
        try{
        System.out.println("We offer 4 categories of cars,plese enter the number to the category you need");
        System.out.println("1:Van car\n2:Sedan car\n3:4x4\n4:VIP");
        //CATEGORY & SEATS:
        
        c = src.nextInt();
        if (c == 1){
            category = "Van car";
            bol=false;
       
          do{
              try{
            System.out.println("\nPlease choose number of seats");
            System.out.println("1:6 seats\n2:8 seats\n3:10 seats\n4:12 seats\n5:16 seats");
            int s = src.nextInt();
            if (s == 1) {
                seats = 6;
                price+=150;
                bol=false;
              }
           else if (s == 2) {
                seats = 8;
                price+=190;
                 bol=false;
            }
           else if (s == 3) {
                seats = 10;
                price+=420;
                 bol=false;
            }
           else if (s == 4) {
                seats = 12;
                price+=550;
                 bol=false;
            }
           else if(s==5){
                seats = 16;
                price+=640;
                 bol=false;
            }
           
            else{
                System.out.println("Please choose a number from 1-5");
                bol=true;
           }
                 
          }catch(Exception e){
                   System.out.println("Please choose a number from the list");
                   bol=true;
                   src.next();
                  }
         
          }while(bol);
        }
        
        else if (c == 2) {
            category = "Sedan";
            bol=false;
            do{
            try{
       
            System.out.println("\nPlease choose number of seats");
            System.out.println("1:4 seats\n 2:5 seats");
            int s = src.nextInt();
            if (s == 1) {
                seats = 4;
                price+=70;
                 bol=false;
            }
            else if (s == 2){
                seats = 5;
                price+=85;
                bol=false;
            }
              else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
        }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
          }
        else if (c == 3) {
            category = "4x4";
           bol=false;
        do{
            try{
       
            System.out.println("\nPlease choose number of seats");
            System.out.println("1:4 seats\n 2:6 seats");
            int s = src.nextInt();
            if (s == 1) {
                seats = 4;
                price+=300;
                 bol=false;
            }
            else if(s==2) {
                seats = 6;
                price+=400;
                 bol=false;
            }
             else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
        }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
          }
        else if (c == 4) {
          category = "VIP";
          bol=false;
        do{
            try{
       
            System.out.println("\nPlease choose number of seats");
            System.out.println("1:2 seats\n2:4 seats");
            int s = src.nextInt();
            if (s == 1) {
                seats = 2;
                price+=700;
                bol=false;
            }
            else if(s==2) {
                seats = 4;
                price+=995;
                 bol=false;
            }
             else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
        }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
       
        }
       else{///
           System.out.println("Please choose a number from 1-4");
                bol=true;
        }
        }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
         
         
        //KIND
        do{
            try{
     
        System.out.println("\nPlease choose transmission kind");
        System.out.println("1:automatic\n2:Manual");
        int k = src.nextInt();
        if (c == (4) || k == 1) {
            kind = "Automatic";
            price+=100;
            bol=false;
        }
        else if (c == 1 || c == 2 || c == 3) {
            kind = "Manual";
            price+=50;
            bol=false;
        }
       else{
             System.out.println("Please choose a number from 1-2");
             bol=true;
       }
       
            }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
       
        //CONSUMPTION:
        do{
            try{
        System.out.println("\nPlease choose number of consumption you prefer");
        System.out.println("1:Economy\n2:Normal");
        int con = src.nextInt();
        if (con == 1 || c == 2) {
            consumption = "Economy";
            bol=false;
        } else if(con==2) {
            consumption = "Normal";
            bol=false;
        }
         else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
           }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
        //FUEL:
       
        do{
            try{
        System.out.println("\nPlease choose the fuel type");
        System.out.println("1:Diesel \n2:Petrol");

        int f = src.nextInt();
        if (f == 1)
        {
            fuel = "Diesel";
            bol=false;
        }
        else if(f==2){
            fuel = "Petrol";
            bol=false;
        }
         else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
           }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
        //CYLINDER
        do{
            try{
        System.out.println("\nplease enter Cylinder number you need");
        System.out.println("\n1:4 Cylinder\n2:6 Cylinder\n3:8 Cylinder");
        int cl = src.nextInt();
        if (cl == 1) {
            cylinder = 4;
            price+=20;
            bol=false;
        }
        else if (cl == 2) {
            cylinder = 6;
            price+=40;
            bol=false;
        }
        else if (cl == 3) {
            cylinder = 8;
            price+=60;
            bol=false;
        }
        else if(cl==3){
            cylinder = 8;
            price+=80;
            bol=false;
        }
         else{
                System.out.println("Please choose a number from 1-3");
                bol=true;
           }
            }catch(Exception e){
                 
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
        //MODEL YEAR:
       
        do{
            try{
        System.out.println("\nPlease choose the model year");
        System.out.println("1:2020, \n2:2021\n3:2022\n4:2023");
        int m = src.nextInt();
        if (m == 1) {
            model = 2020;
            price+=90;
            bol=false;
        }
        else if (m == 2) {
            model = 2021;
            price+=150;
            bol=false;
        }
        else if (m == 3) {
            model = 2022;
            price+=220;
            bol=false;
        }
        else if(m==4) {
            model = 2023;
            price+=350;
            bol=false;
        }
         else{
                System.out.println("Please choose a number from 1-4");
                bol=true;
           }
           }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
       
        }while(bol);
        //LOCATION:
        do{
            try{
        System.out.println("\nPlease choose wether you want to get your vhiechle at the airport or from the city");
        System.out.println("1:At the Airport\n2:From the city");
        int l = src.nextInt();
        if (l == 1) {
            location = "Airport";
            bol=false;
        }
        else if(l==2) {
            location = "City";
            bol=false;
        }
         else{
                System.out.println("Please choose a number from 1-2");
                bol=true;
           }
           }catch(Exception e){
                System.out.println("Please choose a number from the list");
                bol=true;
                src.next();
            }
        }while(bol);
     
       
       
          System.out.println("""
                             Dear traveller, here is all you vhichle information
                             your car is:""" + category + "\n kind is:" + kind
                + "\n consumption is:" + consumption + "\n fuel type is:" + fuel
                + "\n number of seats is:" + seats + "\n Cylindr is:" + cylinder + "\n Model year is:" + model
                + "\n Location is:" + location);
         
         
       
        return price; 
     
    }
 
 @Override
    public String toString() {
        return "Transport{" + "category=" + category + ", cylinder=" + cylinder + ", kind=" + kind + ", consumption=" + consumption + ", fuel=" + fuel + ", seats=" + seats + ", model=" + model + ", location=" + location + '}';
    }
 }

