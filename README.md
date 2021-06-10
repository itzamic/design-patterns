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
### Adapter
Match interfaces of different classes
#### Intent
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate
#### Applicability
Use the Adapter class when you want to use some existing class, but its interface isn't compatible with the rest of your code. 
### Bridge
Separates an object's interface from its implementation
#### Intent
Bridge is a structural design pattern that lets you split a large class, or a set of closely related classes into separate hierarchies-abstraction and implementation - which can be developed independently of each other.
#### Applicability
Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality(for example, if the class can work with various database servers)
### Composite
A tree structure of simple and composite objects
#### Intent
Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
#### Applicability
Use the Composite pattern when you have to implement a tree-like object structure
### Decorator
Add responsibilities to objects dynamically
#### Intent
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing objects inside special wrapper object that contain the behaviors
#### Applicability
Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects
### Facade
A single class that represents an entire subsystem
#### Intent
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
#### Applicability
Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem
### Flyweight
A fine-grained instance used for efficient sharing
#### Intent
Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.
#### Applicability
Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM
### Proxy
An object representing another object
#### Intent
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object
#### Applicability
- Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
- Access control (protection proxy). This is when you want only specific clients to be able to use the service object; for instance, when your objects are crucial parts of an operating system and clients are various launched applications (including malicious ones).
- Local Execution of a remote service (remote proxy). This is when the service object is located on a remote server.
- Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.
- Caching request results (caching proxy). This is when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.
- Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.

## Behavioral Patterns
These design patterns are specifically concerned with communication between objects.
