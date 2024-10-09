package faang.school.achievement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentEvent implements Event {

    @NotNull
    private Long commentId;
    @NotNull
    private Long authorId;
    @NotNull
    private String content;
    @NotNull
    private Long postId;

    @Override
    public long getAchievementHolderId(){
        return authorId;
    }
}
