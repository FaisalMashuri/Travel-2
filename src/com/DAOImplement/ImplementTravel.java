/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImplement;

import com.model.Travel;
import java.util.List;

/**
 *
 * @author FAISAL
 */
public interface ImplementTravel {
    public void insert(Travel b);
    
    public void update(Travel b);
    
    public void delete(int id);
    
    public List<Travel>getALL();
    
    public List<Travel>getCariId(int id);
}
