// PMDM CODE CHALLENGE #01 - KOTLIN RESCUE
// Completa todas las partes marcadas con TODO().

fun main() {
    println("=== PMDM KOTLIN CHALLENGE ===")
    println("Puntuación: ${calcularPuntuacion(10, 3)}")
    println("Rango: ${obtenerRango(750)}")

    println("Múltiplos de 3:")
    mostrarMultiplos()

    val puntuaciones = mutableListOf(300, 850, 120, 950, 700)
    println("Puntuaciones altas: ${contarPuntuacionesAltas(puntuaciones)}")

    val jugador = Jugador("Mario", 3, 850)
    jugador.mostrarInfo()
    println("¿Sigue vivo? ${jugador.estaVivo()}")

    // BONUS: descomenta cuando hayas creado mejorPuntuacion()
    // println("Mejor puntuación: ${mejorPuntuacion(puntuaciones)}")
}

// MISIÓN 1
// Cada enemigo = 100 puntos. Cada vida restante = 50 puntos.
// calcularPuntuacion(10, 3) debe devolver 1150.
fun calcularPuntuacion(enemigos: Int, vidas: Int): Int {
    TODO("Completa la misión 1")
}

// MISIÓN 2
// 0..499 -> Principiante
// 500..999 -> Avanzado
// 1000 o más -> Experto
// Utiliza when.
fun obtenerRango(puntuacion: Int): String {
    TODO("Completa la misión 2")
}

// MISIÓN 3
// Muestra los múltiplos de 3 entre 1 y 30.
fun mostrarMultiplos() {
    TODO("Completa la misión 3")
}

// MISIÓN 4
// Devuelve cuántas puntuaciones son >= 700.
fun contarPuntuacionesAltas(puntuaciones: MutableList<Int>): Int {
    TODO("Completa la misión 4")
}

// MISIÓN 5
// mostrarInfo(): Mario - Vidas: 3 - Puntuación: 850
// estaVivo(): true si vidas > 0.
class Jugador(
    val nombre: String,
    var vidas: Int,
    var puntuacion: Int
) {
    fun mostrarInfo() {
        TODO("Completa mostrarInfo")
    }

    fun estaVivo(): Boolean {
        TODO("Completa estaVivo")
    }
}

// BONUS
// Crea:
// fun mejorPuntuacion(puntuaciones: List<Int>): Int
// Debe devolver la puntuación más alta sin utilizar maxOrNull().
