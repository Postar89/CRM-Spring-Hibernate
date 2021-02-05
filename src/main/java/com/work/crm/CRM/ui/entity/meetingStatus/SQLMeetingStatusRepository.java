package com.work.crm.CRM.ui.entity.meetingStatus;

import com.work.crm.CRM.ui.entity.rltAddressPerson.RLTAddressPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface SQLMeetingStatusRepository extends MeetingStatusRepository, JpaRepository<MeetingStatus,Integer> {

}
