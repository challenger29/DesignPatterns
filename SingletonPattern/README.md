Generic Problem: Need to regulate object creation as more than one object can create incorrect program behavior,
overuse of resources or inconsistent results.
Singleton ensures only one object is created, gives a global point of access without the downsides.
Steps:
1. make private static instance variable inside the class itself
2. make a getInstance() function
3. inside this get instance -> check if the instance is not null otherwise return it

Problem Statement:
Chocolate Factory boiler takes in chocolate and milk brings them to boil and then passes it to next phase of making chocolate bars.

Chocolate boiler has only one instance

Now think of multithreading. Where in the chocolate boiler was already filled and boiling the contents and we tried to fill it again. Obvious answer is to use synchronized. but where?
There are 2 ways to implement Singleton Pattern:
1.eagerly created instances are:
private static Singleton instance = new Singleton()
and adding synchronized in getInstance() function definition
2. doubleCheck locking to reduce use of synchronization
