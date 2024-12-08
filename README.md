# 3D Shapes Calculator
# Project Description
The 3D Shapes Calculator is a Java program that demonstrates the concept of polymorphism by creating an interface for 3D shapes and implementing it across multiple classes. The program calculates the surface area and volume of three different 3D shapes—Sphere, Cylinder, and Cube—based on randomly generated dimensions. 

#### Features
Calculates surface area and volume for:
- Sphere: Based on radius.
- Cylinder: Based on radius and height.
- Cube: Based on the length of a side.
Randomly generates dimensions for each shape within predefined ranges.
Displays the shape type, its dimensions (rounded to 2 decimal places), surface area, and volume.
#### How Polymorphism is used

Polymorphism in Java allows a single interface or method to operate on objects of different types. It enables dynamic method resolution, where the implementation of a method is determined at runtime based on the actual object type.

Polymorphism in This Project
#### Interface (Shape3DInterface):
Defines a common contract for all 3D shapes with two methods:
- double surfaceArea()
- double volume()
#### Each class (Sphere, Cylinder, and Cube) implements this interface, providing their own logic for these methods.
Unified Handling of Different Shapes:
- All shape objects are stored in an array of type Shape3DInterface[].
- This allows the program to treat all shapes uniformly, regardless of their specific type (Sphere, Cylinder, or Cube).
Dynamic Method Dispatch:
- The methods surfaceArea() and volume() are called on the interface reference, but the actual implementation invoked is determined by the runtime type of the object.


