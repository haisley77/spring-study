package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();
        // command & query 를 구분 !!! -> save 함수는 command 성이므로 리턴 값을 굳이..?
    }

    public Member find(Long id){
        return em.find(Member.class,id);
    }

}
