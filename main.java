/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
//import java.util.IntSummaryStatistics;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import java.util.function.Consumer;
import java.util.stream.Collectors;
//import static java.util.stream.Collectors.toList;
//import java.util.stream.IntStream;

/**
 *
 * @author Sondos
 */
public class main {
    public static void main (String args[]) throws IOException{
        readfile x;
        x = new readfile();
        
        List <city> output1;
        List <country> output2;
        
        output1 = x.readFile("C:\\Users\\Sondos\\Downloads\\Cities.csv");
        output2 = x.readOtherFile("C:\\Users\\Sondos\\Downloads\\Countries.csv");
       output1.stream().sorted(Comparator.comparingInt(city::getpopulation));
//      for (Iterator<city> it = output1.iterator(); it.hasNext();) {
//          city p = it.next();
//          System.out.println("# "+"id "+p.getid()+" name "+p.getname()+"  population "+p.getpopulation()+"  countrycode "+p.getcountrycode());
//
//      }
//        for (Iterator<country> it = output2.iterator(); it.hasNext();) {
//            country s = it.next();
//            System.out.println("# "+"id "+s.getcode()+" name "+s.getname()+"  continent "+s.getcontinent()+"  surfacearea "+s.getsurfacearea()+" population "+s.getpopulation()+" gnp "+s.getgnp()+" capital "+ s.getcapital());
//        }
//        
         Map <String , List<city>> listcountries = new HashMap<>();
        for(city cit:output1){
            if(listcountries.containsKey(cit.getcountrycode())){ //cheak if map contain this countrycode before or not 
                listcountries.get(cit.getcountrycode()).add(cit); // if already have will add city to this countrycoe 
            }
            else{
                listcountries.put(cit.getcountrycode(), new ArrayList<city>()); //if don't will add to map this new countrycode with list of cities
                listcountries.get(cit.getcountrycode()).add(cit); //get all the cities with this countrycode and add to list of cities in map
            }
        }
        
         
        List<Integer> countrypopulation= //create new reference list of integer
            output2.stream() //open strean on list of countries
            .map(c1 ->c1.getpopulation()) //map meaning that it will select from country list population (return list of population)
            .collect(Collectors.toList());// create new collection of the result of map
            System.out.println(countrypopulation); // print out list of country population
            
            
            Double average_pop = countrypopulation.stream().mapToInt(Integer::new).average().getAsDouble(); //open stream on the list of countrypopulation and create new ineger list and dd population then calcualte veraga finally get output as double 
            System.out.println("average "+ average_pop); //print average
            
            
        int countrypopulationmaxcity= //create new reference int object 
            output1.stream() //open stream on list of cities
            .map(sr-> sr.getpopulation()) //get population from list of cities 
            .max((m,t)->m>t?-1:1).get(); //calcus max. of the highest citiy population and return city name if true and null if false
            System.out.println("max : "+ countrypopulationmaxcity); //print max.
        
           
           List<city> cities_max = new ArrayList<>(); //create new list of city 
           listcountries.forEach((key,val)->cities_max.add(val.stream().max((s1,s2)->s1.getpopulation()>s2.getpopulation()?-1:1).get()));
            // loop in map (listcountries)and open stream on the value of each key then calculate max of poplation of cities  of each country and add to list (max cities)
        
            
            
           List<Integer> citiesIds = output2.stream().map(xy->xy.getcapital()).collect(Collectors.toList()); //open stream on countries list and sellect capital list from countries and add it to list anr deturn list of capitals
           city citymax =  output1.stream().filter(mt-> citiesIds.contains( mt.getid())).max((c1,c2)->c1.getpopulation() > c2.getpopulation()?1:-1).get();
           //open stream on cities and filter it according to if the capitale have the same id of cities and get max. and return the heighest population of capital
           System.out.println("max population CAPITAL" + citymax); //print max population of capital
        
    }
}
    
