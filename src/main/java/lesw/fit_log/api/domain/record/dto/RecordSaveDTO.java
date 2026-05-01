package lesw.fit_log.api.domain.record.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class RecordSaveDTO {
    private List<Integer> workoutIds;
}