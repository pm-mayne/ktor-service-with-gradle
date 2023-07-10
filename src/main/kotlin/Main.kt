package perso.pmmayne

import io.ktor.server.netty.*
import org.koin.core.context.GlobalContext.startKoin
import org.koin.ksp.generated.module
import perso.pmmayne.modules.DuplicateRoute

fun main(args: Array<String>) {
    startKoin {
        modules(DuplicateRoute().module)
    }
    EngineMain.main(args)
}