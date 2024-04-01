/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *This class has 6 private vairabels , all of them have the same data type.
 *We uesd all of the setter and getter methods.
 * we used "printarray method".
 * we did override the toString method.
 * @author wjood Al-eissa
 */
public class Trip {
   private String  nature;
   private String  museum;
   private String  restarant;
   private String  history;
   private String  mall;
   private String  game;

    public Trip() {

    }

    public Trip(String nature, String museum, String restarant, String history, String mall, String game) {
        this.nature = nature;
        this.museum = museum;
        this.restarant = restarant;
        this.history = history;
        this.mall = mall;
        this.game = game;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getMuseum() {
        return museum;
    }

    public void setMuseum(String museum) {
        this.museum = museum;
    }

    public String getRestarant() {
        return restarant;
    }

    public void setRestarant(String restarant) {
        this.restarant = restarant;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
    

    @Override
    public String toString() {
        return  ( "\n nature= " + nature + "\n museum= " + museum + "\n restarant= " + restarant + "\n history= " + history 
                + "\n mall=" + mall + "\n game=" + game );
    }


    

}

