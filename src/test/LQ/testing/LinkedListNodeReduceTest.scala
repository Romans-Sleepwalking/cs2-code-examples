package LQ.testing

import org.scalatest._
import week11.linkedlist.LinkedListNode

class LinkedListNodeReduceTest  extends FunSuite {
  test("this is a linked list test for LQ24") {
    // creating a sample case
    var theList: LinkedListNode[Int] = new LinkedListNode(1, null)
    for (i <- 2 to 10) {
      theList = theList.prepend(i)
    }
    println(theList.toString)
    // the sample LinkedList: 1 -> 2 -> 3 -> ... -> 10

    // passing and obtaining sum function
    val sum: Int = theList.reduce((a: Int, b: Int) => a + b)

    println("Total sum of list nodes: " + sum)
    assert(sum === 55)  // 1 + 2 + 3 + ... + 10 = 55
  }
}
