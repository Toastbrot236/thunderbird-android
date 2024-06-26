package app.k9mail.feature.account.server.validation.ui

import app.k9mail.core.ui.compose.common.mvi.BaseViewModel
import app.k9mail.feature.account.oauth.ui.AccountOAuthContract
import app.k9mail.feature.account.oauth.ui.fake.FakeAccountOAuthViewModel
import app.k9mail.feature.account.server.validation.ui.ServerValidationContract.Effect
import app.k9mail.feature.account.server.validation.ui.ServerValidationContract.Event
import app.k9mail.feature.account.server.validation.ui.ServerValidationContract.State
import app.k9mail.feature.account.server.validation.ui.ServerValidationContract.ViewModel

class FakeServerValidationViewModel(
    override val oAuthViewModel: AccountOAuthContract.ViewModel = FakeAccountOAuthViewModel(),
    override val isIncomingValidation: Boolean = true,
    initialState: State = State(),
) : BaseViewModel<State, Event, Effect>(initialState), ViewModel {

    val events = mutableListOf<Event>()

    override fun event(event: Event) {
        events.add(event)
    }

    fun effect(effect: Effect) {
        emitEffect(effect)
    }
}
