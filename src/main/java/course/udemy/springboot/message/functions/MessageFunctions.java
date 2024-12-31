package course.udemy.springboot.message.functions;

import course.udemy.springboot.message.dto.AccountMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
public class MessageFunctions {

    @Bean
    public Function<AccountMessageDto, AccountMessageDto> email() {
        return accountMessageDto -> {
            log.info("Sending email with details : {}", accountMessageDto);
            return accountMessageDto;
        };
    }

    @Bean
    public Function<AccountMessageDto, Long> sms() {
        return accountMessageDto -> {
            log.info("Sending sms with details : {}", accountMessageDto);
            return accountMessageDto.accountNumber();
        };
    }
}
