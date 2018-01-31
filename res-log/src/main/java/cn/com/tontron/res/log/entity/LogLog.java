package cn.com.tontron.res.log.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by yangyang on 2018/1/31.
 */
@Table(name = "log_log")
@Entity
public class LogLog extends AutoModel {
    private String ms;
    private String transactionId;
    @Length(max = 20000)
    @Column(length = 20000, columnDefinition = "text")
    private String msg;
    private String status;
    private Date date;
    private String remark;

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
