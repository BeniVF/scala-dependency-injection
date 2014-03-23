package datasource
import org.specs2.mock.Mockito

trait MockDataSourceModule extends DataSourceModule with Mockito {
  implicit val dataSource = mock[DataSource]

}
