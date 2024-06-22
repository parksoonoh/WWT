package toy.WTT;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AddForm {
    private String duration;
    private String id;
    private LocalDateTime startDate;
}
