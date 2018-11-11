Publishers + Subscribers = Observer Pattern
publisher is called the subject and subscribers are called observers

It define one to many dependency b/w objects so that when the subject object changes state,
all its dependants are notified and updated automatically.

Two interfaces - 
1-subject - registerObserver , removeObbserver , notifyObserver
2-observer - update()

Loose coupling -> when two or more objects interact with very little knowledge of each other

Main Class -> weatherStation
