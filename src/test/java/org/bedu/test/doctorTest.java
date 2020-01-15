package org.bedu.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.Optional;

import org.apache.catalina.User;
import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Doctor;
import org.bedu.consultorio.services.DoctorSrevice;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class doctorTest { 
    
   private DoctorSrevice doctorService;

    
    @Test
    public void updateDoctor() {
        Doctor doctor = new Doctor();
        assertEquals("Roberto", doctor);
    }
 
    @Test
	public Doctor saveDoctor(Doctor doctor) {
		return null;
	}
	
    @Test
	public Doctor getDoctor(Long id) {
		return null;
	}
	
    @Test
	public void deleteDoctor() throws Exception{
    	//Long idEmpleado = ;
    	//Doctor doctor = new Doctor(idEmpleado);
    	//given(doctorService.findUserById(idEmpleado)).willReturn(Optional.of(doctor));
    	//doNothing().when(doctorService).deleteUserById(doctor.getId());
	}

	public DoctorSrevice getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorSrevice doctorService) {
		this.doctorService = doctorService;
	}
}
