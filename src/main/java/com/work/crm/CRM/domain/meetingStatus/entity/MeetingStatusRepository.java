package com.work.crm.CRM.domain.meetingStatus.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MeetingStatusRepository {
    List<MeetingStatus> findAll();
    Page<MeetingStatus> findAll(Pageable page);
    Optional<MeetingStatus> findById(Integer i);
    boolean existsById(Long id);
    MeetingStatus save(MeetingStatus entity);
//    List<MeetingStatus> saveAll(List<MeetingStatus> entities);
}
