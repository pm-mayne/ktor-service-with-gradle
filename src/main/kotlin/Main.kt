package perso.pmmayne

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    routing {
        post("/api/remove-duplicated") {
            call.respondText("Hello, world!")
        }
    }
}