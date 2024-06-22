package toy.WTT;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Slf4j
public class Service {
    private final Repository repository;

    public void add(String time){
        time = time.replace("\"","");
        log.info("insert " + time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS");
        repository.save(new Entity(LocalTime.parse(time, formatter)));
    }
}
