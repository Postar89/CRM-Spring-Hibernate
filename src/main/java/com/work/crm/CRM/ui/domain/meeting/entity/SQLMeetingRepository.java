package com.work.crm.CRM.ui.domain.meeting.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLMeetingRepository extends MeetingRepository, JpaRepository<Meeting, Integer> {

}
