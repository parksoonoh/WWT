package toy.WTT;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import toy.WTT.entity.Member;
import toy.WTT.entity.WorkTime;
import toy.WTT.repository.MemberRepository;
import toy.WTT.repository.WorkTimeRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Slf4j
public class Service {
    private final WorkTimeRepository workTimeRepository;
    private final MemberRepository memberRepository;

    public void add(String time, String userId, String startDate){

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss.SS");
        LocalTime timeFormatted = LocalTime.parse(time, formatter1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFormatted = LocalDate.parse(startDate, formatter2);

        Optional<WorkTime> findWT = workTimeRepository.findByUserIdAndStartDate(userId, dateFormatted);
        if (findWT.isEmpty()) {
            workTimeRepository.save(new WorkTime(timeFormatted, userId, dateFormatted));
        }
        findWT.get().increaseTime(timeFormatted);
    }

    public String login(String id){
        Optional<Member> findMemberOpt = memberRepository.findById(id);
        if (findMemberOpt.isEmpty()){
            return "false";
        }
        return "true";
    }

    public List<WorkTime> getWorkTime(String userId){
        return workTimeRepository.findAllByUserId(userId);
    }
}
