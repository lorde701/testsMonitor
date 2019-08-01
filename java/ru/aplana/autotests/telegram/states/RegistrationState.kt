package ru.aplana.autotests.telegram.states

import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Message
import ru.aplana.autotests.telegram.UserContext

class RegistrationState(userContext: UserContext, chatId: Long?, send: (SendMessage, Boolean) -> Unit)
    : UserState(userContext, chatId, send) {

    override fun onMessageReceived(message: Message) {
        val messageText = message.text

        if (messageText == "Назад") {
            userContext.changeState(StartState(userContext, chatId, send))
        } else {
            //todo Добавление названия проекта в базу

            with(userContext) {
                if (projects == null)
                    projects = mutableListOf()
                projects!!.add(messageText)
                sendMessage("проект <$messageText> добавлен в базу (на самом деле нет)", true)
            }
        }

    }

    override fun showFirst() {
        val buttons = mutableListOf("Назад")
        showButtons(buttons, "Введите название нового проекта или вернитесь в предыдущее меню", false)
    }

}