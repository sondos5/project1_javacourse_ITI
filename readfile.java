/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 *
 * @author Sondos
 */
public class readfile {


    public List<city> readFile(String filename) throws FileNotFoundException, IOException{
        List<city> cities; 
        cities = new ArrayList<>();
        //List <country> countries;
        //countries = new ArrayList<>();
        String[] fields= new String [0];
        BufferedReader br;
        br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        if (line!=null){
            //System.out.println( line);
        }
        do{
            line = br.readLine();
            if (line!=null){
                fields = line.split(",");
                city pr = new city(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]), fields[3]);
                //country sa = new country (fields[0],fields[1],fields[2],Double.parseDouble(fields[3]),Integer.parseInt(fields[4]),Double.parseDouble(fields[5]),Integer.parseInt(fields[6]));
                cities.add(pr);
                //System.out.println( cities);
                    
                    
                }
                
        }while (line !=null);
        br.close();
        return cities;
        
    }
        
        
        
    public List<country> readOtherFile(String filename) throws FileNotFoundException, IOException{
        
        List <country> countries;
        countries = new ArrayList<>();
        String[] fields= new String [0];
        BufferedReader br;
        br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        if (line!=null){
            //System.out.println( line);
        }
        do{
            line = br.readLine();
            if (line!=null){
                fields = line.split(",");
                //city pr = new city(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]), fields[3]);
                country sa = new country (fields[0],fields[1],fields[2],Integer.parseInt(fields[3]),Double.parseDouble(fields[4]),Double.parseDouble(fields[5]),Integer.parseInt(fields[6]));
                //cities.add(pr);
                countries.add(sa);
                //System.out.println( cities);    
                    
                }
                
        }while (line !=null);
        br.close();
        return countries;
    }}

        
    

