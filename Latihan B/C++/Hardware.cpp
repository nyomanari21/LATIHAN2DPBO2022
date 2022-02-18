//kelas yang digunakan untuk mengimplementasikan kelas Hardware
class Hardware : public Product{

	private:

		//atribut private
		string brand;
		string model;

	public:

		//konstruktor
		Hardware(string brand, string model){
			this->brand = brand;
			this->model = model;
		}

		Hardware(){
			this->brand = "";
			this->model = "";
		}

		//getter dan setter brand
		void setBrand(string brand){
			this->brand = brand;
		}

		string getBrand(){
			return this->brand;
		}

		//getter dan setter model
		void setModel(string model){
			this->model = model;
		}

		string getModel(){
			return this->model;
		}

		//destruktor
		~Hardware(){

		}

};