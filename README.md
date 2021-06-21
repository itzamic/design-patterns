# Design Patterns
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
### Chain of Responsibility
A way of passing a request between a chain of objects
#### Intent
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
#### Applicability
- Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
- Use the pattern when it's essential to execute several handlers in a particular order.
- Use the CoR pattern when the set of handlers and their order are supposed to change at runtime.
### Command
Encapsulate a command request as an object
#### Intent
Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.
#### Applicability
- Use the Command pattern when you want to parametrize objects with operations.
- Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
- Use the Command pattern when you want to implement reversible operations.
### Iterator
Sequentially access the elements of a collection
#### Intent
Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree etc).
#### Applicability
- Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).
- Use the pattern to reduce duplication of the traversal code across your app.
- Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.
### Mediator
Defines simplified communication between classes
#### Intent
Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
#### Applicability
- Use the Mediator pattern when it's hard to change some classes because they are tightly coupled to a bunch of other classes.
- Use the pattern when you can't reuse a component in a different program because it's too dependent on other components
- Use the Mediator when you find yourself creating tons of component subclasses just to reuse some basic behavior in various contexts.
### Memento
Capture and restore an object's internal state
#### Intent
Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
#### Applicability
- Use the Memento pattern when you want to produce snapshots of the object's state to be able to restore a previous state of the object
- Use the pattern when direct access to the object's fields/getters/setters violates its encapsulation.
### Observer
A way of notifying change to a number of classes
#### Intent
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.
#### Applicability
- Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically
- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.
### State
Alter an object's behavior when its state changes
#### Intent 
State is a behavioral design pattern that lets an object alter its behavior whe its internal state changes. It appears as if the object changed its class.
#### Applicability
- Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
- Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class's fields.
- Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.
### Strategy
Encapsulates an algorithm inside a class
#### Intent
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into separate class, and make their objects interchangeable.
#### Applicability
- Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
- Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
- Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
- Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm
### Template Method
Defer the exact steps of an algorithm to a subclass
#### Intent
Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
#### Applicability
- Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
- Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.
### Visitor
Defines a new operation to a class without change
#### Intent
Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
#### Applicability
- Use the Visitor when you need to perform an operation on  all elements of a complex object structure (for example, an object tree).
- Use the Visitor to clean up the business logic of auxiliary behaviors.
- Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
