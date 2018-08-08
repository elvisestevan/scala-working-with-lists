object WorkingWithLists {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(
      "a string",
      732,
      'c',
      true,
      null,
      9.9,
      () => "an anonymous function returning a string"
    )

    list.foreach(e => println(e))
  }
}