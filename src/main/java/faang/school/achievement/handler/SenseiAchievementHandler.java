package faang.school.achievement.handler;

import faang.school.achievement.dto.MentorshipEvent;
import faang.school.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SenseiAchievementHandler extends AbstractEventHandler<MentorshipEvent> {

    @Value("${achievements.title.sensei}")
    private String achievementName;

    public SenseiAchievementHandler(AchievementService achievementService){
        super(achievementService);
    }

    @Override
    protected String getAchievementName(){
        return achievementName;
    }

}