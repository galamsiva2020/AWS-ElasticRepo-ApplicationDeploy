package aws.com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
	
	public String hello(){
		return "Sivakrishna got the job in Germany ";
	}	

}
