package cl.icap.cursofullstack.modulo5.service;

import java.util.List;

import cl.icap.cursofullstack.modulo5.model.dto.AlumnosDto;

public interface AlumnosService {
		public int insert (AlumnosDto alumnosDto);
		public AlumnosDto get(int alumno_id);
		public int update (AlumnosDto alumnosDto);
		public int delete (int alumno_id);
		public List <AlumnosDto> list();
		
}
