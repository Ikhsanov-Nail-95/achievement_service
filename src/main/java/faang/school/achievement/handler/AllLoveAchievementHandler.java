package faang.school.achievement.handler;

import faang.school.achievement.dto.LikeEvent;
import faang.school.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AllLoveAchievementHandler extends AbstractEventHandler<LikeEvent> {

    @Value("${achievements.title.love_everyone}")
    private String achievementName;

    public AllLoveAchievementHandler(AchievementService achievementService) {
        super(achievementService);
    }

    @Override
    protected String getAchievementName() {
        return achievementName;
    }

}