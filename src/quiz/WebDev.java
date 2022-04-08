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
public class WebDev extends Input implements Decision{
    
    public WebDev(String name, int wscore, int cscore, int iscore){
        super(name,wscore,cscore,iscore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
    
    @Override
    public double Final_Score() {
        return (0.4 * super.value1) + (0.35 * super.value2) + (0.25 * super.value3);
    }
    
}
