package toy.WTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.WTT.entity.WorkTime;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface WorkTimeRepository extends JpaRepository<WorkTime, Long> {
    Optional<WorkTime> findByUserIdAndStartDate(String userId, LocalDate startDate);
    List<WorkTime> findAllByUserId(String userId);
}
