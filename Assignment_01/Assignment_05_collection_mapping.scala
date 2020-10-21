package Demo

object collection_mapping {
  def main(args: Array[String]): Unit = {
    var mymap: Map[String, Int] = Map (
                                        "Anntena" -> 12000,
                                        "Power bord" -> 5000,
                                        "Cabling" -> 2300
    )
    var redmap = mymap.view.mapValues(x => x - x*0.1).toMap
    println(mymap)
    println(redmap)

  }
}
