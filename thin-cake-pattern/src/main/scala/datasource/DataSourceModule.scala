package datasource

trait DataSourceModule {
  def dataSource: DataSource
}

trait KeyValueDataSourceModule extends DataSourceModule {
  implicit lazy val dataSource = new KeyValueDataSource(Map(
    "beni.villa" -> Map("songs" -> List("L'otru llau de la mar", "Los Fayeos de Mayo", "Rigu Esva")),
    "john.smith" -> Map("songs" -> List("Working Class Whore", "Come as you are", "Island of shame"))))
}
