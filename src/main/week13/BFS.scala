package week13

import week11.linkedlist.Queue


object BFS {

  def bfs[A](graph: Graph[A], startID: Int, endID: Int): Boolean = {

    var explored: Set[Int] = Set(startID)

    var distance: Map[Int, Int] = Map()
    distance += startID -> -1

    val toExplore: Queue[Int] = new Queue()
    toExplore.enqueue(startID)

    while (!toExplore.empty()) {
      val nodeToExplore = toExplore.dequeue()
      for (node <- graph.adjacencyList(nodeToExplore)) {
        if(!explored.contains(node)){
          println("exploring: " + graph.nodes(node))
          if (node == endID){
            return true
          }
          distance += node -> nodeToExplore
          toExplore.enqueue(node)
          explored = explored + node
        }
      }
    }
    return false
  }

}