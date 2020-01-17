package org.bedu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.bedu.consultorio.BackendConsultorioApplication;
import org.bedu.consultorio.model.persona.Doctor;
import org.bedu.consultorio.services.DoctorSrevice;
import org.junit.jupiter.api.Test;

public class backendConsultorioApplicationTest {

	@Test
	public void test() {
		BackendConsultorioApplication.main(new String[] {
		});
	}
	
	 @Test
	    public void updateDoctor() {
	        Doctor doctor = new Doctor();
	        assertEquals("", doctor);
	    }
	 
	 @Test
		public void saveDoctor() {
	    	Doctor doctor= new Doctor();
	          assertEquals("Roberto", doctor);
		}
		
	    @Test
		public void getDoctor() {
	    	  Doctor doctor = new Doctor();
	          assertEquals("Roberto", doctor);
		}
		
	    @Test
		public void deleteDoctor() throws Exception{
	    	//Long idEmpleado = ;
	    	//Doctor doctor = new Doctor(idEmpleado);
	    	//given(doctorService.findUserById(idEmpleado)).willReturn(Optional.of(doctor));
	    	//doNothing().when(doctorService).deleteUserById(doctor.getId());
		}

		public void  getDoctorService() {
			  Doctor doctor = new Doctor();
		        assertEquals("Roberto", doctor);
		}

		public void setDoctorService(DoctorSrevice doctorService) {
			this.doctorService = doctorService;
		}
}