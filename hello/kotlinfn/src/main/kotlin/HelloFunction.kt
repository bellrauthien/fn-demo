
package com.fn.example

fun hello(input: String) = when {
    input.isEmpty() -> ("Hola, world!")
        else -> ("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, ${input}")
}
