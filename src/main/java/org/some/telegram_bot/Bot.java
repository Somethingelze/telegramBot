package org.some.telegram_bot;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.some.telegram_bot.config.TelegramProperties;
import org.some.telegram_bot.service.UpdateDispatcher;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public final class Bot extends TelegramWebhookBot {

    TelegramProperties properties;
    UpdateDispatcher dispatcher;

    public Bot(TelegramProperties properties, UpdateDispatcher dispatcher) {
        super(properties.getToken());
        this.properties = properties;
        this.dispatcher = dispatcher;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return dispatcher.distribute(update);
    }

    @Override
    public String getBotPath() {
        return "";
    }

    @Override
    public String getBotUsername() {
        return "";
    }


}
