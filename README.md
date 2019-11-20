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
