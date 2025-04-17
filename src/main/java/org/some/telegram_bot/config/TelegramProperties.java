package org.some.telegram_bot.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramProperties {

    @Value("${bot.token}")
    String token;

    @Value("${bot.name}")
    String name;

    @Value("${bot.url}")
    String url;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
