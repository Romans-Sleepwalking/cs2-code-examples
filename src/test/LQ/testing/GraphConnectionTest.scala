package LQ.testing

import week13._

import org.scalatest._
import week11.linkedlist.LinkedListNode

class GraphConnectionTest  extends FunSuite {
  test("this is a graph test for LQ28") {
    val graph = GraphExample.Example()

    println("\nTest 1")
    // UCLA and SDC are connected
    assert(graph.areConnected(0, 6) === true)

    println("\nTest 2")
    // STANFORD and MIT are not connected
    assert(graph.areConnected(1, 7) === false)
  }
}

