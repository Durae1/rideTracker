/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Random;
/**
 *
 * @author christopher.lewis
 */
public class ridetracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    final static int MIN_THRILL_RIDE_HEIGHT = 52;
    final static int MIN_THEME_RIDE_HEIGHT = 36;
    
    public static void main (String[]args ){
        System.out.println("Begin ride simulation");
        printRiderStats();
        
        rideBlackWidow(12, 55);
        printRiderStats();
        
        rideMerryGoRound(7, 34);
        printRiderStats();
        
        rideMerryGoRound(2, 34);
        printRiderStats();
        
        rideBlackWidow(23, 55);
        printRiderStats();

        rideBlackWidow(88, 19);
        printRiderStats();
        
    }// close main
        public static void rideBlackWidow(int riders, int avgHeight){
            if(avgHeight >= MIN_THRILL_RIDE_HEIGHT){
                
              System.out.println("Riding Black Widow...");
              System.out.println("I HAAAAATTE SPIDERSSSSSSSS!");
              totalRiders = totalRiders + riders;
              Random rand = new Random();
              int numSickRiders = rand.nextInt(riders);
              totalSickRiders = totalSickRiders + numSickRiders;
              
            } else {
                System.out.println(riders + " riders turned away sad: too short!");
                totalFailedRideAttempts = totalFailedRideAttempts + riders;
            }// end if else
        }// close method
        
        public static void rideMerryGoRound(int riders, int avgHeight){
            if(avgHeight >= MIN_THEME_RIDE_HEIGHT){
                
                System.out.println("Riding merry-go-round");
                System.out.println("round...and round.. and round");
                totalRiders = totalRiders + riders;
                Random rand = new Random();
                int numSickRiders = rand.nextInt(riders);
                totalSickRiders = totalSickRiders + numSickRiders;
            } else {
                System.out.println(riders + " riders turned away crying: too short!");
                totalFailedRideAttempts = totalFailedRideAttempts + riders;
                
            }// end if/else
        }// close method
        
        public static void printRiderStats(){
            System.out.println("*****RIDER STATS******");
            System.out.println("Total Riders: " + totalRiders);
            System.out.println("Total Failed Ride Attempts:" + totalFailedRideAttempts);
            System.out.println("Total Sick Riders:" + totalSickRiders);
            System.out.println("**********************");
        }
        
        
        
    
    
}
