package JavaAdvanced_Lesson16.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import JavaAdvanced_Lesson16.dao.StudentDao;
import JavaAdvanced_Lesson16.dao.impl.StudentDaoImpl;

@Configuration
public class StudentDaoConfig {

    @Bean
    StudentDao studentDao() {
        return new StudentDaoImpl();
    }
}