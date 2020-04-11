package ar.edu.unq.ui

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class UsuarioRedSocialTest {

    @Test
    fun informacionUsuarioTest() {
        val usuario = UsuarioRedSocial("Agus Tupi", "tupi", "tupi@gmail.com", LocalDate.parse("1982-04-13"))
        assertEquals("Agus Tupi", usuario.nombreUsuario())
        assertEquals("tupi", usuario.apodoUsuario())
        assertEquals("tupi@gmail.com", usuario.emailUsuario())
        assertEquals("1982-04-13", usuario.fechaNacUsuario().toString())
    }

    @Test
    fun edadTest() {
        val usuario = UsuarioRedSocial("Agus Tupi", "tupi", "tupi@gmail.com", LocalDate.parse("1982-04-13"))
        assertEquals(37, usuario.edadUsuario())
    }

    @Test
    fun comprobarMailTest() {
        val usuario = UsuarioRedSocial("Agus Tupi", "tupi", "tupi@gmail.com", LocalDate.parse("1982-04-13"))
        assertTrue(usuario.esMailGmail())
    }
}