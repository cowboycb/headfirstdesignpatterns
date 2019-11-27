## DESIGN PATTERNS  
- Patterns are proven object oriented experience.  
- Patterns don't give you code, they give you general solutions to design problems.  
- Patterns aren't _invented_ they are _discovered_.  
- Patterns provides a shared language that can maximize the value of your communication with other developers.  
  
#### 1- STRATEGY PATTERN  
  
- Identify of the aspects of your application that vary   
and seperate them what stays the same.  
  - Take the parts that vary and encapsulate them, so that later you can  
   alter or extend the parts that vary without affecting those that don't.  
- Program to an interface not an implementation.
  - Duck classes won't need to know any of the implementation details  
   for their own behaviors. 
- Favor composition over inheritance
  - Composition means putting classes together (HAS-A)  
  - Instead of inheriting their behavior, getting their behavior by being composed   
   with the right behavior object.  
  - Creating systems using composition gives more flexibility. Not only does it  
   let you encapsulate a family of algorithms into their own set of classes,   
   but it also lets you change behavior at runtime.  
  
**Definition**: Strategy Pattern defines a family of algorithms,  
encapsulates each one, and makes them interchangeable.   
Strategy lets the algorithm vary independently from clients that use it.

#### 2- OBSERVER PATTERN

** Observer pattern is alike newspaper subscription.
Publisher is the Subject and the subscribers are the Observers. 

**Definition**: The Observer Pattern defines a one-to-many dependency between objects so that when on object changes state, all of its dependents are notified and updated automatically.

- When two objects are loosely coupled, they can interact, but have very little knowledge of each other. 
	- The Observer Pattern provides an object design where subjects and observers are loosely coupled.

- Strive for loosely coupled designs between objects that interact.
	- Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

- > java.util.Observable class violate OO design principle of **programming to interfaces not implementations**.
<br/>Also it can't possible to create an instance of the Observable class and compose it with our own objects, our class have to subclass. Because setChanged() method is protected that means it can't be called unless the class subclassed Observable. This design violates another design principle **favor composition over inheritance**.


#### 3- DECORATOR PATTERN

- Classes should be open for extension, but closed for modification. (Open-Closed Principle)
- Inheritance is one form of extension, but not necessarily the best way to achieve flexibility.
- Decorators has the same supertype as the objects they decorate

- Composition and delegation can often be used to add new behaviors at runtime.

**Definition**: The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

Decorators change the behavior of their components by adding new functionality before and/or after method calls to the component.

> Java I/O classes are largely based on Decorator Pattern.
Java I/O also points out one of the downsides of the Decorator Pattern:
<br/>designs using this pattern often result in a large number of small classes.

- With Factory and/or Builder Patterns creating decorated objects is much better.


#### 4- FACTORY PATTERN WITH TYPES

- Factory isn't actually a Design Pattern; it's more of a programming idiom. But it's commonly used.
- Factories handle the details of object creation.
- Factories decouple client code from the concrete classes. 
- All factories encapsulate object creation

**Simple Factory Pattern Definition**: defines a class which has a method responsible for creating object with details and returning instance.
Defining a simple factory as a static method is a common technique and is often called **Static Factory**. This also has a disadvantage that this factory class couldn't be subclassed and changed its behaviour.

**Factory Method Pattern Definition**: defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
It encapsulates product knowledge into each creator. Base creator class is written without knowledge of the actual products that will be created, which is decided purely by the choice of the subclass of the creator that is used.

**Abstract Factory Pattern Definition**: provides an interface for creating families of related or dependent objects without specifying their concrete classes.
Factory methods are a natural way to implement product methods in abstract factories. _If new products added then abstract factory interface needs to change, that is a disadvantage._
Abstract Factory often use _Factory Methods_ to implement concrete factories.

- Factory Method relies on inheritance: object creation is delegated to subclasses. Abstract Factory relies on object composition: object creation is implemented in methods.  

- By placing all object creation code in one place, avoids duplicate code and provides to perform maintenance easily.

- Dependency Inversion Principle; Depend upon abstractions, do not depend upon concrete classes.
 Similar to "Program to an interface not an implementation". Except high-level components should not depend on low-level components; rather they should both depend on abstractions. (abstraction means interface or abstract class in Java) 


