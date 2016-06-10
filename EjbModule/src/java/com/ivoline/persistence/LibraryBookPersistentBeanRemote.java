/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivoline.persistence;

import com.ivoline.entities.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ivoline
 */
@Remote
public interface LibraryBookPersistentBeanRemote {

    void addBook(Book bookName);

    List<Book> getBooks();

}
