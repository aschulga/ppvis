package Main;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelTable extends AbstractTableModel{

    private int columnCount = 2;
    private ArrayList<String []> list = new ArrayList<String []>();

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
