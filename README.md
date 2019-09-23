# Coding Challenge

This a plain java project. I have used this project later to convert it into a **maven** project. This project simply shows the output based on the input as per problem description.


## key considerations

- I have used java 1.8 here. 
- I have kept the abstraction separated from the concrete implementation 
- Designed based on **Single responsibility**
- Also designed in a modular way so that it can be migrated to any build tool (e.g. maven)
- Used data structures (e.g., ArrayList, HashMap) to reduce search (i.e., lookup) time complexity. 

## How to run

To run the project, simply use the following command

```
./run.sh
```

## Assumptions

I am considering 

- when a transaction is in Reversal Type, it revers the *whole transaction*.
  
   