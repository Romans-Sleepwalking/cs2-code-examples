package LQ.testing

import org.scalatest._
import week11.linkedlist.LinkedListNode

class LinkedListTest  extends FunSuite {
  test("this is a linked list test from L23") {
    // creating a sample case
    var theList: LinkedListNode[Int] = new LinkedListNode(1, null)
    for (i <- 2 to 10) {
      theList = theList.prepend(i)
    }
    // the sample LinkedList: 1 -> 2 -> 3 -> ... -> 10
    theList.append(11)
    // the element 11 must be appended at the end - index 10
    println("Appended value: " + theList.apply(10).toString)
    println(theList.toString)
    //assert(theList.item(11) === 1)
  }
}
