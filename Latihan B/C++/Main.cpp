#include <iostream>
#include <string>

using namespace std;

#include "Product.cpp"
#include "Hardware.cpp"
#include "Memory.cpp"

int main(){

	//membuat array untuk objek produk
	Memory arrProduk[100];

	//penyimpan input data produk
	int price = 0;
	string idProduct = "";
	string brand = "";
	string model = "";
	int frequency = 0;
	int memorySize = 0;
	string supportsCuda = "";

	int i = 0; //iterator
	int maxProduct = 0; //penyimpan jumlah maksimum produk yang diinput

	char next = 'y'; //penanda kelanjutan do while loop

	//memasukkan data produk dengan do while loop
	do{

		if(next == 'y' || next == 'Y'){

			if(i != 0){
				cout << endl;
			}
			cout << "=========================" << endl;
			cout << "Masukkan data produk " << (i+1) << endl;

			//input tiap data produk
			cout << "ID Product    : ";
			cin >> idProduct;
			arrProduk[i].setIdProduct(idProduct);

			cout << "Brand         : ";
			cin >> brand;
			arrProduk[i].setBrand(brand);

			cout << "Model         : ";
			cin >> model;
			arrProduk[i].setModel(model);

			cout << "Frequency     : ";
			cin >> frequency;
			arrProduk[i].setFrequency(frequency);

			cout << "Memory Size   : ";
			cin >> memorySize;
			arrProduk[i].setMemorySize(memorySize);

			cout << "Supports Cuda : ";
			cin >> supportsCuda;
			arrProduk[i].setSupportsCuda(supportsCuda);

			cout << "Price         : ";
			cin >> price;
			arrProduk[i].setPrice(price);

			i++; //iterator
			maxProduct = i; //iterasi jumlah produk yang diinput

		}
		
		//meminta user apakah akan melanjutkan input produk atau tidak
		cout << "\nLanjut? (y/n): ";
		cin >> next;

	}while(next != 'n' && next != 'N');

	//menampilkan seluruh data produk
	cout << "\n((Data Produk))" << endl;

	for(i = 0; i < maxProduct; i++){

		cout << "\n-------------------------" << endl;
		cout << "Produk " << (i+1) << endl;
		cout << "-------------------------" << endl;
		cout << "ID Product    : " << arrProduk[i].getIdProduct() << endl;
		cout << "Brand         : " << arrProduk[i].getBrand() << endl;
		cout << "Model         : " << arrProduk[i].getModel() << endl;
		cout << "Frequency     : " << arrProduk[i].getFrequency() << " MHz" << endl;
		cout << "Memory Size   : " << arrProduk[i].getMemorySize() << " GB" << endl;
		cout << "Supports Cuda : " << arrProduk[i].getSupportsCuda() << endl;
		cout << "Price         : Rp" << arrProduk[i].getPrice() << endl;

	}
	
	return 0;
}