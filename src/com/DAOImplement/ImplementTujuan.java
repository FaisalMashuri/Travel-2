/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImplement;
import java.util.List;
import com.model.*;

/**
 *
 * @author Raisya Rahma
 */
public interface ImplementTujuan {
    
    public void insert(tujuan b);
    
    public void update(tujuan b);
    
    public void delete(int id);
    
    public List<tujuan>getALL();
    
    public List<tujuan>getCariId(int id);
    
}