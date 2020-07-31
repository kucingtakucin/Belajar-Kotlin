/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

val openIssues: MutableSet<String> = mutableSetOf("Adam", "Arthur", "Arthur", "Faizal")
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue = "Mbah Putih"
    val anIssueAlreadyIn = "Adam"

    println(openIssues.toList())
    println("issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")

}
