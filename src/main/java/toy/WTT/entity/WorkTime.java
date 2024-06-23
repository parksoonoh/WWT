package toy.WTT.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private LocalDate startDate;

    public WorkTime(LocalTime workTime, String userId, LocalDate startDate) {
        this.workTime = workTime;
        this.userId = userId;
        this.startDate = startDate;
    }

    public void increaseTime(LocalTime increaseTime){
        this.workTime = workTime.plusHours(increaseTime.getHour())
                .plusMinutes(increaseTime.getMinute())
                .plusSeconds(increaseTime.getSecond())
                .plusNanos(increaseTime.getNano());
    }
}
