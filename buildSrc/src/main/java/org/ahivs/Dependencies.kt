package org.ahivs

object Tools {
    object Detekt {
        private const val version = "1.18.0" // https://github.com/arturbosch/detekt
        const val cli = "io.gitlab.arturbosch.detekt:detekt-cli:$version"
        const val formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:$version"
    }
}
