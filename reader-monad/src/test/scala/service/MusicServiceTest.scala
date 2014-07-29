package service

import org.scalatest.{FlatSpec, Matchers}
import datasource.{DataSource, MockDataSourceModule}
import scalaz.Reader

class MusicServiceTest extends FlatSpec with Matchers with MockDataSourceModule {

  val musicService = new Object with MusicService

  "MusicService" should "get the user's song list" in {
    //Given
    val userId = "xuan.cabritu"
    dataSource get (userId) returns Map("songs" -> List("Atiendi Asturies"))

    //When
    val songList = run(musicService.getSongListByUserId(userId))

    //Then
    songList should have length 1
    songList should contain(Song("Atiendi Asturies"))
  }

  private def run[A](reader: Reader[DataSource, A]): A = {
    reader(dataSource)
  }

}
