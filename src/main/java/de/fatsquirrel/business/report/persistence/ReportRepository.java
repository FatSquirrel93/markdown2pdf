package de.fatsquirrel.business.report.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import de.fatsquirrel.business.report.persistence.entity.Report;

public interface ReportRepository extends JpaRepository<Report, UUID> {

	public Report findByDescription(String description);
}
