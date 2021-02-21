package com.work.crm.CRM.domain.meeting.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLMeetingRepository extends MeetingRepository, JpaRepository<Meeting, Integer> {

}
