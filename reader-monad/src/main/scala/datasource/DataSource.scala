package datasource

trait DataSource {
  def get(id: String): Map[String, List[String]]
}

class KeyValueDataSource(data: Map[String, Map[String, List[String]]]) extends DataSource {
  def get(id: String): Map[String, List[String]] = data.get(id).getOrElse(Map())
}
