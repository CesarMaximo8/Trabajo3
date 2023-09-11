fun main() {
    var PX1: Int = 4
    var PY1: Int = 3

    var PX2: Int = -3
    var PY2: Int = -2

    var RE: Double

    if (PX1 != PX2) {
        RE = (PY2 - PY1).toDouble() / (PX2 - PX1).toDouble()
        print("El resultado es: $RE")
    } else {
        print("No se puede calcular la pendiente porque PX1 es igual a PX2.")
    }
}