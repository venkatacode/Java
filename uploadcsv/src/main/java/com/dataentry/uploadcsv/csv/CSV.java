package com.dataentry.uploadcsv.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;
import com.dataentry.uploadcsv.model.Study;

public class CSV {

	public static String Type = "text/csv";
	public static String[] HEADERs = { "id", "fname", "lname", "title", "description", "published" };

	public static boolean hasCSV(MultipartFile file) {
		if (!Type.equals(file.getContentType())) {
			return false;
		}
		return true;
	}

	public static List<Study> CSVtoStudy(InputStream is) {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
			List<Study> study = new ArrayList<Study>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for (CSVRecord csvRecord : csvRecords) {
				Study stud = new Study(Integer.parseInt(csvRecord.get("id")), csvRecord.get("fname"),
						csvRecord.get("lname"), csvRecord.get("title"), csvRecord.get("description"),
						Boolean.parseBoolean(csvRecord.get("published")));
				study.add(stud);
			}
			return study;
		} catch (IOException e) {
			throw new RuntimeException("");
		}

	}
}
