package toy.WTT;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import toy.WTT.entity.Member;
import toy.WTT.entity.WorkTime;
import toy.WTT.repository.MemberRepository;
import toy.WTT.repository.WorkTimeRepository;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Slf4j
public class Service {
    private final WorkTimeRepository workTimeRepository;
    private final MemberRepository memberRepository;

    public void add(String time, String id){
        time = time.replace("\"","");
        log.info("insert " + time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS");
        workTimeRepository.save(new WorkTime(LocalTime.parse(time, formatter), id));
    }

    public String login(String id){
        Optional<Member> findMemberOpt = memberRepository.findById(id);
        if (findMemberOpt.isEmpty()){
            return "false";
        }
        return "true";
    }
}
