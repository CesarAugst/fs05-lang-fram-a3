package fit.repository;

import java.util.ArrayList;
import java.util.List;

import fit.domain.Table;

public class TableRepository {
    private List<Table> tables;

    public TableRepository() {
        super();
        tables = new ArrayList<Table>();
        tables.add(new Table("vermelha", "madeira", "redonda"));
    }

    public List<Table> getAll() {
        return tables;
    }

    public List<Table> getColor(String color) {
        return tables.stream().filter(x -> x.getCor().equals(color)).toList();
    }

    public List<Table> add(Table table) {
        tables.add(table);

        return tables;
    }
}
