package com.dataentry.uploadcsv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dataentry.uploadcsv.model.Study;

public interface StudyRepository extends JpaRepository<Study, Integer> {
}
