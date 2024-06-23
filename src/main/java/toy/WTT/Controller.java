package toy.WTT;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import toy.WTT.entity.WorkTime;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final Service service;

    @GetMapping("/")
    public String mainPage(){
        return "this is main page123";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginForm loginForm){
        log.info(loginForm.getUserId());
        return service.login(loginForm.getUserId());
    }

    @PostMapping("/add")
    public void add(@RequestBody AddForm addForm){
        service.add(addForm.getDuration(), addForm.getUserId(), addForm.getStartDate());
    }

    @GetMapping("/worktime")
    public List<WorkTime> workTime(@RequestParam("userId") String userId){
        return service.getWorkTime(userId);
    }
}
