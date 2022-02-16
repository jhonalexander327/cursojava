/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.soccermatchsimulator;

/**
 *
 * @author Admin
 */
public class Team {
    
    int formation[];
    int probabilityAttack ;
    int probabilitydefending ;
    
    
    public Team() {
    this.formation = new int[3];
    this.formation[0] = 0;    
    this.formation[1] = 0;    
    this.formation[2] = 0;  
    this.probabilityAttack = 0;
    this.probabilitydefending = 0;
    }
    
    public void calcProbabilityAttack(){            
        probabilityAttack = formation[2]*5;
    }
    
    public void calcProbabilitydefending(){
        probabilitydefending =  formation[0]*5;
    }
    
}
