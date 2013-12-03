/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lv.csc.operatorservice.entity;

/**
 *
 * @author aleksandrs
 */
public class IncommingCall {
    private int id;
    private double callId;
    private String callerNum;
    private String agentNum;
    private long callStartTime;

    public IncommingCall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCallId() {
        return callId;
    }

    public void setCallId(double callId) {
        this.callId = callId;
    }

    public String getCallerNum() {
        return callerNum;
    }

    public void setCallerNum(String callerNum) {
        this.callerNum = callerNum;
    }

    public String getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(String agentNum) {
        this.agentNum = agentNum;
    }

    public long getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(long callStartTime) {
        this.callStartTime = callStartTime;
    }
    
    
}
