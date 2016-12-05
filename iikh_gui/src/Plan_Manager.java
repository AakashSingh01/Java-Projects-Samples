/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
import java.util.Scanner;

public class Plan_Manager {
  static Recipe rr;
 static Date dt;
	Scanner scan =new Scanner(System.in);
	
   Plan_Manager(Recipe rp){
	  rr=rp;
	   dt=new Date(rr);
	   }
    
    
 void show_plan(){
	 System.out.print("\n '1' for day plan. \n '2' for week plan. \n '3' for month plan(which is weekplan)*4");
	 int n=scan.nextInt();
	 if(n==1)show_dayplan();
	 else show_weekplan();
 }
 
 
 void show_dayplan(){
	 System.out.println("Breakfast : "+dt.Day.Break);
	 System.out.println(" Lunch : "+dt.Day.Lunch);
	 System.out.println(" Dinner : "+dt.Day.Dinner);
 }
 
 void show_weekplan(){
	 for(int i=0;i<7;i++){
		 System.out.println("\n"+dt.Day_names[i]+" : ");
		 System.out.println("Breakfast : "+dt.Days[i].Break);
		 System.out.println("Lunch : "+dt.Days[i].Lunch);
		 System.out.println("Dinner : "+dt.Days[i].Dinner);
	 }
 }


public void new_plan() {
	System.out.println("You want to make day plan or week plan. enter '1' or '2'");
	int n=scan.nextInt();
	if(n==1)dt.make_dayplan();
	else dt.make_weekplan();
}
 

}
