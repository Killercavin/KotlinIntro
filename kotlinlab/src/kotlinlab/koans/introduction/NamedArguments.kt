package kotlinlab.koans.introduction

fun joinOptions(options: Collection<String>) =
    options.joinToString(
        prefix = "[",
        separator = ", ",
        postfix = "]"
    )