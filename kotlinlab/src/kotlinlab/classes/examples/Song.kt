package kotlinlab.classes.examples

class Song(val title: String, val artist: String) {
    // play function
    val play = fun() {
        println("Playing the song $title by $artist")
    }

    // stop member function
    val stop = fun() {
        println("Stopped playing the song $title by $artist")
    }
}

fun main() {
    val songOne = _root_ide_package_.kotlinlab.classes.examples.Song("The Mesopotamians", "The Mighty Be Giants")
    val songTwo = _root_ide_package_.kotlinlab.classes.examples.Song("Going Underground", "The Jam")
    val songThree = _root_ide_package_.kotlinlab.classes.examples.Song("Make Me Smile", "Steve Harley")

    println("Song one's title is ${songOne.title} and it was sung by ${songOne.artist}")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}