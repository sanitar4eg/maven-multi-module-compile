package test;

import com.test.Book;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BsApp {

	public static void main(String[] args) throws Exception {
		new SpringApplication(BsApp.class).run(args);
	}

	@PostConstruct
	public void setUp() {
		log.info("Book for BS: {}", new Book(1L, "Book"));
	}

}
