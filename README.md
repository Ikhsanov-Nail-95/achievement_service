## Service Template

Стандартный шаблон проекта на SpringBoot

## Использованные технологии

* [Spring Boot](https://spring.io/projects/spring-boot) – как основной фрэймворк
* [PostgreSQL](https://www.postgresql.org/) – как основная реляционная база данных
* [Redis](https://redis.io/) – как кэш и очередь сообщений через pub/sub
* [testcontainers](https://testcontainers.com/) – для изолированного тестирования с базой данных
* [Liquibase](https://www.liquibase.org/) – для ведения миграций схемы БД
* [Gradle](https://gradle.org/) – как система сборки приложения
* [Lombok](https://projectlombok.org/) – для удобной работы с POJO классами
* [MapStruct](https://mapstruct.org/) – для удобного маппинга между POJO классами

## База данных

* База поднимается в отдельном сервисе [infra](../infra)
* Redis поднимается в единственном инстансе тоже в [infra](../infra)
* Liquibase сам накатывает нужные миграции на голый PostgreSql при старте приложения
* В тестах используется [testcontainers](https://testcontainers.com/), в котором тоже запускается отдельный инстанс
  postgres
* В коде продемонстрирована работа как с JPA (Hibernate)

## Achievement Service - работа с достижениями
[Общий интерфейс](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/EventHandler.java), [абстрактный класс](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/AbstractEventHandler.java) для достижений определённого типа и [обработчик достижения](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/AllLoveAchievementHandler.java) работают в совокупности и предполагают просто добавление новых достижений и обновление функционала.
