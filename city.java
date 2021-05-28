/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sondos
 */
public class city {
    private int id;
    private String name;
    private int population;
    private String countrycode;
    
    city(int id, String name, int population, String countrycode){
        this.id = id;
        this.name= name;
        this.population= population;
        this.countrycode=countrycode;
        
    }
    public int getid(){
        return id;
    }
    void setid(int id){
        this.id = id;   
    }
    public String getname(){
        return name;
    }
    void  setname(String name){
        this.name=name;
    
    }
    public int getpopulation(){
        return population;
    } 
    void setpopulation (int population){
        this.population = population;
    } 
    public String getcountrycode(){
        return countrycode;
    }

    @Override
    public String toString() {
        return  getname()+" "+getpopulation();
    }
    
    
    void setcountrycode (String countrycode){
        this.countrycode = countrycode;
    }
}   

