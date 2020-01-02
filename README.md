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

#### 8- TEMPLATE METHOD PATTERN

- The template method defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps.

**Definition**: The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

- Presents an important technique for code reuse.

- To prevent the subclasses from changing the algorithm in the template method, declare the template method as final. 

- **Hook** : A hook is a method that is declared in the abstract class, but only given an empty or default implementation. A subclass is also free to ignore the hook.

🌟 **`The Hollywood Principle`** Don't call us, we'll call you. This principle gives us a way to prevent 'dependency rot'. Dependecy rot happens when you have high-level components depending on low-level components...

- The high-level components give the low-level components a "don't call us, we'll call you" treatment.

--> The Strategy and Template Method Patterns both encapsulate algorithms, one by inheritance and one by composition.

#### 9- ITERATOR PATTERN

**Iterator Pattern Definition**: The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

- It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be.

🌟 **`Single Responsibility Principle`** A class should have only one reason to change. 

- Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change.

**Cohesion** is a term you'll hear used as a measure of how closely a class or a module supports a single purpose or responsibility. We say that a module or class has `high cohesion` 
when it is designed around a set of related functions, and we say it has `low cohesion` when it is designed around a set of unrelated functions.

**Composite Pattern Definition**: The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets client treat individual objects and compositions of objects uniformly

- Composite Pattern takes the Single Responsibility design principle and trades it for transparency. Whether an element is a composite or leaf node becomes transparent to the client.
There are many tradeoffs in implementing Composite. Transparency and safety in our needs should be balanced.

#### 10- STATE PATTERN

**Definition**: The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

- State Pattern and Strategy pattern have same class diagrams but they differ in their intent.

- With the State Pattern, we have a set of behaviors encapsulated in state objects; at any time the context is delegating to one of those states. The client usually knows very little about the state objects.

- With Strategy, the client usually specifies the strategy object that the context is composed with.

- In general, think of the Strategy Pattern as a flexible alternative to subclassing. You can change the behavior by composing with a different strategy object.

- Think of the State Pattern as an alternative to putting lots of conditionals in your context. You can simply change the state object in context to change its behavior.

- More state classes is a price for flexibility. Otherwise very large, monolithic conditional statements in one class make code hard to maintain and understand. Also this violates Single Responsibility principle.

#### 11- PROXY PATTERN

**Definition**: The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.
Use the Proxy Pattern to create a representative object that controls access to another object, which may be remote, expensive to create or in need of securing.

- A remote proxy provides a local representative for an object in a different address space.
- A virtual proxy controls creating expensive objects on demand.
- A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.
- Many other variants of the Proxy Pattern exist including caching proxies, synchronization proxies, firewall proxies, and so-on.

* Java lets us create a proxy class _on the fly_ (at runtime) that implements one or more interfaces and forwards method invocations to a class that you specify. This Java Technology is called **dynamic proxy**. 

- Proxy is structurally similar to Decorator, but the two differ in their purpose.
- The Decorator Pattern adds behavior to an object, while a Proxy controls access.



