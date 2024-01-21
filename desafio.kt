// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        for(unique in usuario){
            inscritos.add(unique)
        }
    }
}

fun main() {
    val conteudos = mutableListOf<ConteudoEducacional>()
    conteudos.add(ConteudoEducacional("Introducao ao C#", 30));
    conteudos.add(ConteudoEducacional("Funcoes com C#", 40));
    conteudos.add(ConteudoEducacional("Exceptions com C#", 50));
    
    val cSharp = Formacao("Curso Completo de C#", conteudos, Nivel.INTERMEDIARIO)
    
    var alunos = mutableListOf<Usuario>()
    alunos.add(Usuario("Alexandre"))
    alunos.add(Usuario("Felipe"))
    alunos.add(Usuario("Gabriel"))
    alunos.add(Usuario("Jonathan"))
    
    cSharp.matricular(*alunos.toTypedArray())
    
    println(cSharp)
    println(cSharp.inscritos)
}
