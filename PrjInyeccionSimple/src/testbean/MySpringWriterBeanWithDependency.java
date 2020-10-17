/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import writer.IWriter;

public class MySpringWriterBeanWithDependency {
    private IWriter writer;
    
    @Autowired
    public void setWriter (IWriter pWriter){
        this.writer = pWriter;
    }
    
    public void run(){
        String s = "Sample string";
        writer.writer(s);
    }
}
