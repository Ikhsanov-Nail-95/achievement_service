package faang.school.achievement.cache;

import faang.school.achievement.model.Achievement;
import faang.school.achievement.repository.AchievementRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AchievementCacheTest {
    @Mock
    AchievementRepository achievementRepository;
    @InjectMocks
    AchievementCache achievementCache;
    HashMap<String, Achievement> map = new HashMap<>();
    Achievement firstAchievement;

    @BeforeEach
    void setUp() {
        firstAchievement = Achievement.builder()
                .title("First Achievement")
                .build();
        map.put(firstAchievement.getTitle(), firstAchievement);
    }

    @Test
    void testInit() {
        Mockito.when(achievementRepository.findAll()).thenReturn(List.of(firstAchievement));
        achievementCache.init();
        Map<String, Achievement> cachedMap = achievementCache.getAchievementsByName();
        assertEquals(map, cachedMap);
    }

}