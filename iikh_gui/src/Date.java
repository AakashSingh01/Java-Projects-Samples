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

public class Date {
	Scanner scan =new Scanner(System.in);
	Recipe rr;
	String [] Day_names ={"Monday" ,"Tuesday" ,"Wednesday" , 
							"Thursday" ,"Friday","Saturday","Sunday"};
		
	
	static Meal Day=new Meal();
	static Meal []Days=new Meal[7];
	 
	 Date(Recipe rp){
		 rr=rp;
		 Day.Break=rp.recipes.get(6);
		 Day.Lunch=rp.recipes.get(0);
		 Day.Dinner=rp.recipes.get(1);
		 for(int i=0;i<7;i++){Days[i]=new Meal();}
		 
 Days[0].Break=rp.recipes.get(6);   Days[0].Lunch=rp.recipes.get(0);   
 Days[0].Dinner=rp.recipes.get(4);
 Days[1].Break=rp.recipes.get(7);   Days[1].Lunch=rp.recipes.get(2);  
 Days[1].Dinner=rp.recipes.get(1);
 Days[2].Break=rp.recipes.get(6);   Days[2].Lunch=rp.recipes.get(3);   
 Days[2].Dinner=rp.recipes.get(5);
 Days[3].Break=rp.recipes.get(7);   Days[3].Lunch=rp.recipes.get(2);   
 Days[3].Dinner=rp.recipes.get(0);
 Days[4].Break=rp.recipes.get(6);   Days[4].Lunch=rp.recipes.get(1);   
 Days[4].Dinner=rp.recipes.get(4);
 Days[5].Break=rp.recipes.get(7);   Days[5].Lunch=rp.recipes.get(0);   
 Days[5].Dinner=rp.recipes.get(2);
 Days[6].Break=rp.recipes.get(6);   Days[0].Lunch=rp.recipes.get(3);   
 Days[6].Dinner=rp.recipes.get(5);
		 
	 }

	public void make_dayplan() {
		System.out.println("Choose Breakfast.(enter no)");
		show();
		int n=scan.nextInt(); 
		Day.Break=rr.recipes.get(n-1);
		System.out.println("Choose Lunch.(enter no)");
		show();
		 n=scan.nextInt(); 
		Day.Lunch=rr.recipes.get(n-1);
		System.out.println("Choose Dinner.(enter no)");
		show();
		 n=scan.nextInt(); 
		Day.Dinner=rr.recipes.get(n-1);
		
	}

	public void make_weekplan() {
		for(int j=0;j<7;j++){
			System.out.println(Day_names[j]+" plan : ");
		System.out.println("Choose Breakfast.(enter no)");
		show();
		int n=scan.nextInt(); 
		Days[j].Break=rr.recipes.get(n-1);
		System.out.println("Choose Lunch.(enter no)");
		show();
		 n=scan.nextInt(); 
		Days[j].Lunch=rr.recipes.get(n-1);
		System.out.println("Choose Dinner.(enter no)");
		show();
		 n=scan.nextInt(); 
		Days[j].Dinner=rr.recipes.get(n-1);
		}
	}

	void show(){
		int i,r=rr.recipes.size();
		for(i=0;i<r;i++){
			System.out.println(i+1+". "+rr.recipes.get(i));
		}
	}
}