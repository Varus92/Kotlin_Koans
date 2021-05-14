fun foo(name: String, number: Int, toUpperCase: Boolean) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a", number = 42, toUpperCase = false),
        foo("b", number = 1, toUpperCase = false),
        foo("c", toUpperCase = true, number = 42),
        foo(name = "d", number = 2, toUpperCase = true)
)
