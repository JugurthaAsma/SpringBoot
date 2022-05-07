package com.example.demo.repository;

import com.example.demo.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface EventRepository extends CrudRepository<Event, UUID> {

}
