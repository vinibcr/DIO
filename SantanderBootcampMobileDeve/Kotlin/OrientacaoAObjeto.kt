class pessoa(){

var nome: String = "Ronaldo"
var cpf : String = "42637749816"
var endereco : String = "Rua X"

fun pessoaInfo() = "$nome $cpf $endereco"
}


fun main() {
    val Ronaldo = pessoa()
 
    println("seu nome e cpf e endereço são " + Ronaldo.pessoaInfo())
}
