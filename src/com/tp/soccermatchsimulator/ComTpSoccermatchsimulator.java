/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tp.soccermatchsimulator;

/**
 *
 * @author Admin
 */
public class ComTpSoccermatchsimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Se establecen alineaciones
    Team TeamA = new Team();
    TeamA.formation[0] = 2;    
    TeamA.formation[1] = 5;
    TeamA.formation[2] = 3;
    
    Team TeamB = new Team();
    TeamB.formation[0] = 2;    
    TeamB.formation[1] = 4;
    TeamB.formation[2] = 4;
    
    //calcular probabilidades de ataque
    TeamA.calcProbabilityAttack();
    TeamB.calcProbabilityAttack();
    //calcular probabilidades de defensa
    TeamA.calcProbabilitydefending();    
    TeamB.calcProbabilitydefending();
    
    /*   
        System.out.println("calcProbabilityAttackA: " + TeamA.probabilityAttack);
        System.out.println("calcProbabilitydefendingA: " + TeamA.probabilitydefending);
        System.out.println("calcProbabilityAttackB: " + TeamB.probabilityAttack);        
        System.out.println("calcProbabilitydefendingB: " + TeamB.probabilitydefending);
    */    
    
    //calculamos barra de probabilidades
    SimulationEngine SimulateGame = new SimulationEngine();
    SimulateGame.AtacHome = true;
    SimulateGame.generateProbabilityBars(TeamA, TeamB);
    /*
        System.out.println("barra ataque:" + SimulateBar.positionAtac);
        System.out.println("barra defensa:" + SimulateBar.positionDefe);
        System.out.println("barra null:" + SimulateBar.positionNull);
    */
    
    //abrimos el score
     Match ScoreGame = new Match();      
    
    //Simulamos El partido
    if (SimulateGame.simulateMatch()){
        if (SimulateGame.AtacHome){
            ScoreGame.scoreTeamA ++;
        }else {
            ScoreGame.scoreTeamB ++;
        }
    }
    
        System.out.println(ScoreGame.scoreTeamA);
        System.out.println(ScoreGame.scoreTeamB);
    
  }

    
    
    
}
