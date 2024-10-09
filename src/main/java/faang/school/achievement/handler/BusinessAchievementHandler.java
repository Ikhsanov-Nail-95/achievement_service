package faang.school.achievement.handler;

import faang.school.achievement.dto.ProjectEvent;
import faang.school.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BusinessAchievementHandler extends AbstractEventHandler<ProjectEvent> {

    @Value("${achievements.title.businessman}")
    private String businessman;

    public BusinessAchievementHandler(AchievementService achievementService) {
        super(achievementService);
    }

    @Override
    protected String getAchievementName() {
        return businessman;
    }

}