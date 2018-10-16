import java.util.*;
class Animal
{
void eat()
{
System.out.println("all animal needs food");
}
}
class Cat extends Animal
{
void eat()
{
System.out.println("cat like milk");
}
}

class Dog extends Animal
{
void eat()
{
System.out.println("dog like meat");
}

class ABC
{
public void main(String args[])
{
Cat c=new Cat();
Dog d=new Dog();
{
  c.eat();
  d.eat();
}
}
}
}