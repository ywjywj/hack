package aws.gil.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public Member save(Member memberDto) {
        memberRepository.save(memberDto);
        return memberDto;
    }

    public List<Member> getAll(Member memberDto) {
         List<Member> member = memberRepository.findAll();
         if(member.isEmpty()) return null;
         return member;
    }
}
