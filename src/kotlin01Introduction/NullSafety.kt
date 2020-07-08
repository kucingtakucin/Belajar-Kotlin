package kotlin01Introduction

fun main() {
    var neverNull: String? = "Ini tidak bisa null kalau tanpa tanda tanya"
    neverNull = null
    var nullable: String? = "Ini masih bisa null"
    nullable = null
    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null
    fun strLength(notNull: String): Int {
        return notNull.length
    }
//    strLength(neverNull)
//    strLength(nullable)
    fun describeString(maybeString: String?): String {
        return if (maybeString != null && maybeString.length > 0) {
            "String of length ${maybeString.length}"
        } else {
            "Empty or null String"
        }
    }
}
