package com.DAOImplement;
import java.util.List;
import com.model.*;

public interface implementSupir {
    public void insert(Supir b);
    public void update(Supir b);
    public void delete(int id);
    public List<Supir> getALL();
    public List<Supir> getCariNama(String nama);
}