//kelas yang digunakan untuk mengimplementasikan kelas Memory
class Memory : public Hardware{

	private:

		//atribut private
		int frequency;
		int memorySize;
		string supportsCuda;

	public:

		//konstruktor
		Memory(int frequency, int memorySize, string supportsCuda){
			this->frequency = frequency;
			this->memorySize = memorySize;
			this->supportsCuda = supportsCuda;
		}

		Memory(){
			this->frequency = 0;
			this->memorySize = 0;
			this->supportsCuda = "";
		}

		//getter dan setter frequency
		void setFrequency(int frequency){
			this->frequency = frequency;
		}

		int getFrequency(){
			return this->frequency;
		}

		//getter dan setter memorySize
		void setMemorySize(int memorySize){
			this->memorySize = memorySize;
		}

		int getMemorySize(){
			return this->memorySize;
		}

		//getter dan setter supportsCuda
		void setSupportsCuda(string supportsCuda){
			this->supportsCuda = supportsCuda;
		}

		string getSupportsCuda(){
			return this->supportsCuda;
		}

		//destruktor
		~Memory(){

		}

};