# Reverse-Words
Solution to Interview Cake Course practice program, Reverse Words to practice array and string manipulation in Java

## Dependencies
* [Java SE 10](https://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html?)
* [Junit (version 4.3 included)](https://junit.org)

## Compile and Run
~~~
$ javac -cp .:junit-4.3.jar Solution.java
$ java -cp .:junit-4.3.jar Solution
~~~

## Problem
* Write a method `reverseWords()` that takes a message as an array of characters and reverses the order of the words in place [(source)](https://www.interviewcake.com/question/java/reverse-words?section=array-and-string-manipulation&course=fc1)
* For example, given:
```java
  char[] message = { 'c', 'a', 'k', 'e', ' ',
                   'p', 'o', 'u', 'n', 'd', ' ',
                   's', 't', 'e', 'a', 'l' };

  reverseWords(message);

  System.out.println(message);
  // prints: "steal pound cake"
```
* Assume the message contains only letters and spaces, and all words are separated by one space.

## Solution
* Can be done in *O(n)* time and *O(1)* space

