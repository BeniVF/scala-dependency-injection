package service

import datasource.DataSource

case class Song(name: String)

trait MusicService {
  def getSongListByUserId(userId: String): List[Song]
}

class DefaultMusicService(implicit dataSource: DataSource) extends MusicService {
  def getSongListByUserId(userId: String) = {
    val songsCollectionName = "songs"
    dataSource.get(userId).get(songsCollectionName).getOrElse(List()).map(name => Song(name))
  }
}
