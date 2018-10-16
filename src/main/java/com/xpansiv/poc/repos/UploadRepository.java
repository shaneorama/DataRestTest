package com.xpansiv.poc.repos;

import com.xpansiv.poc.entities.Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface UploadRepository extends JpaRepository<Upload, Integer>, HackedIdRepositoryCustom {

  List<Upload> findAllByCreatedBetween(Date start, Date end);
}
