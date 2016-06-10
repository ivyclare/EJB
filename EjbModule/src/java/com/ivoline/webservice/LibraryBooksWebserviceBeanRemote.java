/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ivoline.webservice;

import com.ivoline.entities.Books;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ivoline
 */
@Remote
public interface LibraryBooksWebserviceBeanRemote {
    
    void addBook(Books bookName);

    List<Books> getBooks();
    
}
