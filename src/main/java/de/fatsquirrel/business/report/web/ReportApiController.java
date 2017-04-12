package de.fatsquirrel.business.report.web;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.fatsquirrel.business.report.ReportService;
import de.fatsquirrel.business.report.persistence.entity.Report;

@RestController()
@RequestMapping("/api")
public class ReportApiController {

	private final ReportService reportService;

	public ReportApiController(ReportService reportService) {
		this.reportService = reportService;
	}

	@GetMapping("/reports")
	public List<Report> findAll() {
		return reportService.findAll();
	}

	@GetMapping("/reports/{id}")
	public Report findById(@PathVariable("id") UUID id) {
		return reportService.findById(id);
	}

	@PostMapping("/reports")
	public Report create(@RequestBody Report report) {
		return reportService.save(report);
	}

	@PutMapping("/reports")
	public Report update(@RequestBody Report report) {
		return reportService.save(report);
	}

	@DeleteMapping("/reports/{id}")
	public boolean deleteById(@PathVariable UUID id) {
		return reportService.delete(id);
	}

}
