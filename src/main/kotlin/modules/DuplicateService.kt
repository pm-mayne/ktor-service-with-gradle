package perso.pmmayne.modules

import engine.Engine
import org.koin.core.annotation.Single

interface DuplicateService {
    fun removeDuplicates(input: Input): List<Int>
}

@Single
class DuplicateServiceImpl : DuplicateService {
    override fun removeDuplicates(input: Input): List<Int> {
        return Engine.removeDuplicates(input.input, input.n)
    }

}
