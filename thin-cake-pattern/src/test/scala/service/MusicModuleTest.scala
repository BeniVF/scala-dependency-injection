package service

import org.scalatest.{Matchers, FlatSpec}
import datasource.{DataSourceModule, KeyValueDataSource}

class MusicModuleTest extends FlatSpec with Matchers  {

  "MusicModule" should "create the dependencies of the module" in {
    val application = new Object with MusicModule with DataSourceModule {
      implicit val dataSource = new KeyValueDataSource(Map[String, Map[String, List[String]]]())
      val musicService = new DefaultMusicService()
    }
    application.musicService should not be (null)
  }

}
