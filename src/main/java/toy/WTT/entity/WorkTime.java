package toy.WTT.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@jakarta.persistence.Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class WorkTime {
    @Id @GeneratedValue
    private Long id;

    private LocalTime workTime;
    private String userId;
    private LocalDateTime startDate;

    public WorkTime(LocalTime workTime, String userId, LocalDateTime startDate) {
        this.workTime = workTime;
        this.userId = userId;
        this.startDate = startDate;
    }
}
