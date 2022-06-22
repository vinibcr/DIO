fun main() {
    val salarios = doubleArrayOf(1000.00, 2250.0, 4000.0 )
    
    for (salrio in salarios){
        println(salarios)
    }

    println(" Maior salario : ${salarios.average()}")
    
    val salariosMaiorQue2500 = salarios.filter {it> 2000.0}
    salariosMaiorQue2500.forEach {println(it)}

    
    
    
}
