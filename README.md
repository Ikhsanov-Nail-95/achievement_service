# Использованные технологии

* [Spring Boot](https://spring.io/projects/spring-boot) – как основной фрэймворк
* [PostgreSQL](https://www.postgresql.org/) – как основная реляционная база данных
* [Redis](https://redis.io/) – как кэш и очередь сообщений через pub/sub
* [testcontainers](https://testcontainers.com/) – для изолированного тестирования с базой данных
* [Liquibase](https://www.liquibase.org/) – для ведения миграций схемы БД
* [Gradle](https://gradle.org/) – как система сборки приложения
* [Lombok](https://projectlombok.org/) – для удобной работы с POJO классами
* [MapStruct](https://mapstruct.org/) – для удобного маппинга между POJO классами

# Моя работа
[Общий интерфейс](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/EventHandler.java), [абстрактный класс](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/AbstractEventHandler.java) для достижений определённого типа и [обработчик достижения](https://github.com/Ikhsanov-Nail-95/achievement_service/blob/main/src/main/java/faang/school/achievement/handler/AllLoveAchievementHandler.java) работают в совокупности и предполагают просто добавление новых достижений и обновление функционала.
