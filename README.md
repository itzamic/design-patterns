# design-patterns
This is a repo containing design patterns using Java

Design patterns are well-proved solutions for solving specific problem/task.
They are like blueprints that you can use to solve a recurring problem in your code.
Patterns allow developers to communicate using well-known, well understood names for software interactions

## Creational Patterns
These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.
### Factory Method
Creates an instance of several derived classes
#### Intent
Factory method is a creational design pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
#### Applicability
Use the Factory Method when you don't know beforehand the exact types and dependencies of the objects your code should work with.
### Abstract Factory
Creates an instance of several families of classes
#### Intent
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
#### Applicability
Use the Abstract Factory when your code needs to work with various families of related products - they might be unknown beforehand, or you simply want to allow for future extensibility.
### Builder 
Separates object construction from its representation
#### Intent
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
#### Applicability
Use the Builder pattern to get rid of a "telescopic constructor".
### Prototype
A fully initialized instance to be copied or cloned
#### Intent 
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes
#### Applicability
Use the Prototype pattern when your code shouldn't depend on the concrete classes of objects that you need to copy.
### Singleton
A class of which only a single instance can exist
#### Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
#### Applicability
Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
## Structural Patterns
These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.
## Behavioral Patterns
These design patterns are specifically concerned with communication between objects.
