/*
Desafio — Primeiros passos em Kotlin
3 / 3 — Taxa de Imposto de Renda

Há um país denominado Lollipop, todos os habitantes ficam felizes
em pagar seus impostos, pois sabem que nele não existem políticos
corruptos e os recursos arrecadados são utilizados em benefício
da população, sem qualquer desvio. A moeda deste país é o Loli,
cujo símbolo é o R$. Você terá o desafio de ler um valor com duas
casas decimais, equivalente ao salário de uma pessoa de Loli.
Em seguida, calcule e mostre o valor que esta pessoa deve pagar
de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de
8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de
R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido,
a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda,
com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000,
deverá ser impressa a mensagem "Isento".
*/


fun main() {

    val salario: Float = readLine()!!.toFloat()
    val i: Float

    if (salario in 0.0..2000.00) {
        println("Isento")

    } else if (salario in 2000.01..3000.00) {
        i = ((salario - 2000.00) * 0.08).toFloat()
        println("R$ ${i.format(2)}")

    } else if (salario in 3000.01..4500.00) {
        i = ((salario - 3000.00) * 0.18 + (1000.00 * 0.08)).toFloat()
        println("R$ ${i.format(2)}")

    } else if (salario > 4500.00) {
        i = ((salario - 4500.00) * 0.28 + (1000.00 * 0.08 + (1500.00 * 0.18))).toFloat()
        println("R$ ${i.format(2)}")
    }
}

fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
