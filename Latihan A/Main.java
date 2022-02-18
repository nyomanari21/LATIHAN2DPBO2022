import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		//membuat array untuk objek produk
		Memory arrProduk[] = new Memory[100];

		//penyimpan input data produk
		int price = 0;
		String idProduct = "";
		String brand = "";
		String model = "";
		int frequency = 0;
		int memorySize = 0;
		String supportsCuda = "";

		int i = 0; //iterator
		int maxProduct = 0; //penyimpan jumlah maksimum produk yang diinput

		int next = 1; //penanda kelanjutan do while loop

		//memasukkan data produk dengan do while loop
		do{

			if(next == 1){

				//membuat objek baru
				arrProduk[i] = new Memory();

				if(i != 0){
					System.out.println();
				}
				System.out.println("=========================");
				System.out.println("Masukkan data produk " + (i+1));

				//input tiap data produk
				System.out.print("ID Product    : ");
				try{
					idProduct = sc.next();
				}catch(Exception e){}
				arrProduk[i].setIdProduct(idProduct);

				System.out.print("Brand         : ");
				try{
					brand = sc.next();
				}catch(Exception e){}
				arrProduk[i].setBrand(brand);

				System.out.print("Model         : ");
				try{
					model = sc.next();
				}catch(Exception e){}
				arrProduk[i].setModel(model);

				System.out.print("Frequency     : ");
				try{
					frequency = sc.nextInt();
				}catch(Exception e){}
				arrProduk[i].setFrequency(frequency);

				System.out.print("Memory Size   : ");
				try{
					memorySize = sc.nextInt();
				}catch(Exception e){}
				arrProduk[i].setMemorySize(memorySize);

				System.out.print("Supports Cuda : ");
				try{
					supportsCuda = sc.next();
				}catch(Exception e){}
				arrProduk[i].setSupportsCuda(supportsCuda);

				System.out.print("Price         : ");
				try{
					price = sc.nextInt();
				}catch(Exception e){}
				arrProduk[i].setPrice(price);

				i++; //iterasi
				maxProduct = i; //iterasi jumlah produk yang diinput

			}

			//meminta user untuk melanjutkan input atau tidak
			System.out.print("\n>>Lanjut? (1 = ya | 0 = tidak): ");
			try{
				next = sc.nextInt();
			}catch(Exception e){}

		}while(next != 0);

		System.out.println("\n((Data Produk))");
		//menampilkan seluruh data produk
		for(i = 0; i < maxProduct; i++){

			System.out.println("\n-------------------------");
			System.out.println("Produk " + (i+1));
			System.out.println("-------------------------");
			System.out.println("ID Product    : " + arrProduk[i].getIdProduct());
			System.out.println("Brand         : " + arrProduk[i].getBrand());
			System.out.println("Model         : " + arrProduk[i].getModel());
			System.out.println("Frequency     : " + arrProduk[i].getFrequency() + " MHz");
			System.out.println("Memory Size   : " + arrProduk[i].getMemorySize() + " GB");
			System.out.println("Supports Cuda : " + arrProduk[i].getSupportsCuda());
			System.out.println("Price         : Rp" + arrProduk[i].getPrice());

		}

	}

}