/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivoline.persistence;

import com.ivoline.entities.Bookblob;
import com.ivoline.entities.BookEmbeddable;
import javax.ejb.Remote;
import com.ivoline.entities.Books;
import java.util.List;

/**
 *
 * @author ivoline
 */
@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Books bookName);

    List<Books> getBooks();
    
    void addBookEmbeddable(BookEmbeddable bookName);

    List<BookEmbeddable> getBookEmbeddable();

    void addBookBlob(Bookblob book);

    List<Bookblob> getBookBlob();
    
//    void addBookQuery(Bookuery bookName);
//    List<BookQuery> getBookQuery();
}
