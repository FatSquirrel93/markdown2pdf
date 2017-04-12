package de.fatsquirrel.business.report;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import de.fatsquirrel.business.report.persistence.ReportRepository;
import de.fatsquirrel.business.report.persistence.entity.Report;

@Service
public class ReportService {

	private final ReportRepository reportRepository;

	public ReportService(ReportRepository reportRepository) {
		Assert.notNull(reportRepository, "ReportRepository must not be null");
		this.reportRepository = reportRepository;
	}

	/**
	 * Return all persisted reports.
	 * 
	 * @return {@link List}<{@link Report}>
	 */
	public List<Report> findAll() {
		return reportRepository.findAll();
	}

	/**
	 * Return report with given id.
	 * 
	 * @param id
	 * @return {@link Report}
	 */
	public Report findById(UUID id) {
		return reportRepository.findOne(id);
	}

	/**
	 * Return report with given description.
	 * 
	 * @param description
	 * @return {@link Report}
	 */
	public Report findByDescription(String description) {
		return reportRepository.findByDescription(description);
	}

	/**
	 * Create/update given report.
	 * 
	 * @param report
	 * @return {@link Report}
	 */
	public Report save(Report report) {
		return reportRepository.save(report);
	}

	/**
	 * Delete report with given id.
	 * 
	 * @param id
	 * @return true if removed, false if not
	 */
	public boolean delete(UUID id) {
		reportRepository.delete(id);

		// check if entity has been removed
		return null == reportRepository.findOne(id);
	}
}
