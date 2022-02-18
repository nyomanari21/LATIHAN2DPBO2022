<?php

//kelas yang digunakan untuk mengimplementasikan kelas Memory
class Memory extends Hardware{

	//atribut private
	private $frequency;
	private $memorySize;
	private $supportsCuda;

	//konstruktor
	public function __construct(){
		
	}

	//getter dan setter untuk atribut frequency
	public function setFrequency($frequency){
		$this->frequency = $frequency;
	}

	public function getFrequency(){
		return $this->frequency;
	}

	//getter dan setter untuk atribut memorySize
	public function setMemorySize($memorySize){
		$this->memorySize = $memorySize;
	}

	public function getMemorySize(){
		return $this->memorySize;
	}

	//getter dan setter untuk atribut supportsCuda
	public function setSupportsCuda($supportsCuda){
		$this->supportsCuda = $supportsCuda;
	}

	public function getSupportsCuda(){
		return $this->supportsCuda;
	}

	//destruktor
	public function __destruct(){

	}

}

?>