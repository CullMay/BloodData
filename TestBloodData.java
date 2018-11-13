/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddata;

/**
 *
 * @author cm0850068
 */
public class TestBloodData {
    String bloodType = "O";
    char rHFactor = '+';  
    
    public void setrhFactor (char factor){
        rHFactor = factor;
    }
    
    public void setBloodType(String type){
        bloodType = type;
    }
    
    public String getBloodType(){
        return bloodType;
    }
    
    public char getrhFactor(){
        return rHFactor;
    } 
    TestBloodData(){
    bloodType = "O";
    rHFactor = '+';   
    }
    
    TestBloodData(String thing, char thingy){
    bloodType = thing;
    rHFactor = thingy; 
    }
}
    
