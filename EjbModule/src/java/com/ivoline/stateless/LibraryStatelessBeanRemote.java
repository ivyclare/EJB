/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivoline.stateless;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ivoline
 */
@Remote
public interface LibraryStatelessBeanRemote {

    void addBook(String bookName);

    List getBooks();
}
