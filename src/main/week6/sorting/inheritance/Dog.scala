package week6.sorting.inheritance

class Dog(name: String) extends Animal(name) {

  override def sound(): String = {
    "woof"
  }

}