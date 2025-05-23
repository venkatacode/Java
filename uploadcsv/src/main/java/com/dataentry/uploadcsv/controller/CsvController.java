package com.dataentry.uploadcsv.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dataentry.uploadcsv.Responsemessage.Responsemessage;
import com.dataentry.uploadcsv.csv.CSV;
import com.dataentry.uploadcsv.model.Study;
import com.dataentry.uploadcsv.model.StudyDtoNames;
import com.dataentry.uploadcsv.repository.StudyRepository;
import com.dataentry.uploadcsv.uploadcsvservice.CsvService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "/event")
public class CsvController {

	
	
	@Autowired
	private StudyRepository repo;
	
	@Autowired
	private CsvService cService;

	@PostMapping("/upload")
	public ResponseEntity<Responsemessage> uploadfile(MultipartFile file) {
		String message = "";
		if (CSV.hasCSV(file)) {
			cService.save(file);
			try {
				message = "uploaded";
				return ResponseEntity.status(HttpStatus.OK).body(new Responsemessage(message));
			} catch (Exception e) {
				message = "failed";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new Responsemessage(message));
			}
		}
		message = "error";
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Responsemessage(message));
	}

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/getdata")
	public ResponseEntity<Object> getdata(MultipartFile file) {
		String queryString = "SELECT s FROM Study s";
		Query query = entityManager.createQuery(queryString);
		List<Study> result = query.getResultList();
		ArrayList<StudyDtoNames> sdnList = new ArrayList<>();
		for (Study sd : result) {
			StudyDtoNames sdn = new StudyDtoNames();
			sdn.setFname(sd.getFname());
			sdn.setLname(sd.getLname());
			sdnList.add(sdn);
		}
		if (sdnList.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No data");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(sdnList);
		}
	}

	private final JdbcTemplate jdbcTemplate;

	public CsvController(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@GetMapping("/details_data")
	public ResponseEntity<List<Map<String, Object>>> getStudyData() {
//		String queryString = "SELECT firstname, lastname FROM details_data";
		String queryString="SELECT firstname,lastname,title FROM details_data";
		List<Map<String, Object>> results = jdbcTemplate.queryForList(queryString);
		return ResponseEntity.status(HttpStatus.OK).body(results);
	}

	@GetMapping("/getIDs")
	public ResponseEntity<Object> getID() {
		return ResponseEntity.status(HttpStatus.OK).body(cService.getAlldata());
	}
	

}










//	@GetMapping("/getdata")
//	public ResponseEntity<Resource> save() throws IOException {
//		String queryString = "SELECT s.fname,s.lname FROM Study s";
//		Query query = entityManager.createQuery(queryString);
////		InputStreamResource file=new InputStreamResource(original);
//		
//
//		return body;

//	}

// return sdnList;
//List<Object[]> studydtoList = new ArrayList<Object[]>();
// LinkedHashMap<String, LinkedHashMap<String, String>> opp = new
// LinkedHashMap<>();
// Integer i = 0;
//for (Object[] study : result) {
//	LinkedHashMap<String, String> op = new LinkedHashMap();
//	op.put("lname", study[0].toString());
//	op.put("fname", study[1].toString());
//	opp.put(i.toString(), op);
//	i++;
//}
//return result;