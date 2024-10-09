package faang.school.achievement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MentorshipEvent implements Event {

    @NotNull
    private long mentorId;
    @NotNull
    private long menteeId;

    @Override
    public long getAchievementHolderId() {
        return menteeId;
    }
}
