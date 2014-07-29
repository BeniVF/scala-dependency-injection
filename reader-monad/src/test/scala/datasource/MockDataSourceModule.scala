package datasource

import org.specs2.mock.Mockito

trait MockDataSourceModule extends Mockito {
  lazy val dataSource = mock[DataSource]
}
