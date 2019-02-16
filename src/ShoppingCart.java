
public class ShoppingCart {

	private int count=0;
	private int total=0;
	public int getCount() {
		// TODO Auto-generated method stub
		return this.count;
	}

	public void addToCart(Book b1) {
		// TODO Auto-generated method stub
		this.total+=b1.getPrice();
		this.count++;
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		
		return this.total;
	}

}
