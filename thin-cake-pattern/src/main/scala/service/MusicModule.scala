package service

import datasource.DataSource


trait MusicModule {
  def musicService: MusicService
}

trait DefaultMusicModule extends MusicModule {
  //Dependency
  implicit val dataSource: DataSource
  //Services
  lazy val musicService = new DefaultMusicService
}

