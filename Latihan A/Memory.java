//kelas yang digunakan untuk mengimplementasikan kelas Memory
public class Memory extends Hardware{

	//atribut private
	private int frequency = 0;
	private int memorySize = 0;
	private String supportsCuda = "";

	//konstruktor
	public Memory(int frequency, int memorySize, String supportsCuda){
		this.frequency = frequency;
		this.memorySize = memorySize;
		this.supportsCuda = supportsCuda;
	}

	public Memory(){

	}

	//getter dan setter frequency
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	public int getFrequency(){
		return this.frequency;
	}

	//getter dan setter memorySize
	public void setMemorySize(int memorySize){
		this.memorySize = memorySize;
	}

	public int getMemorySize(){
		return this.memorySize;
	}

	//getter dan setter supportsCuda
	public void setSupportsCuda(String supportsCuda){
		this.supportsCuda = supportsCuda;
	}

	public String getSupportsCuda(){
		return this.supportsCuda;
	}

}