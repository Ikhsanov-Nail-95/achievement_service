package faang.school.achievement.handler;

import faang.school.achievement.dto.CommentEvent;
import faang.school.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExpertAchievementHandler extends AbstractEventHandler<CommentEvent> {

    @Value("${achievements.title.expert}")
    private String achievementName;

    public ExpertAchievementHandler(AchievementService achievementService){
        super(achievementService);
    }

    @Override
    protected String getAchievementName(){
        return achievementName;
    }

}