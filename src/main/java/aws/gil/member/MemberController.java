package aws.gil.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gil")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/place")
    public ResponseEntity<Member> place(@RequestBody Member memberDto){
        Member member = memberService.save(memberDto);
        return  new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Member>> getList(@RequestBody Member memberDto){
        List<Member> members = memberService.getAll(memberDto);
        if(members==null||members.isEmpty()) return new ResponseEntity<>(members, HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(members, HttpStatus.OK);
    }





}
