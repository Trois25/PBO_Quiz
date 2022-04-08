/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class Main {

    public static void main(String[] args) {
        int fchoose, mchoose, Wscore, Iscore, Cscore;
        Scanner input = new Scanner(System.in);
        
        System.out.println("REGISTRATION FORM PT.JUAN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose Form Type : ");
        fchoose = input.nextInt();
        
        if(fchoose == 1){
            System.out.println("\nREGISTRATION FORM \n");
            System.out.print("Input Student Number : ");
            String NIM = input.next();
            System.out.print("Input Name : ");
            String name = input.next();
            System.out.print("Input Writing Exam Score : ");
            Wscore = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            Cscore = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            Iscore = input.nextInt();
            do{
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Output");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                mchoose = input.nextInt();

                if(mchoose == 1){
                    System.out.println("\nEdit Form");
                    System.out.print("Input Writing Exam Score : ");
                    Wscore = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    Cscore = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    Iscore = input.nextInt();

                } else if(mchoose == 2){
                    AndroidDev mobile = new AndroidDev(name, Wscore, Cscore, Iscore);
                    System.out.println("Final Score : " + mobile.Final_Score());
                    if(mobile.Final_Score()>= 85){
                        System.out.println("INFORMATION : SUCCESS");
                        System.out.println("Congratulations to " + name + " has been accepted as Web Developer");
                    }else{
                        System.out.println("INFORMATION : FAILED");
                        System.out.println("Sorry to " + name + ", you are not accepted as Web Developer");
                    }
                }
            }while(mchoose != 3);   
        }else if(fchoose == 2){
            System.out.println("\nREGISTRATION FORM \n");
            System.out.print("Input Student Number : ");
            String NIM = input.next();
            System.out.print("Input Name : ");
            String name = input.next();
            System.out.print("Input Writing Exam Score : ");
            Wscore = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            Cscore = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            Iscore = input.nextInt();
            
            do{
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Output");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                mchoose = input.nextInt();

                if(mchoose == 1){
                    System.out.println("\nEdit Form");
                    System.out.print("Input Writing Exam Score : ");
                    Wscore = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    Cscore = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    Iscore = input.nextInt();

                } else if(mchoose == 2){
                    WebDev web = new WebDev(name,Wscore,Cscore,Iscore);
                    System.out.println("Final Score : " + web.Final_Score());
                    if(web.Final_Score()>= 85){
                        System.out.println("INFORMATION : SUCCESS");
                        System.out.println("Congratulations to " + name + " has been accepted as Web Developer");
                    }else{
                        System.out.println("INFORMATION : FAILED");
                        System.out.println("Sorry to " + name + ", you are not accepted as Web Developer");
                    }
                }
            }while(mchoose != 3);
        }
    }
    
}
