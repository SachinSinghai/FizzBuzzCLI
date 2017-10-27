echo off

mkdir destination

javac -d destination -sourcepath src src\com\java\kenzan\FizzBuzzController.java

java -cp destination com.java.kenzan.FizzBuzzController

pause