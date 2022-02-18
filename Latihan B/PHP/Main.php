<?php

include "Product.php";
include "Hardware.php";
include "Memory.php";

//membuat array untuk objek produk
$arrProduk = array();

//membuat objek produk 1
$arrProduk[0] = new Memory();
$arrProduk[0]->setIdProduct("GP01");
$arrProduk[0]->setBrand("MSS");
$arrProduk[0]->setModel("GTX988");
$arrProduk[0]->setFrequency(1550);
$arrProduk[0]->setMemorySize(6);
$arrProduk[0]->setSupportsCuda("Yes");
$arrProduk[0]->setPrice(3499999);

//membuat objek produk 2
$arrProduk[1] = new Memory();
$arrProduk[1]->setIdProduct("GP02");
$arrProduk[1]->setBrand("ASIR");
$arrProduk[1]->setModel("GTX1077");
$arrProduk[1]->setFrequency(1820);
$arrProduk[1]->setMemorySize(8);
$arrProduk[1]->setSupportsCuda("Yes");
$arrProduk[1]->setPrice(4999999);

//membuat objek produk 2
$arrProduk[2] = new Memory();
$arrProduk[2]->setIdProduct("GP03");
$arrProduk[2]->setBrand("Kilobyte");
$arrProduk[2]->setModel("RTX3055");
$arrProduk[2]->setFrequency(1650);
$arrProduk[2]->setMemorySize(4);
$arrProduk[2]->setSupportsCuda("Yes");
$arrProduk[2]->setPrice(2999999);

$i = 0; //iterator

echo "((Data Produk))"."<br/>";
//menampilkan data produk 1
for($i = 0; $i < 3; $i++){

	echo "<br/>";
	echo "-------------------------"."<br/>";
	echo "Produk ".($i+1)."<br/>";
	echo "-------------------------"."<br/>";
	echo "ID Product: ".$arrProduk[$i]->getIdProduct()."<br/>";
	echo "Brand         : ".$arrProduk[$i]->getBrand()."<br/>";
	echo "Model         : ".$arrProduk[$i]->getModel()."<br/>";
	echo "Frequency     : ".$arrProduk[$i]->getFrequency()." MHz"."<br/>";
	echo "Memory Size   : ".$arrProduk[$i]->getMemorySize()." GB"."<br/>";
	echo "Supports Cuda : ".$arrProduk[$i]->getSupportsCuda()."<br/>";
	echo "Price         : Rp".$arrProduk[$i]->getPrice()."<br/>";

}

?>