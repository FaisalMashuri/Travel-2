/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Fianti Savitri
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class TableModelMobil extends AbstractTableModel{ List<mobil> lb;
public TableModelMobil(List<mobil> lb) {
this.lb = lb;
}
@Override
public int getColumnCount() {
return 3;
}
public int getRowCount() {
return lb.size();
}
@Override
public String getColumnName(int column) {
switch (column) {
case 0:
return "ID Mobil";
case 1:
return "No Polisi";
case 2:
return "Tujuan";
default:
return null;
}
}
@Override
public Object getValueAt(int row, int column) {
switch (column) {
case 0:
return lb.get(row).getId();
case 1:
return lb.get(row).getNopol();
case 2:
return lb.get(row).getTujuan();
default:
return null;
}
}
}