package com.bankApp.userFront.dao;

import com.bankApp.userFront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

    Appointment findAppointmentById(Long appointmentId);
}