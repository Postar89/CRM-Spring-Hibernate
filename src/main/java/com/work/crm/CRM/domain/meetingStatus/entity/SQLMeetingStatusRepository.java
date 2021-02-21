package com.work.crm.CRM.domain.meetingStatus.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLMeetingStatusRepository extends MeetingStatusRepository, JpaRepository<MeetingStatus,Integer> {

}
