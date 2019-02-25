package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import myapp.sc;

public class myappTEST {

	
	  @Test
      public void emptycart() {
  	   sc c=new sc();
  	   assertTrue(c.count==0);
  	   c.arry.clear();

     }
     
     @Test
     public void onebcart() {
  	sc c=new sc();
  	c.addBook(127,"java"); 
 		assertTrue(1==c.count) ;
 		assertTrue(127 == c.gvalue) ;
   	c.arry.clear();

  	   
     }
     @Test
     public void tbcart() {
  	sc c=new sc();
  	c.addBook(127,"java"); 
  	c.addBook(100,"web"); 
 		assertTrue(2==c.count) ;
 		assertTrue(227 == c.gvalue) ;
   	c.arry.clear();

  	   
     }
     

}
