import kotlin.collections.List

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum class DayOfTheWeek {
    // more code goes here
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday

}

fun List<String>.toBulletedList(): String {
    val separator = "\n - "
    return this.map { "$it" }.joinToString(separator, prefix = separator, postfix = "\n")
}

fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    val yes: Boolean = true // better practice, code more readable
    val no = false
    val alsoTrue = !(1 == 2) // evaluates to not false or true

    println("alsoTrue = $alsoTrue")

    val andTrue = 1 < 2 && 4 > 3 // both true
    println("andTrue = $andTrue") // true
    val andFalse = 1 < 2 && 3 > 4 // one true one false
    println("andFalse = $andFalse") // false
    val orTrue = 1 < 2 || 3 > 4 //one true one false
    println("orTrue = $orTrue") // true
    val orFalse = 1 == 2 || 3 == 4 // both false
    println("orFalse = $orFalse") // false

    var sum: Int = 1

    while (true) {
        sum = sum + (sum + 1)
        println("sum = $sum")
        if (sum >= 100) {
            break
        }
    }

    val count = 10

    var total: Int = 0
    for (i in 1..count) {
        total += i // equivalent to total = total + i
        println("total = $total")
    }

    println("Final total = $total")

    printMyName("Daffy Duck")
    printMyName()

    println(fullName("Daffy", "Duck"))

    var result: Int? = 30
    println(result)

    var nullableResult: Int?
    var nonNullableResult: Int = 0

    if (result != null) {
        nonNullableResult = result
    } else {
        nullableResult = result
    }

    println(nonNullableResult + 1)

    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null) {
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")
// > Author's name has length 10.

    val nameLengthPlus5 = authorName?.length?.plus(5)
    println("Author's name length plus 5 is $nameLengthPlus5.")
// > Author's name length plus 5 is 15.

    authorName?.let {
        nonNullableAuthor = authorName
    }

    authorName?.let {
        nameLength = authorName.length
    }

    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0

    println(mustHaveResult)

    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")

    val testList = listOf("Mercury", 5, 6.0, "Mars")

    val testArray = arrayOf("Mercury", 5, 6.0, "Mars")

    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")

    println(players.isEmpty())
// > false
    var currentPlayer = players.first()
    println(currentPlayer) // > Alice

    currentPlayer = players[1]
    println(currentPlayer) // > Alice

    println(players)

    players.forEach { player ->
        println(player)
    }

    val upcomingPlayersSlice = players.slice(1..2)
    println(upcomingPlayersSlice.joinToString()) // > Bob, Cindy

    players.add("Eli")
    players.forEach { player ->
        println(player)
    }

    var yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )

    var namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println(namesAndScores) // > {Anna=2, Brian=2, Craig=8, Donna=6}

    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )

    bobData.put("state", "CA")

    bobData["city"] = "San Francisco"

    println(bobData)

    val john = Person(firstName = "Johnny", lastName = "Appleseed")

    //println(john.fullName) // > Johnny Appleseed

    var var1 = SimplePerson(name = "John")
    println(var1.name)

    var var2 = var1
    println(var2.name)

    var2.set("Jane")
    println(var1.name)

    var homeOwner = john
    john.firstName = "John"

    println(john.firstName)      // > John
    println(homeOwner.firstName) // > John

    println(homeOwner === john) // > true

    val impostorJohn = Person(firstName = "John", lastName = "Appleseed")

    println(john === homeOwner) // true
    println(john === impostorJohn) // false
    println(impostorJohn === homeOwner)

    val jane = Student(firstName = "Jane", lastName = "Appleseed")
    //val history = Grade(letter = "B", points = 9.0, credits = 3.0)
    //var math = Grade(letter = "A", points = 16.0, credits = 4.0)

    //jane.recordGrade(history)
    //jane.recordGrade(math)

    var gradeList = ""
    for (grade in jane.grades)
    {
        gradeList += grade.letter + " "
    }

    println(gradeList)

    val john1 = Person(firstName = "Johnny", lastName = "Appleseed")
    val jane1 = Student(firstName = "Jane", lastName = "Appleseed")

    println(john1.fullName()) // Johnny Appleseed
    println(jane1.fullName()) // Jane Appleseed

    val history = Grade(letter = "B", points = 9.0, credits = 3.0)
    jane1.recordGrade(history)
 // john1.recordGrade(history) // john is not a student!

    val person = Person(
        firstName = "Johnny",
        lastName = "Appleseed"
    )
    val oboePlayer = OboePlayer(
        firstName = "Jane",
        lastName = "Appleseed"
    )

    println(person.phonebookName(person))     // Appleseed, Johnny
    println(oboePlayer.phonebookName(oboePlayer)) // Appleseed, Jane

    var hallMonitor =
        Student(firstName = "Jill", lastName = "Bananapeel")
    hallMonitor = oboePlayer

    println(hallMonitor.minimumPracticeTime) // Error!

    println(oboePlayer.afterClassActivity(oboePlayer)) // Goes to practice!
    println(oboePlayer.afterClassActivity(oboePlayer as Student)) // Goes home!

    val math = Grade(letter = "B", points = 9.0, credits = 3.0)
    val science = Grade(letter = "F", points = 9.0, credits = 3.0)
    val physics = Grade(letter = "F", points = 9.0, credits = 3.0)
    val chemistry = Grade(letter = "F", points = 9.0, credits = 3.0)

    val dom = StudentAthlete(firstName = "Dom", lastName = "Grady")
    dom.recordGrade(math)
    dom.recordGrade(science)
    dom.recordGrade(physics)
    println(dom.isEligible) // > true
    dom.recordGrade(chemistry)
    println(dom.isEligible) // > false

    for (day in DayOfTheWeek.values()) {
        println("Day ${day.ordinal + 1}: ${day.name}")
    }

    val dayIndex = 0
    val dayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("Day at $dayIndex is $dayAtIndex")

    var uni = Unicycle()

    println(uni.peddling)

    uni.accelerate()
    println(uni.peddling)

    uni.stop()
    println(uni.peddling)

    var garfield = Cat("Mammal", "Tabby", 9)
    var odie = Dog("Mammal", "Beagle")

    garfield.makeNoise()
    odie.makeNoise()

    val names: List<String> = listOf("Bob", "Carol", "Ted", "Alice")
    println("Names: $names")
    val firstName = names.first()
    println(firstName)

    val map = mapOf(
        Pair("one", 1),
        Pair("two", "II"),
        Pair("three", 3.0f)
    )

    val one = map["one"]
    println(one)

    val valuesForKeysWithE = map.keys
        .filter { it.contains("e") }
        .map { "Value for $it: ${map[it]}" }
    println("Values for keys with E: $valuesForKeysWithE")

    println("Names: ${names.toBulletedList()}")


}
fun printMyName(name: String = "Bugs Bunny") {
    println("My name is $name.")
}

