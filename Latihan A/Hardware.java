//kelas yang digunakan untuk mengimplementasikan kelas Hardware
public class Hardware extends Product{

	//atribut private
	private String brand = "";
	private String model = "";

	//konstruktor
	public Hardware(String brand, String model){
		this.brand = brand;
		this.model = model;
	}

	public Hardware(){

	}

	//getter dan setter brand
	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return this.brand;
	}

	//getter dan setter model
	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return this.model;
	}

}