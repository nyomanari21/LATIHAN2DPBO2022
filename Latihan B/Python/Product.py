#kelas yang digunakan untuk mengimplementasikan kelas Product
class Product:

	#konstruktor
	def __init__(self):
		self.price = 0
		self.idProduct = ""


	#getter dan setter untuk atribut price
	def setPrice(self, price):
		self.price = price

	def getPrice(self):
		return self.price

	#getter dan setter untuk atribut idProduct
	def setIdProduct(self, idProduct):
		self.idProduct = idProduct

	def getIdProduct(self):
		return self.idProduct