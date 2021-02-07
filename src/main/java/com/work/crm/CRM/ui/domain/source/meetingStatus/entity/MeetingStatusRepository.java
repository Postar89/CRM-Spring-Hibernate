package com.work.crm.CRM.ui.domain.source.meetingStatus.entity;

import java.util.List;
import java.util.Optional;

public interface MeetingStatusRepository {
    List<MeetingStatus> findAll();
    Optional<MeetingStatus> findById(Integer i);
    boolean existsById(Integer id);
    MeetingStatus save(MeetingStatus entity);
//    List<MeetingStatus> saveAll(List<MeetingStatus> entities);
}
