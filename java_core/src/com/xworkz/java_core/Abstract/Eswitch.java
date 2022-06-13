package com.xworkz.java_core.Abstract;

abstract class Eswitch {
String brand;
float price;
abstract void switchOn();
abstract void switchOff();
void display() {
	System.out.println(brand);
	System.out.println(price);
}

}
