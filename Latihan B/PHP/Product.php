<?php

//kelas yang digunakan untuk mengimplementasikan kelas Product
class Product{

	//atribut private
	private $price;
	private $idProduct;

	//konstruktor
	public function __construct($price = 0, $idProduct = ""){
		$this->price = $price;
		$this->idProduct = $idProduct;
	}

	//getter dan setter untuk atribut price
	public function setPrice($price){
		$this->price = $price;
	}

	public function getPrice(){
		return $this->price;
	}

	//getter dan setter untuk atribut idProduct
	public function setIdProduct($idProduct){
		$this->idProduct = $idProduct;
	}

	public function getIdProduct(){
		return $this->idProduct;
	}

	//destruktor
	public function __destruct(){

	}

}

?>