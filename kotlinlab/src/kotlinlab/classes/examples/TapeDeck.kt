package kotlinlab.classes.examples

class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing...")
    }

    fun recordTape() {
        if (hasRecorder) println("Tape recording...")
    }
}

class DVDPlayer(val hasRecorder: Boolean) {
    fun playDVD() {
        println("DVD playing...")
    }

    fun recordDVD() {
        if (hasRecorder) println("DVD recording...")
    }
}

fun main() {

    // playDeck
    val tape = _root_ide_package_.kotlinlab.classes.examples.TapeDeck()
    tape.hasRecorder = true // assigning a new value to the property hasRecorder
    tape.playTape()
    tape.recordTape()

    // DVDPlay
    val dvdPlayer = _root_ide_package_.kotlinlab.classes.examples.DVDPlayer(true)
    dvdPlayer.playDVD()
    dvdPlayer.recordDVD()
}