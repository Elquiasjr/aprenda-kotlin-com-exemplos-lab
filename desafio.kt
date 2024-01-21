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
    conteudos.add(ConteudoEducacional("Introducao ao C#", 30))
    conteudos.add(ConteudoEducacional("Funcoes com C#", 40))
    conteudos.add(ConteudoEducacional("Exceptions com C#", 50))
    
    val cSharp = Formacao("Curso Completo de C#", conteudos, Nivel.INTERMEDIARIO)
    
    var alunos = mutableListOf<Usuario>()
    alunos.add(Usuario("Alexandre"))
    alunos.add(Usuario("Felipe"))
    alunos.add(Usuario("Gabriel"))
    alunos.add(Usuario("Jonathan"))
    
    println("Alunos: $alunos")
    
    cSharp.matricular(*alunos.toTypedArray())
    
    println("Informacoes da formacao:\n$cSharp")
    println("Alunos cadastrados na formacao: ${cSharp.inscritos}")
    
    println()
    
    val conteudos1 = mutableListOf<ConteudoEducacional>()
    conteudos1.add(ConteudoEducacional("Introducao a Probabilidade", 30))
    conteudos1.add(ConteudoEducacional("Fundamentos da Estatística", 30))
    
    val probEEstatistica = Formacao("Curso de Probabilidade e Estatística", conteudos1, Nivel.BASICO)
    
    alunos.removeAt(0)
    println("Alunos: $alunos")
    
    probEEstatistica.matricular(*alunos.toTypedArray())
    
    println("Informacoes da formacao:\n$probEEstatistica")
    println("Alunos cadastrados na formacao: ${probEEstatistica.inscritos}")
}
