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


