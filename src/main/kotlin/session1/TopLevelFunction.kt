package session1

/** The top level function in Kotlin
 * In Kotlin you can use the function as the top level member of a kt file
 * As you remember when you create a .java file in Java you had to create a class as
 * the top level structure of that file.
 * */

fun topLevelFunction(args: Array<String>){
    //When you are using Strings in Kotlin, indeed you are using java.lang.string under the hood.
    //So you will see 'Hello, null!' in the console.
    println("Hello, ${args.getOrNull(0)}!")
}

fun main(){
    topLevelFunction(emptyArray());
}