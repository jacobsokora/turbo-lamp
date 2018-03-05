fun main(args: Array<String>) {
    val sample1: Byte = 0x3A
    val sample2: Byte = 58
    val heartRate: Int = 85
    val deposits: Double = 135002796.toDouble()
    val acceleration: Float = 9.800f
    val mass: Float = 14.6f
    val distance: Double = 129.763001
    val lost: Boolean = true
    val expensive: Boolean = true
    val choice: Int = 2
    val integral: Char = '\u222B'
    val greeting: String = "Hello"
    val name: String = "Karen"

    if(sample1 == sample2) {
        println("The samples are equal.")
    } else {
        println("The samples are not equal")
    }

    if(heartRate in 40..80) {
        println("Heart rate is normal")
    } else {
        println("Heart rate is not normal")
    }

    if(deposits >= 100000000) {
        println("You are exceedingly wealthy")
    } else {
        println("Sorry you are so poor")
    }

    val force = mass * acceleration
    println("force = $force")

    println("$distance is the distance")

    if(lost) {
        if(expensive) {
            println("I am really sorry! I will get the manager")
        } else {
            println("Here is a coupon for 10% off")
        }
    }

    when(choice) {
        1, 2, 3 -> println("You chose $choice")
        else -> println("You made an unknown choice")
    }

    println("$integral is an integral")

    for(i in 5..10) {
        println("i=$i")
    }

    var age: Int = 0
    while(age < 6) {
        println("age = ${age++}")
    }

    println("$greeting $name")
}
