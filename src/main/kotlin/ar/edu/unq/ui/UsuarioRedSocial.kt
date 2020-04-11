package ar.edu.unq.ui

import java.time.LocalDate
import kotlin.text.dropWhile as drop

class UsuarioRedSocial (val nombreCompleto: String, val apodo: String, val email: String, val fechaNac: LocalDate) {

    // getters
    fun nombreUsuario() = nombreCompleto
    fun apodoUsuario() = apodo
    fun emailUsuario() = email
    fun fechaNacUsuario() = fechaNac

    // retorna la edad actual del usuario
    fun edadUsuario() = LocalDate.now().year - fechaNac.year - this.ajusteEdad()

    //ajustes para el calculo de la edad
    fun ajusteEdad() = when {
        LocalDate.now().monthValue < fechaNac.monthValue -> 0
        LocalDate.now().dayOfMonth > fechaNac.dayOfMonth -> 0
        else -> 1
    }

    // retorna true si el email del usuario es del proveedor Gmail
    fun esMailGmail(): Boolean {
        val indexDominio = email.indexOf(char = '@')
        return email.drop(indexDominio) == "@gmail.com"
    }

}