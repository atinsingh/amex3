## Task 1
We are building a HRMS system. 
develop an interface class 
```java
interface Employee {
    void hire();
    void terminate();
    double calculateWage();
}
```

// Implement Employee 
```java
class FullTimeEmployee implements Employee {
    
}
class Contractor implements Employee {
    
}

```


Build a HRMS class 
```java

public class HRMS {
    public void hireAnEmployee(Employee employee){
        employee.hire();
    }
    
    public void terminateEmployee(Employee employee){
        employee.terminate();
    }
}

```