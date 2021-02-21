package com.work.crm.CRM.domain.meeting.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MeetingRepository {
    List<Meeting> findAll();
    Page<Meeting> findAll(Pageable page);
    Optional<Meeting> findById(Integer i);
    boolean existsById(Integer id);
    Meeting save(Meeting entity);
//    List<Meeting> saveAll(List<Meeting> entities);
}
