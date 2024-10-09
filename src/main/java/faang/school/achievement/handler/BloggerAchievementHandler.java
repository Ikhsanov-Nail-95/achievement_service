package faang.school.achievement.handler;

import faang.school.achievement.dto.FollowerEvent;
import faang.school.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BloggerAchievementHandler extends AbstractEventHandler<FollowerEvent> {

    @Value("${achievements.title.blogger}")
    private String blogger;

    public BloggerAchievementHandler(AchievementService achievementService) {
        super(achievementService);
    }

    @Override
    protected String getAchievementName() {
        return blogger;
    }

}