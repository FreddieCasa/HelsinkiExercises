/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamba
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand minutes;

    public Timer() {
        this.seconds = new ClockHand(100);
        this.minutes = new ClockHand(60);
        
    }
    
    public void advance(){
        this.seconds.advance();
        if(this.seconds.value() == 0){
            this.minutes.advance();
        }
    }
    
    public String toString(){
        return minutes + ":" + seconds;
    }
 
}
