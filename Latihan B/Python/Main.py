from Memory import Memory

#membuat array untuk objek produk
arrProduk = [Memory() for i in range(100)]

i = 0 #iterator
maxProduct = 0 #jumlah produk maksimum yang diinput

lanjut = 'y' #penanda kelanjutan do while loop

#memasukkan data produk dengan do while loop
while lanjut != 'n' and lanjut != 'N':

	if lanjut == 'y' or lanjut == 'Y':

		if i != 0:
			print("")

		print("=========================")
		print("Masukkan data produk " + str(i+1))

		#input data tiap produk
		idProduct = str(input("ID Product    : "))
		arrProduk[i].setIdProduct(idProduct)

		brand = str(input("Brand         : "))
		arrProduk[i].setBrand(brand)

		model = str(input("Model         : "))
		arrProduk[i].setModel(model)

		frequency = int(input("Frequency     : "))
		arrProduk[i].setFrequency(frequency)

		memorySize = int(input("Memory Size   : "))
		arrProduk[i].setMemorySize(memorySize)

		supportsCuda = str(input("Supports Cuda : "))
		arrProduk[i].setSupportsCuda(supportsCuda)

		price = int(input("Price         : "))
		arrProduk[i].setPrice(price)

		i = i + 1 #iterasi
		maxProduct = i #iterasi jumlah produk yang diinput

	#meminta user apakah akan melanjutkan input produk atau tidak
	lanjut = str(input("\n>>Lanjut? (y/n): "))


#menampilkan seluruh data produk
print("\n((Data Produk))")

for i in range(maxProduct):
	print("\n-------------------------")
	print("Produk " + str(i+1))
	print("-------------------------")
	print("ID Product    : " + str(arrProduk[i].getIdProduct()))
	print("Brand         : " + str(arrProduk[i].getBrand()))
	print("Model         : " + str(arrProduk[i].getModel()))
	print("Frequency     : " + str(arrProduk[i].getFrequency()) + " MHz")
	print("Memory Size   : " + str(arrProduk[i].getMemorySize()) + " GB")
	print("Supports Cuda : " + str(arrProduk[i].getSupportsCuda()))
	print("Price         : Rp" + str(arrProduk[i].getPrice()))