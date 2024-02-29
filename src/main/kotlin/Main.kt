import java.util.*

fun soma(num1:Float, num2:Float){//tipagem obrigatoria começa com Maisculo
    var soma = num1 + num2
    if (soma >= 6){
        println("aluno aprovado")
    }else{
        println("aluno reprovado")
    }


    println("A soma é $soma")//$ so usa quando for no println
}


fun main(){
    val scanner = Scanner(System.`in`)//obrigatorio
    println("Digite o primeiro numero: ")
    var num1 = scanner.nextFloat()//le o valor e armazena
    println("Digite o segundo numero: ")
    var num2 = scanner.nextFloat()
    return soma(num1, num2)}
