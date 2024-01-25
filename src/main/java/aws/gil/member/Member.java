package aws.gil.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.bind.annotation.GetMapping;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_info")
public class Member {

    @Id
    @Column(name = "id", nullable = false)
    public String memberId;

    @NotNull
    @Column(name = "user_location")
    public String spot;


}
