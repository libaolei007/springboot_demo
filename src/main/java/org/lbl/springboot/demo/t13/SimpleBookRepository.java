package org.lbl.springboot.demo.t13;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {

    @Override
//    @Cacheable(value="books")  此方法开启缓存
    public BookT13 getByIsbn(String isbn) {
        simulateSlowService();
        return new BookT13(isbn, "Some book");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
