<?php

//kelas yang digunakan untuk mengimplementasikan kelas Hardware
class Hardware extends Product{

	//atribut private
	private $brand;
	private $model;

	//kostruktor
	public function __construct(){
		
	}

	//getter dan setter untuk atribut brand
	public function setBrand($brand){
		$this->brand = $brand;
	}

	public function getBrand(){
		return $this->brand;
	}

	//getter dan setter untuk atribut model
	public function setModel($model){
		$this->model = $model;
	}

	public function getModel(){
		return $this->model;
	}

	//destruktor
	public function __destruct(){

	}

}

?>