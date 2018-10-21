
package com.fn.example

fun hello(input: String) = when {
    input.isEmpty() -> ("Hola desde SF, world!")
        else -> ("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, ${input}")
}
