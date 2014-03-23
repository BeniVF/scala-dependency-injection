package datasource

import org.scalatest.{Matchers, FlatSpec}


class KeyValueDataSourceTest extends FlatSpec with Matchers with KeyValueDataSourceModule {

  "KeyValueDataSource" should "get right entry from a user id" in {
    //Given

    //When
    val result = dataSource.get("john.smith")

    //Then
    result should contain("songs" -> List("Working Class Whore", "Come as you are", "Island of shame"))
  }

  it should "get empty map from a non existing user id" in {
    //Given

    //When
    val result = dataSource.get("nonExistingUserId")

    //Then
    result should be('empty)
  }
}