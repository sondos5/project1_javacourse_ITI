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
public class country {
    private String code;
    private String name;
    private String continent;
    private double surfacearea;
    private int population;
    private double gnp;
    private int capital;
    
    
    country(String code, String name, String continent,int population,double surfacearea, double gnp, int capital ){
        this.code = code;
        this.name= name;
        this.continent=continent;
        this.surfacearea = surfacearea;
        this.population= population;
        this.gnp =gnp;
        this.capital=capital;
        
    }
    public String getcode(){
        return code;
    }
    void setcode(String code){
        this.code = code;   
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
    public String getcontinent(){
        return continent;
    }
    void setcontinent (String continent){
        this.continent = continent;
    }
    public double getsurfacearea(){
        return surfacearea;
    }
    void setsurfacearea(double surfacearea){
        this.surfacearea = surfacearea;
    }
    public double getgnp(){
        return gnp;
    }
    void setgnp(double gnp){
        this.gnp=gnp;
    }
    public int getcapital(){
        return capital;
    }
    void setcapital(int capital){
        this.capital= capital;
    }
}
