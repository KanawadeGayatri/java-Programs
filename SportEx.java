////Q.3Write a Java program to create a base class Sports with a method called play(). 
//Create three subclasses: Football, Basketball, and Rugby.
//Override the play() method in each subclass to play a specific statement for each sport


package com.demo;

//Sports.java
 class Sports {
 public void play() {
     System.out.println("Playing a generic sport");
 }
}

//Football.java
 class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Football");
 }
}

//Basketball.java
 class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Basketball");
 }
}

//Rugby.java
public class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Rugby");
 }
}

//Main.java
public class SportEx {
 public static void main(String[] args) {
     // Creating instances of Football, Basketball, and Rugby
     Sports football = new Football();
     Sports basketball = new Basketball();
     Sports rugby = new Rugby();

     // Calling play() method on each object
     football.play();
     basketball.play();
     rugby.play();
 }
}
