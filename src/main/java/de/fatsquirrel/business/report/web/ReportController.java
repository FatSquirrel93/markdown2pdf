package de.fatsquirrel.business.report.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

	@GetMapping("/reports")
	public ModelAndView reportView() {
		return new ModelAndView("report");
	}

}
