package grandcircus.labs.APILab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeekController {
	
	@Autowired
	private ApiServiceGeek apiService;
	
	@RequestMapping("/")
	public ModelAndView showTinyList() {
		
	String tlist = apiService.get___();
	return new ModelAndView("tinyList", "tinylist", tlist);
	}
	
	@RequestMapping("/complete")
	public ModelAndView showCompleteList() {
		
	String clist = apiService.get___();
	return new ModelAndView("completeList", "completelist", clist);
	}


}
