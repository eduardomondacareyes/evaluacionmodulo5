package cl.icap.cursofullstack.modulo5.model.dto;

public class AlumnosDto {
	
	private int RUT;	
	private String NOMBRE;	
	private int CURSO;		

	public AlumnosDto() {
		// TODO Auto-generated constructor stub
	}

	public int getRUT() {
		return RUT;
	}

	public void setRUT(int rUT) {
		RUT = rUT;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public int getCURSO() {
		return CURSO;
	}

	public void setCURSO(int cURSO) {
		CURSO = cURSO;
	}

}
