package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class ExcelReport implements IReport {

	public ExcelReport() {
		System.out.println("ExcelReport::Constructor");
	}

	@Override
	public void generateReport() {
		System.out.println("Excel Report Generated...");
	}

}
