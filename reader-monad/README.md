# Reader Monad

**GOAL:** Develop a simple example using [Reader Monad](http://blog.originate.com/blog/2013/10/21/reader-monad-for-dependency-injection/)

## Description

Integrate two different modules to create an application:

 - *MusicModule*: contains the classes to achieve the music's requirements (e.g.: get the user's song list)
 - *DatSourceModule*: contains the classes concerning to the persistence engine. In practice, it could be a third party component.

## Prerequisites

 * Java 1.7
 * SBT 0.13.0
