package backpackBridge;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@Resource
	private AdminRepository repository;

    @RequestMapping("/showAdmins")
    public String admins(Model model) {
    	model.addAttribute("admins", repository.findAll());
        return "admins";
    }

    @RequestMapping("/showAdmin")
    public String admin(@RequestParam(value="id") String id, Model model) {
        model.addAttribute("admin", repository.findOne(id));
        return "admin";
    }
}