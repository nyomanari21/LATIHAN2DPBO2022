//kelas yang digunakan untuk mengimplementasikan kelas Product
public class Product{

	//atribut private
	private int price = 0;
	private String idProduct = "";

	//konstruktor
	public Product(int price, String idProduct){
		this.price = price;
		this.idProduct = idProduct;
	}

	public Product(){

	}

	//getter dan setter price
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

	//getter dan setter idProduct
	public void setIdProduct(String idProduct){
		this.idProduct = idProduct;
	}

	public String getIdProduct(){
		return this.idProduct;
	}

}