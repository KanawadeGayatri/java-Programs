//Q1.	Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.



package com.demo;
//Shape class

class Shape

{

// Instance variable to store area

double area;



// Method 

public void getArea() {



}



// Method to display the area

public void displayArea()

{

System.out.println("Area: " + area);

}

}
//Rectangle subclass

class Rectangle extends Shape {

double length;

double width;



// Constructor for Rectangle class

public Rectangle(double length, double width) //para

{

this.length = length;

this.width = width;

// Calculate the area 

getArea();

}

// Override the calculateArea() method 



public void getArea()

{

area = length * width;

}

}



//Main class 

public class ShapeEX 

{

public static void main(String[] args) {

// Create an instance of Rectangle

Rectangle rectangle = new Rectangle(6.02, 23.3);



// Display the area

System.out.println("area of rectangle");

rectangle.displayArea();

}

}


