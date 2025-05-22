package com.dataentry.uploadcsv.uploadcsvservice;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.dataentry.uploadcsv.csv.CSV;
import com.dataentry.uploadcsv.model.Study;
import com.dataentry.uploadcsv.repository.StudyRepository;

@Service
public class CsvService {

	@Autowired
	StudyRepository repo;

	public void save(MultipartFile file) {
		try {
			List<Study> study = CSV.CSVtoStudy(file.getInputStream());
			repo.saveAll(study);
		} catch (IOException e) {
			throw new RuntimeException("failed");
		}

	}

	public List<Study> getAlldata() {
		return repo.findAll();

	}
}
