package com.enzoeduardobruno.eeb.Interface;

import com.enzoeduardobruno.eeb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> GetPersona ();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
