package com.test.controller;


import com.test.model.Attendance;
import com.test.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class AttendanceController 
{

    @Autowired
    private AttendanceService service;

    @GetMapping("attendance")
    public List<Attendance> list()
    {
        return service.listAll();
    }


    @GetMapping("attendance/{id}")
    public ResponseEntity<Attendance> get(@PathVariable Integer id)
    {
        try
        {
            Attendance attendance  = service.get(id);
            return new ResponseEntity<Attendance>(attendance, HttpStatus.OK);

        } 
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<Attendance>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("attendance")
    public ResponseEntity<Attendance> add(@RequestBody Attendance attendance)
    {
        service.save(attendance);
        return new ResponseEntity<Attendance>(attendance,HttpStatus.CREATED);
    }


    @PutMapping("attendance")
    public ResponseEntity<?> update(@RequestBody Attendance attendance) {
        try 
        {
            Attendance existAttendance = service.update(attendance);
            service.save(attendance);
            return new ResponseEntity<>(HttpStatus.OK);
        } 
        catch (NoSuchElementException e) 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("attendance/{id}")
    public void delete(@PathVariable Integer id) 
    {
        service.delete(id);
    }

}
