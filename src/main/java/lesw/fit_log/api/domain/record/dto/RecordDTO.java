package lesw.fit_log.api.domain.record.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class RecordDTO {
    private Long id;
    private String workoutName;
    private String muscleName;
    private LocalDateTime performDate;
    private LocalDateTime createAt;
}