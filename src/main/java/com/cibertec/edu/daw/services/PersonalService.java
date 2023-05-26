package com.cibertec.edu.daw.services;

import java.util.List;

import com.cibertec.edu.daw.models.Personal;

public interface PersonalService {
	
	public List<Personal>getAllPersonals();
	List<Personal> getPersonalesByCodigoArea(String codigoArea);
	
}
