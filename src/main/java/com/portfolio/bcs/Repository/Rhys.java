/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.bcs.Repository;

import com.portfolio.bcs.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Rhys extends JpaRepository<Hys, Integer>{
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
