package service

import org.scalatest.{FlatSpec, Matchers}
import datasource.MockDataSourceModule

class MusicServiceTest extends FlatSpec with Matchers with DefaultMusicModule with MockDataSourceModule{

  "MusicService" should "get the user's song list" in {
    //Given
    val userId = "xuan.cabritu"
    dataSource get (userId) returns Map("songs" -> List("Atiendi Asturies"))

    //When
    val songList = musicService.getSongListByUserId(userId)

    //Then
    songList should have length 1
    songList should contain(Song("Atiendi Asturies"))
  }

}
