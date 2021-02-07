package com.work.crm.CRM.ui.domain.source.meeting.entity;

import java.util.List;
import java.util.Optional;

public interface MeetingRepository {
    List<Meeting> findAll();
    Optional<Meeting> findById(Integer i);
    boolean existsById(Integer id);
    Meeting save(Meeting entity);
//    List<Meeting> saveAll(List<Meeting> entities);
}
