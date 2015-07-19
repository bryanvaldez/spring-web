/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springweb.controllers.programa;

import com.tecsup.springweb.model.Programa;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface ProgramaService {
    List<Programa> listPrograma();
    Programa get(Long id);
    void save(Programa programa);
    void delete(Programa programa);
}
