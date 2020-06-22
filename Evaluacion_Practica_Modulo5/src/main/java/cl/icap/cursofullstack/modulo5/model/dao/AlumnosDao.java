package cl.icap.cursofullstack.modulo5.model.dao;

import java.util.List;

import cl.icap.cursofullstack.modulo5.model.dto.AlumnosDto;

public interface AlumnosDao {
	public int insert (AlumnosDto alumnosDto);
	public AlumnosDto get(int alumno_id);
	public int update (AlumnosDto alumnosDto);
	public int delete (int alumno_id);
	public List <AlumnosDto> list();
	

}
