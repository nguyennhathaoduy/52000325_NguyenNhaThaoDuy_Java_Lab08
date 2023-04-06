package HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String index() 
	{
		return "index";
	}

	@GetMapping("/contact")
	public String contactGet() 
	{
		return "contact";
	}

	@PostMapping("/contact")
	public String contactPost(@RequestParam("username") String username, Model model) 
	{
		model.addAttribute("model", username);
		return "detailContact";
	}

	@GetMapping("/about")
	@ResponseBody
	public String about() 
	{
		return "About this site";
	}

}