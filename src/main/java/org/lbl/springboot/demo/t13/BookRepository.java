package org.lbl.springboot.demo.t13;

public interface BookRepository {
    BookT13 getByIsbn(String isbn);
}
