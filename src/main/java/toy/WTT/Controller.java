package toy.WTT;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final Service service;

    @GetMapping("/")
    public String mainPage(){
        return "this is main page123";
    }

    @PostMapping("/add")
    public void add(@RequestBody String time){
        service.add(time);
    }
}
