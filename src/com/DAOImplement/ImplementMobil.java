/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImplement;

/**
 *
 * @author Fianti Savitri
 */

import java.util.List;
import com.model.*;
public interface ImplementMobil {
    public void insert(mobil b);
    public void update(mobil b);
    public void delete(int id);
    public List<mobil> getALL();
}

