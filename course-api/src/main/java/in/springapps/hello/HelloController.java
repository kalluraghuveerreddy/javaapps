package in.springapps.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayGreeting() {
		return "Hai Welocme to Spring Boot";
	}
	


}
