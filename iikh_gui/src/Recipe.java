/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
import java.util.*;

public class Recipe {
	ArrayList <Database> ingre=new ArrayList<Database>();
	Scanner scan =new Scanner(System.in);
	
ArrayList <String> recipes=new ArrayList<String>();
Recipe(){
	recipes.add("Chole_Masala");recipes.add("Muttor_Paneer");
	recipes.add("Gobi_Masala");recipes.add("Allu_Jera");
	recipes.add("Khadai_Chicken");recipes.add("Egg_bhurji");	
	recipes.add("Masala_Dosa");recipes.add("Uttapam");
        
         for(int j=0;j<8;j++)ingre.add(new Database());
	
	 
	
	ingre.get(0).ingredients.add("chole");
	ingre.get(0).ingredients.add("chole_masala");
	ingre.get(0).ingredients.add("salt");
	ingre.get(0).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(1).ingredients.add("muttor");
	ingre.get(1).ingredients.add("paneer");
	ingre.get(1).ingredients.add("salt");
	ingre.get(1).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(2).ingredients.add("gobis");
	ingre.get(2).ingredients.add("garam_Masala");
	ingre.get(2).ingredients.add("salt");
	ingre.get(2).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(3).ingredients.add("potatos");
	ingre.get(3).ingredients.add("jeera");
	ingre.get(3).ingredients.add("salt");
	ingre.get(3).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(4).ingredients.add("chicken");
	ingre.get(4).ingredients.add("cooking_oil");
	ingre.get(4).ingredients.add("salt");
	ingre.get(4).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(5).ingredients.add("egg");
	ingre.get(5).ingredients.add("onion");
	ingre.get(5).ingredients.add("salt");
	ingre.get(5).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(6).ingredients.add("dosa_daal");
	ingre.get(6).ingredients.add("potatos");
	ingre.get(6).ingredients.add("spices");
	ingre.get(6).method="Add oil\nBoil for 10 min \nMix\nServe";
	ingre.get(7).ingredients.add("maida");
	ingre.get(7).ingredients.add("onion");
	ingre.get(7).ingredients.add("sambhar");
        ingre.get(7).method="Add oil\nBoil for 10 min \nMix\nServe";
	
}
	public void show_recipe() {
		int i,r=recipes.size();
		for(i=0;i<r;i++){
			System.out.println(i+1+". "+recipes.get(i));
		}				
	}
	
	public void show_ingredients(){
		System.out.println("Which recipe you want to know (enter the no.)");
		int y=scan.nextInt();
		for(int i=0;i<ingre.get(y-1).ingredients.size();i++){
			System.out.println(i+1+". "+ingre.get(y-1).ingredients.get(i));
		}
	}
	
	public void add_recipe() {
		System.out.println("Add a new recipe name ( enter string without spaces use '_' )");		
		String s=scan.next();
		recipes.add(s);
		
		String t; ingre.add(new Database());
		
		System.out.println("How many ingredients you want to add.");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Add an ingredient. (seperated by _ )");
			t=scan.next();
			ingre.get(recipes.size()-1).ingredients.add(t);
		}
	}
	public void edit_recipe() {
		String t;
		System.out.println("Which recipe you want to edit(enter the no.).");
		for(int i=0;i<recipes.size();i++){
			System.out.println(i+1+". "+recipes.get(i));
		}
		int n=scan.nextInt();
		System.out.println(" '0' for Delet recipe & '1' rebuild recipe.");
		int m=scan.nextInt();
		if(m==0){recipes.remove(n-1); ingre.remove(n-1);}
		else{
			ingre.get(n-1).ingredients.clear();
			System.out.println("How many ingredients you want to add.");
			int o=scan.nextInt();
			for(int i=0;i<o;i++){
				System.out.println("Add an ingredient. (seperated by _ )");
				t=scan.next();
				ingre.get(n-1).ingredients.add(t);
			}
		}
		
		
	}

}
