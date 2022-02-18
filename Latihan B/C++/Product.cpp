//kelas yang digunakan untuk mengimplementasikan kelas Product
class Product{

	private:

		//atribut private
		int price;
		string idProduct;

	public:

		//konstruktor
		Product(int price, string idProduct){
			this->price = price;
			this->idProduct = idProduct;
		}

		Product(){
			this->price = 0;
			this->idProduct = "";
		}

		//getter dan setter price
		void setPrice(int price){
			this->price = price;
		}

		int getPrice(){
			return this->price;
		}

		//getter dan setter idProduct
		void setIdProduct(string idProduct){
			this->idProduct = idProduct;
		}

		string getIdProduct(){
			return this->idProduct;
		}

		//destruktor
		~Product(){
			
		}

};