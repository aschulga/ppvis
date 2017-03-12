package Main;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;


public class ModelTable extends AbstractTableModel{


    private int columnCount = 2;
    private ArrayList<String []> list = new ArrayList<String []>();

    /*
    public ModelTable()
    {
        list = new ArrayList<String []>();
        for(int i = 0 ; i < list.size(); i++)
        {
            list.add(new String[getColumnCount()]);
        }
    }
    */

    public int getRowCount()
    {
        return list.size();
    }

    public int getColumnCount()
    {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
        String []rows = list.get(rowIndex);
        return rows[columnIndex];
    }

    public void addDate(String []row)
    {
        list.add(row);
        fireTableDataChanged();
    }

    public void Move(int rowIndex)
    {
        String []row = list.get(rowIndex);
        row[1] = row[0];
        row[0] = "";
        fireTableDataChanged();
    }

    public void BackMove(int rowIndex)
    {
        String []row = list.get(rowIndex);
        row[0] = row[1];
        row[1] = "";
        fireTableDataChanged();
    }




}
