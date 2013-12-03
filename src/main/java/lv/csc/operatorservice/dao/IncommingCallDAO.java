/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.csc.operatorservice.dao;
import java.util.List;
import lv.csc.operatorservice.entity.*;
/**
 *
 * @author aleksandrs
 */
public interface IncommingCallDAO {
    
    /**
     *
     * @param id
     * @return IncommingCall
     */
    IncommingCall getCallById(int id);

    /**
     *
     * @param callerNum
     * @return List of incoming calls
     */
    List<IncommingCall> getAllByNum(String callerNum);
    
    /**
     *
     * @param agentNum
     * @return List of incoming calls
     */
    List<IncommingCall> getAllByAgent(String agentNum);
    
    /**
     * Need two time point between search calls
     * @param from
     * @param till
     * @return  List of incoming calls
     */
    List<IncommingCall> getAllByTime(long from, long till);
    
}
