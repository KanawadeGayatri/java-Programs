//Example2 Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void.
//Create three classes Circle, Rectangle, and Triangle that implement the 
//Drawable interface and override the draw() method to draw their respective shapes.

package com.demo;
//Interface for draw method
interface Drawable {
void draw();
}

//the Drawable interface for Circle
class Circle implements Drawable {
@Override
public void draw() {
  System.out.println("Drawing a Circle");
  
}
}

//Class implementing to Drawable interface for Rectangle
class Rectang implements Drawable {
@Override
public void draw() {
  System.out.println("Drawing a Rectangle");
  // Additional code for drawing a rectangle can be added here
}
}

//Class implementing the Drawable interface for Triangle
class Triangle implements Drawable {
@Override
public void draw() {
  System.out.println("Drawing a Triangle");
  // Additional code for drawing a triangle can be added here
}


//Main class 
public class Interface {
public static void main(String[] args) {
  // Create instances of Circle, Rectangle, and Triangle
  Circle circle = new Circle();
  Rectang rectangle = new Rectang();
  Triangle triangle = new Triangle();

  // Call the draw() method on each object for circle rectangle triangle
  circle.draw();
  rectangle.draw();
  triangle.draw();
}
}
}