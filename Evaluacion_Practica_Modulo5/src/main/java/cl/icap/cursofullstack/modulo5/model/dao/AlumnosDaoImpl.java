package cl.icap.cursofullstack.modulo5.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.cursofullstack.modulo5.model.dto.AlumnosDto;

@Repository
@Transactional

public class AlumnosDaoImpl implements AlumnosDao {
	private String insert = "INSERT INTO Alumnos VALUES (?,?,?)";
	private String select = "SELECT * FROM Alumnos WHERE rut=?";
	private String update = "UPDATE Alumnos SET RUT = ?, NOMBRE = ?, CURSO = ? WHERE RUT =?";
	private String delete = "DELETE Alumnos WHERE RUT =?";
	private String list = "SELECT * FROM Alumnos";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
			
	public AlumnosDaoImpl() {
		// TODO Auto-generated constructor stub
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

	@Override
	public List<AlumnosDto> list() {
		List<AlumnosDto> listAlumnos = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(AlumnosDto.class));
		// TODO Auto-generated method stub
		return listAlumnos;
	}

}
