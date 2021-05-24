import kotlin.random.Random

fun main() {
bookAuthor()
}
fun bookAuthor() {
    var author =" "
    val african = Random.nextBoolean()
    if (african){
        author="Ngugi Wa Thiong'o"
    }
    if (!african){
        author="John Steinbeck"
    }
    println("I will buy this book by $author when I go to town tomorrow.")
println(5/2)
}
