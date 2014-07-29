package service

import datasource.DataSource
import scalaz.Reader

case class Song(name: String)

trait MusicService {
  private val songsCollectionName = "songs"
  def getSongListByUserId(userId: String) = Reader((dataSource: DataSource) =>
      dataSource.get(userId).get(songsCollectionName).getOrElse(List()).map(name => Song(name))
    )
}


