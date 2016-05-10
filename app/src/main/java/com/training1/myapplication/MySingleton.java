package com.training1.myapplication;

import java.util.ArrayList;

/**
 * Created by RishiS on 5/9/2016.
 */
public class MySingleton {

    private static MySingleton instance=null;
    private ArrayList<City> cities;
    private MySingleton(){

    }

    public synchronized static MySingleton getInstance(){
        if(instance==null){
           instance =  new MySingleton();
        }
        return instance;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}
