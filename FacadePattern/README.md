Facade pattern hides all the complexity of one or more classes behind a clean well lit facade.
HomeTheater problem:
System contains amplifier , CDPlayer , TheaterLighrs, Screen etc
To watch a movie , all of this has to be turned on setup
Also when movie gets over you need to close all these objects

Facade pattern provides a unified interface to a set of interfaces in a subsystem
Defines a higher level interface that makes the subsystem easier to use.
Design Principle: Principle of Least Knowledge/Law of Demeter
which means ->talk only to your immediate friends

A facade decouples a client from a complex subsystem.