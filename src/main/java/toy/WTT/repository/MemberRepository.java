package toy.WTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.WTT.entity.Member;

@org.springframework.stereotype.Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}
