Problem Statement:
Beverage -> HouseBlend , Darkroast , Decaf , Espresso
Condiments -> Milk , Soy , Mocha , Whip




Ways to inherit behavior-> composition and delegation
Design Principle : classes should be open for extension but closed for modification

Decorator Pattern attaches additional responsibilities to an object dynamically.
provides a flexible alternative to subclassing for extending functionality

Can use abstract class/interface for Beverage
Make an abstract decorator class extending Beverage
since it makes easier to wrap the decorator around the Beverage

RealWorld DEcorators -> Java I/o ->
FileInputStream < BBufferedInputStream < LineNumberInputStream