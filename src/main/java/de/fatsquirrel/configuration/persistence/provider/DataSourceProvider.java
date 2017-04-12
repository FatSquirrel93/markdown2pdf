package de.fatsquirrel.configuration.persistence.provider;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import de.fatsquirrel.configuration.persistence.PersistenceConfiguration;

@Configuration
public class DataSourceProvider {

	private PersistenceConfiguration configuration;

	public DataSourceProvider(PersistenceConfiguration configuration) {
		this.configuration = configuration;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(configuration.getDriver());
		dataSource.setUrl(configuration.getUrl());
		dataSource.setUsername(configuration.getUsername());
		dataSource.setPassword(configuration.getPassword());
		return dataSource;
	}
}