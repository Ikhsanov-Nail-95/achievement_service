package faang.school.achievement.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import faang.school.achievement.dto.Event;
import faang.school.achievement.exception.MessageProcessingException;
import faang.school.achievement.handler.EventHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.io.IOException;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractListener<T extends Event> implements MessageListener {

    protected final ObjectMapper objectMapper;
    private final List<EventHandler<T>> eventHandlers;

    protected abstract T listenEvent(Message message) throws IOException;

    @Override
    public void onMessage(Message message, byte[] pattern) {
        T event;
        try {
            event = listenEvent(message);
        } catch (IOException e) {
            log.warn("Unsuccessful mapping", e);
            throw new MessageProcessingException("Error processing message", e);
        }

        log.info(eventHandlers.toString());
        eventHandlers.forEach(handler -> handler.handleEvent(event));
        log.info("Data successfully passed to AchievementService!");
    }
}