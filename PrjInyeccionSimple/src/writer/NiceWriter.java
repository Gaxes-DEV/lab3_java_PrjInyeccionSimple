/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writer;

import org.springframework.stereotype.Service;

public class NiceWriter implements IWriter {

    @Override
    public void writer(String s) {
        System.out.println("The String is " + s);
    }
    
}
