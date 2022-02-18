from Hardware import Hardware

#kelas yang digunakan untuk mengimplementasikan kelas Memory
class Memory(Hardware):

	#konstruktor
	def __init__(self):
		self.frequency = 0
		self.memorySize = 0
		self.supportsCuda = ""

	#getter dan setter untuk atribut frequency
	def setFrequency(self, frequency):
		self.frequency = frequency

	def getFrequency(self):
		return self.frequency

	#getter dan setter untuk atribut memorySize
	def setMemorySize(self, memorySize):
		self.memorySize = memorySize

	def getMemorySize(self):
		return self.memorySize

	#getter dan setter untuk atribut supportsCuda
	def setSupportsCuda(self, supportsCuda):
		self.supportsCuda = supportsCuda

	def getSupportsCuda(self):
		return self.supportsCuda