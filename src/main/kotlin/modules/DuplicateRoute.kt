package perso.pmmayne.modules

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.core.annotation.Module
import org.koin.ktor.ext.inject

@Module
class DuplicateRoute {

    fun Application.module() {

        val service by inject<DuplicateService>()
        routing {
            route("/api/remove-duplicated") {
                post {
                    val payload = call.receive(Input::class)
                    call.respond(HttpStatusCode.OK, service.removeDuplicates(payload))
                }
            }
        }
    }
}