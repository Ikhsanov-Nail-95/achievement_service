package faang.school.achievement.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikeEvent implements Event {

    @NotNull
    private Long authorLikeId;
    @Positive
    private Long authorPostId;
    @Positive
    private Long postId;
    @Positive
    private Long authorCommentId;
    @Positive
    private Long commentId;
    private LocalDateTime createdAt;

    @Override
    public long getAchievementHolderId() {
        return authorLikeId;
    }
}