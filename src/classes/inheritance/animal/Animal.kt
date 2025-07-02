package classes.inheritance.animal

/*
We’re going to add some common properties and functions to an Animal
superclass so that they can be inherited by each of the animal subclasses. This
isn’t meant to be an exhaustive list, but it’s enough to bring the general
idea.

I’ll have four properties:
image: The file name representing an image of this animal.
food: The type of food this animal eats, such as meat or grass.
habitat: The animal’s primary habitat, such as woodland, savannah or water.
hunger : An Int representing the hunger level of the animal. It changes
depending on when (and how much) the animal eats.

And four functions:
makeNoise(): Lets the animal make a noise.
eat(): What the animal does when it encounters its preferred food source.
roam(): What the animal does when it’s not eating or sleeping.
sleep(): Makes the animal take a nap.
 */

open class Animal {
    // the properties

    open val image: String = ""
    open val food: String = ""
    open val habitat: String = ""
    var hunger: Int = 10

    /* The functions */

    open fun makeNoise() {
        println("The Animal is making noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }
    
    fun sleep() {
        println("The Animal is sleeping")
    }
}

/* the subclasses */

// Hippo
class Hippo : Animal() {
    override val image: String = "hippo.png"
    override val food: String = "grass"
    override val habitat: String = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

// Canine
open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

// Wolf a subclass of Canine
class Wolf : Canine() {
    override val image: String = "wolf.png"
    override val habitat: String = "forests"
    override val food: String = "meat"

    override fun makeNoise() {
        println("Howl! Howl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

// Fox a subclass of Canine
class Fox : Canine() {
    override val image: String = "fox.png"
    override val habitat: String = "forests"
    override val food: String = "meat"

    override fun makeNoise() {
        println("Yip! Yip!")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}

// Feline

open class Feline : Animal() {
    override fun roam() {
        println("The Feline is roaming")
    }
}

// Lion a subclass of Feline
class Lion : Feline() {
    override val image: String = "lion.png"
    override val habitat: String = "forests"
    override val food: String = "meat"

    override fun makeNoise() {
        println("Roar! Roar!")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }
}

// Cheetah a subclass of Feline
class Cheetah : Feline() {
    override val image: String = "cheetah.png"
    override val food: String = "meat"
    override val habitat: String = "forests"

    override fun makeNoise() {
        println("Chirp! Chur!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}

// Lynx a subclass of Feline
class Lynx : Feline() {
    override val image: String = "lynx.png"
    override val habitat: String = "forests"
    override val food: String = "meat"

    override fun makeNoise() {
        println("Pur! Pur!")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}

fun main() {
    val wolf = Wolf()
    wolf.makeNoise() // calls the function from the Wolf class
    wolf.roam() // calls the function from the Canine class
    wolf.sleep() // calls the function from the Animal class
}


// NOTE: I never took the constructor approach even though it's the best