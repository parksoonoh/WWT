package toy.WTT.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@jakarta.persistence.Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class WorkTime {
    @Id @GeneratedValue
    private Long id;

    private LocalTime date;
    private String userId;

    public WorkTime(LocalTime date, String userId) {
        this.date = date;
        this.userId = userId;
    }
}
