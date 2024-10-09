package faang.school.achievement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowerEvent implements Event {

    @NotNull
    private long followerId;
    @NotNull
    private long followeeId;
    @NotNull
    private LocalDateTime subscriptionDateTime;

    @Override
    public long getAchievementHolderId() {
        return followeeId;
    }
}