The adapter pattern takes in :
2 interfaces of the objects who are communicating.
For example in this case Duck and Turkey.

Then create an AdpaterClass ( concrete one ) which implements 
form to be converted in.
example: Turkey was to be adpated in the form of Duck
So adapter:
1. implemented Duck
2. took Turkey as a instance variable
3. Constructor was set to take turkey as input

Now u can use turkeyAdapter obbject as Duck any place.since it implements all its functions.
