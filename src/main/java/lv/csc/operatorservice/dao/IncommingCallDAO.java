/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.csc.operatorservice.dao;
import lv.csc.operatorservice.entity.*;
/**
 *
 * @author aleksandrs
 */
public interface IncommingCallDAO {
    
    /**
     *
     * @param id
     * @return
     */
    InclomminCall getCallById(int id);
    
    
    
}
