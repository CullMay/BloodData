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
public class TestPatient {
    int idNum;
    int age;
    TestBloodData pbd = new TestBloodData();
    public int getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    private void setIdNum(int id) {
        idNum = id;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    TestPatient(){
        idNum = 0;
        age = 0;
        pbd.bloodType = "O";
        pbd.rHFactor = '+';
        
    }
    TestPatient (int id, int age, String bType, char thing){
        idNum= id;
        this.age = age;
        pbd.bloodType = bType;
        pbd.rHFactor = thing;
        
        
    }
    
    public void printPatient(){
        System.out.printf(" id: %s\n age: %s\n Blood Type: %s\n RH Factor: %s",idNum,age,pbd.bloodType,pbd.rHFactor);
    }
}