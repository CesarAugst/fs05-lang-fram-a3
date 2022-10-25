package fit.services;

import java.util.List;

import fit.domain.Table;
import fit.repository.TableRepository;

public class TableService {
    private TableRepository repo;

    public TableService() {
        super();
        repo = new TableRepository();
    }

    public List<Table> add(Table table) {
        repo.add(table);

        return repo.getAll();
    }

    public List<Table> getAll() {
        return repo.getAll();
    }

    public List<Table> getColor(String color){
        return repo.getColor(color);
    }
}
