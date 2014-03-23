package service

import org.scalatest.{Matchers, FlatSpec}
import datasource.KeyValueDataSourceModule

class MusicServiceIntegrationTest extends FlatSpec with Matchers with DefaultMusicModule with KeyValueDataSourceModule {

  "MusicService" should "get the user's song list" in {
    //Given

    //When
    val songs = musicService.getSongListByUserId("beni.villa")

    //Then
    songs should have length 3
    songs should contain(Song("Los Fayeos de Mayo"))
    songs should contain(Song("L'otru llau de la mar"))
    songs should contain(Song("Rigu Esva"))
  }

}
