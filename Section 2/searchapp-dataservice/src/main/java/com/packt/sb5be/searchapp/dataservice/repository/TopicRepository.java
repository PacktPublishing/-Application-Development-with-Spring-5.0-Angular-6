package com.packt.sb5be.searchapp.dataservice.repository;

import com.packt.sb5be.searchapp.dataservice.dbmodel.orm.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long>, ExtendedRepository<Topic, Long> {
    List<Topic> findByDescriptionLikeIgnoreCase(String description);
}
