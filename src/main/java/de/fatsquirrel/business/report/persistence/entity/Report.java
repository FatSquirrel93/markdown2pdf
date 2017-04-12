package de.fatsquirrel.business.report.persistence.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import de.fatsquirrel.configuration.persistence.Schema;

@Entity
@Table(name = Schema.REPORT_TABLE)
public class Report {

	@Id
	@GeneratedValue
	@Column
	@Type(type = "org.hibernate.type.PostgresUUIDType")
	private UUID id;

	@Column
	private String description;

	@Type(type = "text")
	@Column
	private String markdown;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMarkdown() {
		return markdown;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

}
