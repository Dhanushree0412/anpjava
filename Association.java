package day13;

//Composition: Heart and Brain are part of Student
class Heart {
 private double weight;
 private int bpm;

 public Heart(double weight, int bpm) {
     this.weight = weight;
     this.bpm = bpm;
 }

 public void showInfo() {
     System.out.println("Heart weight: " + weight + "BPM: " + bpm);
 }
}

class Brain {
 private double weight;
 private String color;

 public Brain(double weight, String color) {
     this.weight = weight;
     this.color = color;
 }

 public void showInfo() {
     System.out.println("Brain weight: " + weight + "Color: " + color);
 }
}

//Aggregation: Bike and Book exist independently
class Bike {
 private String brand;
 private double mileage;

 public Bike(String brand, double mileage) {
     this.brand = brand;
     this.mileage = mileage;
 }

 public void showInfo() {
     System.out.println("Bike Brand: " + brand + ", Mileage: " + mileage);
 }
}

class Book {
 private String author;
 private String name;

 public Book(String author, String name) {
     this.author = author;
     this.name = name;
 }

 public void showInfo() {
     System.out.println("Book Author: " + author + ", Name: " + name);
 }
}

//Student class with composition and aggregation
class Student {
 private String name;
 private Heart heart;   // Composition
 private Brain brain;   // Composition
 private Bike bike;     // Aggregation
 private Book book;     // Aggregation

 public Student(String name, Heart heart, Brain brain, Bike bike, Book book) {
     this.name = name;
     this.heart = heart;
     this.brain = brain;
     this.bike = bike;
     this.book = book;
 }

 public void showInfo() {
     System.out.println("Student: " + name);
     heart.showInfo();
     brain.showInfo();
     bike.showInfo();
     book.showInfo();
 }
}

//Demo class
public class Association {
 public static void main(String[] args) {
     Heart heart = new Heart(30, 72);
     Brain brain = new Brain(140, "Gray");
     Bike bike = new Bike("Yamaha", 45);
     Book book = new Book("Srikanth S", "Java");

     Student student = new Student("Alice", heart, brain, bike, book);

     student.showInfo();
 }
}

