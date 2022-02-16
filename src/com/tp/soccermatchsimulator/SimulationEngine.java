/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.soccermatchsimulator;

import java.lang.Math;
/**
 *
 * @author Admin
 */
public class SimulationEngine {
    
    int positionAtac;
    int positionDefe;
    int positionNull;
    boolean AtacHome;
    
    public void generateProbabilityBars(Team homeTeam, Team awayTeam){        
      
      if (AtacHome) {
        positionAtac = homeTeam.probabilityAttack;
        positionDefe = homeTeam.probabilityAttack + awayTeam.probabilitydefending;
        positionNull = 100 - positionDefe-positionAtac;
      }else {
        positionAtac = awayTeam.probabilityAttack;
        positionDefe = awayTeam.probabilityAttack + homeTeam.probabilitydefending;
        positionNull = 100 - positionDefe-positionAtac; 
      }  
        
    }
    
    public boolean simulateMatch(){
     
        double dado = Math.round(Math.random()*100); 
        
        if (dado >= positionAtac || dado < positionDefe) {
            return true;
        }else {
            return false;
        }
        
    }
    
}
