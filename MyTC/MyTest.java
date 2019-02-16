import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

	ShoppingCart shc;
	Book book1,book2;
	@Before public void createObj() {
	shc=new ShoppingCart();
	book1=new Book("Java Book",127);
	book2=new Book("Web Design Book",100);
}
	@Test
	public void test() {
		
		assertTrue(shc.getCount()==0);
		
	}
	
	@Test
	public void test2() {
	shc.addToCart(book1);
	assertTrue(shc.getCount()==1);
	assertTrue(shc.getTotal()==127);
	
		
		
	}

	
	@Test
	public void test3() {
		shc.addToCart(book1);
		shc.addToCart(book2);
		assertTrue(shc.getCount()==2);
		assertTrue(shc.getTotal()==227);
		
	}
	
	
	
	
}

