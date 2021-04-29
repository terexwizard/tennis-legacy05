/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summitthai.tennis.legacy05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author terex
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        List<String> lscore = new ArrayList<String>();
        lscore.add("0-0");
        lscore.add("0-15");
        lscore.add("15-15");
        lscore.add("30-15");
        lscore.add("30-30");
        lscore.add("40-30");
        lscore.add("40-40");
        lscore.add("40-40");
        lscore.add("40-40");
        lscore.add("40-40");
        
        int countdeuce = 0;
        for(String score : lscore){
            String[] scores = score.split("-");
            
            if(scores[0].equals(scores[1])){
                countdeuce++;
            }else{
                countdeuce = 0;
            }
            
            String msg = callScore(scores[0],scores[1]);
            if(countdeuce >= 1){
                if(countdeuce == 4){
                    System.out.println("P1 advantage");
                }else{
                    if(scores[0].equals("40") || scores[1].equals("40")){
                        System.out.println(msg+" deuce "+countdeuce);
                    }else{
                        System.out.println(msg);
                    }
                }
            }else{
                System.out.println(msg);
            }
            
            
        }
        
    }
    
    public static String callScore(String p1,String p2){
        
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("0", "love");
        hm.put("15", "fifteen");
        hm.put("30", "thirty");
        hm.put("40", "forty");
                        
        return hm.get(p1)+":"+hm.get(p2);
        
    }
    
    
}
