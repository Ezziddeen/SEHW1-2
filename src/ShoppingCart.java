import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Book> products=new ArrayList<Book>();
	private int total=0;
	public int getCount() {
		// TODO Auto-generated method stub
		return this.products.size();
	}

	public void addToCart(Book b1) {
		// TODO Auto-generated method stub
		this.total+=b1.getPrice();
		this.products.add(b1);
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		
		return this.total;
	}

}
