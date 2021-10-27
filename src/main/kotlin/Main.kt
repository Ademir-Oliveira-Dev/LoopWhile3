fun main(args: Array<String>) {
    /*3 - Crie um programa para ler 4 notas e mostrar a média delas.
     */

    print("Digite sua nota: ")
    var nota = readLine()!!.toDouble()
    var somaNota = 0.0
    var contador = 0


    while (contador >= 0 && contador <= 4){
        print("Digite sua nota: ")
        nota = readLine()!!.toDouble()
        contador++
        somaNota += nota

    }
    var mediaNota = somaNota/4
    println("A média das notas é: $mediaNota")
}