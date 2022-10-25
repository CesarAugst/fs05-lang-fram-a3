package fit;

import fit.domain.Book;
import fit.domain.Table;
import fit.services.BookService;
import fit.services.TableService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var bookSvc = new BookService();
        System.out.println("Dados de livros...");

        bookSvc.add(new Book("Title default", 1));
        System.out.println(bookSvc.getAll());

        //table
        var tableSvc = new TableService();
        System.out.println("Dados de mesas...");

        tableSvc.add(new Table("verde", "vidro", "triangulo"));
        System.out.println(tableSvc.getAll());

        System.out.println(tableSvc.getColor("verde"));
    }
}
