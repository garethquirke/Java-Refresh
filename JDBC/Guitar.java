package JDBC;

public class Guitar {
	
	public String Name;
	public double Price;

	
	public Guitar(String name, double price) {
		this.Name = name;
		this.Price = price;
	}
	
	public Guitar() {
		Name = "";
		Price = 0.0;
	}
	
}
