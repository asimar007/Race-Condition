# Race Condition

A race condition occurs when two or more processes or threads try to access and modify shared data simultaneously.

# Output

### With Race Condition

![With Race Condition](https://github.com/asimar007/Cross-Region-Migration-of-AWS-EBS-Volumes/blob/main/Screenshot/With%20Race%20Condition.png?raw=true)

### Without Race Condition

![Without Race Condition](https://github.com/asimar007/Cross-Region-Migration-of-AWS-EBS-Volumes/blob/main/Screenshot/Without%20Race%20Condition.png?raw=true)

## Overview

- **WithoutRaceCondition.java**: This program uses synchronized methods to increment a shared counter. It ensures that only one thread can execute the increment operation at a time, preventing race conditions.

- **WithRaceCondition.java**: This program increments the same shared counter without synchronization, leading to potential race conditions. The final value of the counter may vary due to concurrent access by multiple threads.

### Handling Race Conditions with Synchronization

To prevent race conditions, we use the `synchronized` keyword in Java. It allows us to define a method or block of code that can only be accessed by one thread at a time. This ensures that the operations on shared resources are thread-safe.

### Race Condition Dary Run

![Dry Run](https://github.com/asimar007/Cross-Region-Migration-of-AWS-EBS-Volumes/blob/main/Screenshot/IMG_0050.JPG?raw=true)

## Clone Repository

To get started, clone this repository to your local machine using the following command:

```
 git clone https://github.com/asimar007/Race-Condition.git
 cd Race-Condition
```

## How to Run

1.  Compile and run the sequential execution

```
    javac WithoutRaceCondition.java
```

```
   java WithoutRaceCondition
```

2.  Compile and run the threaded execution

```
    javac WithRaceCondition.java
```

```
    java WithRaceCondition
```
