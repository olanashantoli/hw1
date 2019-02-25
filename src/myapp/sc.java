package myapp;

import java.util.ArrayList;

public class sc {

	public ArrayList<Books> arry =new ArrayList<Books>();
	
	public int gvalue=0;
	public int count=0;
 
	 
	
	
	 public void addBook( int price , String name) { 
			Books b = new Books() ;
			arry.add(b) ;
			b.Name=name; 
			b.price=price ;
			gvalue+=b.price;
			count+=1;
			
		}


}
