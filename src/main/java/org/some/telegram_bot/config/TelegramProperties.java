package org.some.telegram_bot.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bot")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramConfiguration {
    String token;
    String name;
    String url;

}
