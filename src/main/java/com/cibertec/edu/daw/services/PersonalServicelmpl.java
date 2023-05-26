package com.cibertec.edu.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.daw.models.Personal;
import com.cibertec.edu.daw.repositories.PersonalDao;

@Service
public class PersonalServicelmpl implements PersonalService {

    private PersonalDao personalDao;

    @Autowired
    public PersonalServicelmpl(PersonalDao personalDao) {
        this.personalDao = personalDao;
    }

    @Override
    public List<Personal> getAllPersonals() {
        return personalDao.findAll();
    }

    @Override
    public List<Personal> getPersonalesByCodigoArea(String codigoArea) {
        return personalDao.findByCodigo_Area(codigoArea);
    }
}

//Profesor ME FUNCIONO TODO HASTA QUE INTENTE IMPLEMENTAR EL REQUEST PARAM  :,V Y AHI YA ME DIO UN 
//ERROR PROFESOR , PERO SI FUNCIONO Y ME DIO LA LISTA ANTER DE QUERER IMPLEMENTARLO PERO AVANZE LO 
//MAS QUE PUDE , ME SALE UN ERROR PERO NO LO ENCUENTRO