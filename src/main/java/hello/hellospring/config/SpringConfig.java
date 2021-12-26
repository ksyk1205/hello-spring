package hello.hellospring.config;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*
    DataSource dataSource;
    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
    private EntityManager em;
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    public final  MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    /*
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);

    }*/
}
