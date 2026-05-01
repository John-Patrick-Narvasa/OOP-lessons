package Inheritance.Examples;


class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("cat is mewing");
    }
    
}


public class Example1 {
  public static void main(String args[]) {
    Dog myDog = new Dog();
    Cat myCat = new Cat();
    myDog.eat();
    myDog.bark();
    
    myCat.eat();
    myCat.meow();
  }
}
