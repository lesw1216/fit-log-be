package lesw.fit_log.api.domain.record;

import lesw.fit_log.api.domain.record.dto.RecordSaveDTO;
import lesw.fit_log.api.response.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class RecordController {

    @PostMapping("/record")
    public ResponseEntity<RestResponse<?>> postRecord(@RequestBody RecordSaveDTO records) {
        log.info("POST record");
        log.info(records.toString());
        return null;
    }
}