fun main() {
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (i in 0 until readLine()!!.toInt()) {
        val input: Int? = readLine()?.toInt()

        if (input != null) {
            map.put(i, input)
        }
    }
        for (entry in map) {
        println(entry.key)
        println(entry.value)


            println(map) // {1=x, 2=1.05}
    }
}
// map[1] = chave
// map[2] = valor
// Now map contains something:
//println("map.isEmpty() is ${map.isEmpty()}") // true

