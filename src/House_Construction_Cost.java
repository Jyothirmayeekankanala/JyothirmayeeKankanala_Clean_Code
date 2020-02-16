package com.epam.Clean_Code;
import java.util.Scanner;
class House_Construction
{
	Scanner sc=new Scanner(System.in);
	private int construction_cost_per_sqft,total_area_house;
	public void get_house_information()
	{
		System.out.format("Select one of the materials standard:\n");
		System.out.format("1=>standard material\n");
		System.out.format("2=>above standard material\n");
		System.out.format("3=>high standard material\n");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:	construction_cost_per_sqft=1200;
				break;
		case 2:	construction_cost_per_sqft=1500;
				break;
		case 3:	construction_cost_per_sqft=1800;
				System.out.format("Do you want to construct fully automated home ??\n");
				System.out.print("Enter yes or no");
				String opt=sc.next();
				if(opt.equalsIgnoreCase("yes"))
					construction_cost_per_sqft=2500;
				break;
		}
		System.out.format("Enter the total area of house in sqft");
		total_area_house=sc.nextInt();
	}
	public int cost_estimate()
	{
		return total_area_house*construction_cost_per_sqft;
	}
}
public class House_Construction_Cost 
{
    public static void main( String[] args )
    {
        House_Construction my_house_construction=new House_Construction();
        my_house_construction.get_house_information();
        System.out.format("Estimated house construction cost : %d",my_house_construction.cost_estimate());
    }
}
