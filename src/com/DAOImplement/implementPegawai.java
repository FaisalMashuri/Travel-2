/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImplement;

/**
 *
 * @author LENOVO
 */
import java.util.List;
import com.model.*;
public interface implementPegawai {
    public void insert(pegawai b);
    public void update(pegawai b);
    public void delete(int id);
    public List<pegawai>getALL();
    public List<pegawai>getCariNama(String nama);
}
