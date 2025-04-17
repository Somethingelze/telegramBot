package org.some.telegram_bot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@Table(name = "bot_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractEntity {

    @Column(name = "chat_id", unique = true,nullable = false)
    Long chatId;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "registered_at", nullable = false)
    LocalDateTime registeredAt;

    @OneToMany
    Set<Notification> notifications;
}
