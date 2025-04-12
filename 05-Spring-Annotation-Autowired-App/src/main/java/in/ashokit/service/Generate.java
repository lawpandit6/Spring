package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Generate {

	@Autowired
	public IReport report;
	
	public void generate() {
		report.generateReport();
	}
}
