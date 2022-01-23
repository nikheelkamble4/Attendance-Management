package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.model.Attendance;


@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer>
{

}
