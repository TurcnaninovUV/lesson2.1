fun main() {
    println("Введите сумму в рублях которую вы хотели перевести!")
    var input = readLine()!!.toInt()
    costing(input * 100)
}

fun costing(transferAmount: Int) {
    var amount = (transferAmount * 0.95).toInt()
    if (transferAmount - amount < 3500) amount = transferAmount - 3500
    print(
        "Сумма перевода с комиссией будет составлять - $amount в копейках" +
                " (${amount / 100} в рублях)"
    )

}
