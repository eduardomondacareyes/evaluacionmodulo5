package cl.icap.cursofullstack.modulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.modulo5.model.dao.AlumnosDao;
import cl.icap.cursofullstack.modulo5.model.dto.AlumnosDto;

@Service

public class AlumnosServiceImpl implements AlumnosService {
	
	@Autowired
	AlumnosDao alumnosDao;

	public AlumnosServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public List<AlumnosDto> list() {
		return alumnosDao.list();
	}

	@Override
	public int insert(AlumnosDto alumnosDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AlumnosDto get(int alumno_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(AlumnosDto alumnosDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int alumno_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
 