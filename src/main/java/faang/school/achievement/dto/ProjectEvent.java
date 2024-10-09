package faang.school.achievement.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectEvent implements Event {

    Long authorId;
    Long projectId;

    @Override
    public long getAchievementHolderId() {
        return authorId;
    }
}

