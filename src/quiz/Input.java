/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author OWNER
 */
public class Input {
    String name;
    int value1, value2, value3;
    
    public Input(String Name, int wscore, int cscore, int iscore){
        this.name = Name;
        this.value1 = wscore;
        this.value2 = cscore;
        this.value3 = iscore;
    }
}
