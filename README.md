## DESIGN PATTERNS  
- Patterns are proven object oriented experience.  
- Patterns don't give you code, they give you general solutions to design problems.  
- Patterns aren't _invented_ they are _discovered_.  
- Patterns provides a shared language that can maximize the value of your communication with other developers.  
  
#### 1- STRATEGY PATTERN  
  
🌟 Identify of the aspects of your application that vary and seperate them what stays the same.  
  - Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.  

🌟 Program to an interface not an implementation.
  - Duck classes won't need to know any of the implementation details for their own behaviors. 

🌟 Favor composition over inheritance
  - Composition means putting classes together (HAS-A)  
  - Instead of inheriting their behavior, getting their behavior by being composed with the right behavior object.
  - Creating systems using composition gives more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes,   
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

🌟 Strive for loosely coupled designs between objects that interact.
	- Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

- > java.util.Observable class violate OO design principle of **programming to interfaces not implementations**.
<br/>Also it can't possible to create an instance of the Observable class and compose it with our own objects, our class have to subclass. Because setChanged() method is protected that means it can't be called unless the class subclassed Observable. This design violates another design principle **favor composition over inheritance**.


#### 3- DECORATOR PATTERN

🌟 Classes should be open for extension, but closed for modification. (Open-Closed Principle)
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

🌟 **`Dependency Inversion Principle`**; Depend upon abstractions, do not depend upon concrete classes.
 Similar to "Program to an interface not an implementation". Except high-level components should not depend on low-level components; rather they should both depend on abstractions. (abstraction means interface or abstract class in Java) 

#### 5- SINGLETON PATTERN

**Definition**: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

- There is no public constructor. Constructor must be declared private.
- Singleton object can not be instantiated out of the class, so when another object ask for the instance Singleton class creates the instance and returns it.

For example our Singleton class has an _getInstance()_ method which returns the single object of the class.

**Types of singleton implementation:**

- Lazy created singleton object which is not thread safe. (it is created when asking for an instance)
- Lazy created but which is thread safe with synchronized whole method.
- Eagerly created (it is created when the class is loaded in JVM)

But synchronization is expensive, for reducing the use of synchronization in getInstance(), "double-checked locking" can be used. 

> **Synchronize** by adding synchronized keyword to the method/block we force every thread to wait its turn before it can enter the method/block. That is, no two threads may enter the method at the same time.

#### 6- COMMAND PATTERN

**Definition**: The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

- Command pattern encapsulates commands (method calls) in objects allowing us to issue requests without knowing the requested operation or the requesting object.
- Provides the options to queue commands, undo/redo actions and other manipulations.

**The classes participating in the pattern are:**
<br/>`Command` - declares an interface for executing an operation
<br/>`ConcreteCommand` - extends the Command interface, implementing the Execute method by invoking the corresponding operations on Receiver. It defines a link between the Receiver and the action.
<br/>`Client` - creates a ConcreteCommand object and sets its receiver;
<br/>`Invoker` - asks the command to carry out the request;
<br/>`Receiver` - knows how to perform the operations;

- Decouples the object that invokes the action(Invoker) from the object that performs the action(Receiver). Due to this usage it is also known as Producer - Consumer design pattern.

- The Command Pattern can also support logging all actions and being able to recover after a crash by reinvoking those actions with the addition two methods: _store()_ and _load()_.

- In practice, it is not uncommon for "smart" Command objects to implement the request themselves rather than delegating to a receiver.

#### 7- ADAPTER PATTERN

**Adapter Pattern Definition**: The Adapter Pattern converts the interface of a class into another interface the clients expect. 
<br/>Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

- Decouples the client from the implemented interface, and we expect the interface to change over time, the adapter encapsulates that change so that the client doesn't have to be modified each time it needs to operate against a different interface.

- There are two types of adapters: `object adapters` and `class adapters`.

- The only difference between object adapters and class adapters is that with class adapter, adapter is subclass of adaptee, while with object adapter it uses composition to pass the requests to adaptee.

**Facade Pattern Definition**: The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 
- Facade Pattern hides all the complexity of one or more classes behind a clean, well-lit facade.

- Facades don't encapsulate the subsystem classes; they merely provide a simplified interface to their functionality.
- The Facade Pattern also allows you to decople your client implementation from any one subsystem.

<u>The difference between the Adapter Pattern and the Facade Pattern is their intent:</u>
 
- The intent of the Adapter Pattern is to alter an interface so that it matches one a client is expecting. 
- The intent of the Facade Pattern is to provide a simplified interface to a subsytem.

🌟 Principle of Least Knowledge - talk only to your immediate friends. It means when you are designing a system, for any object, be careful of the number of classes it interacts with and also how it comes to interact with those classes.