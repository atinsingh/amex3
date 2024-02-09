## Abstract Classes 
Abstract classes are the classes with abstract method or declared with 
abstract keyword
Example 
```java
public abstract  class Print {
    private String printerName;
    private String printerVersion;
    
    public abstract void print();
    
    public Print(String printerName) {
        this.printerName = printerName;
    }
    
    
}

```

We can assign a child class object to a reference of parent or
super parent class. 

## Interface 
Interface provide 100% abstraction, you can term interface as a
contract which should be fulfilled by every class implementing 
interface. 
 - All members in interface are public 

A class can implement 1 or more interface at same time, but
it can only extend one class at time. 

```java
class  A {
    
}
class B {
    
}
class C extends A,B { // Not valid 
    
}

interface X {
    
}
interface Y {
    
}
class Z extends B implements X,Y{ // Vaid
    
}
```

Interface can also extend more than one interfaces 
```java
interface  A { }
interface  B {}
interface  C extends A,B {}

```