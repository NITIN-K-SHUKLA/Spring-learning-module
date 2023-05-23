package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestApiProject {

	@RequestMapping(value = "/check")
	@ResponseBody
	public String get()
	{
		return "Hello World";
	}
}
