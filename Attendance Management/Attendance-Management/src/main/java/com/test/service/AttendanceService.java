package com.test.service;

import com.test.model.Attendance;
import com.test.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService 
{

    @Autowired
    private AttendanceRepository repository;

    public List<Attendance> listAll()
    {
        return repository.findAll();
    }

    public Attendance get(int id)
    {
        return repository.findById(id).get();

    }

    public void save(Attendance attendance)
    {
        repository.save(attendance);
    }

    public Attendance update(Attendance attendance){
        return repository.save(attendance);
    }

    public void delete(int id)
    {
        repository.deleteById(id);
    }

}
