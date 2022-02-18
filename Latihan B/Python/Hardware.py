from Product import Product

#kelas yang digunakan untuk mengimplementasikan kelas Hardware
class Hardware(Product):

	#konstruktor
	def __init__(self):
		self.brand = ""
		self.model = ""

	#getter dan setter untuk atribut brand
	def setBrand(self, brand):
		self.brand = brand

	def getBrand(self):
		return self.brand

	#getter dan setter untuk atribut model
	def setModel(self, model):
		self.model = model

	def getModel(self):
		return self.model