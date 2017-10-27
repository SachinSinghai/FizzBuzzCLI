echo off

mkdir target

javac -d target -sourcepath src src\com\java\kenzan\FizzBuzzController.java

java -cp target com.java.kenzan.FizzBuzzController

pause