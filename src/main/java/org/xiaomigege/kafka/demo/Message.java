package org.xiaomigege.kafka.demo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mijun on 2017/6/12.
 */

public class Message implements Serializable{

    private Long id;
    private String msg;
    private Date sendTime;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Date getSendTime() {
        return sendTime;
    }
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

}