fun fullName(firstName: String = "Bugs", lastName: String = "Bunny"): String
{
    return firstName + " " +  lastName
}

// 1
open class Person(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
    fun phonebookName(person: Person): String {
        return "${person.lastName}, ${person.firstName}"
    }
}

class SimplePerson(var name: String)
{
    fun set(n: String)
    {
        name = n
    }
}

class Grade(
    val letter: String,
    val points: Double,
    val credits: Double
)

// 2
open class Student(
    firstName: String,
    lastName: String,
    var grades: MutableList<Grade> = mutableListOf<Grade>()
) : Person(firstName, lastName) {

    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
    fun afterClassActivity(student: Student): String {
        return "Goes home!"
    }

}

open class BandMember(
    firstName: String,
    lastName: String
) : Student(firstName, lastName) {
    open val minimumPracticeTime: Int
        get() { return  2 }
    fun afterClassActivity(student: BandMember): String {
        return "Goes to practice!"
    }
}

class OboePlayer(
    firstName: String,
    lastName: String
): BandMember(firstName, lastName) {
    // This is an example of an override, will be covered soon.
    override val minimumPracticeTime: Int =
        super.minimumPracticeTime * 2
}

class StudentAthlete(
    firstName: String,
    lastName: String
): Student(firstName, lastName) {
    val failedClasses = mutableListOf<Grade>()

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)

        if (grade.letter == "F") {
            failedClasses.add(grade)
        }
    }

    val isEligible: Boolean
        get() = failedClasses.size < 3
}

interface Vehicle {
    fun accelerate()
    fun stop()
}


class Unicycle: Vehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
    }

    override fun stop() {
        peddling = false
    }
}


open class Animal(
    type: String
)  {

    open fun makeNoise()
    {
        println("Animal noise")
    }
}

open class Dog(type: String, breed: String)
    : Animal(type)
{
    override fun makeNoise()
    {
        println("Woof, Woof, Woof")
    }
}

open class Cat(type: String, breed: String, lives: Int)
    : Animal(type)
{
    override fun makeNoise()
    {
        println("Meow")
    }
}

interface List<out E> : Collection<E>






