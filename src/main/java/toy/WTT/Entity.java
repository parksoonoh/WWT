package toy.WTT;

import jakarta.persistence.Column;
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
public class Entity {
    @Id @GeneratedValue
    private Long id;

    private LocalTime date;

    public Entity(LocalTime date) {
        this.date = date;
    }
}
