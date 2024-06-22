package toy.WTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.WTT.entity.WorkTime;

@org.springframework.stereotype.Repository
public interface WorkTimeRepository extends JpaRepository<WorkTime, Long> {
}
