package ro.leasing.domain;

// Generated 12.10.2012 10:16:12 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "USER")
public class User implements java.io.Serializable {

    private BigDecimal id;
    private Role role;
    private String username;
    private String password;
    private List<Message> messageList;

    public User() {
    }

    public User(BigDecimal id) {
        this.id = id;
    }

    public User(BigDecimal id, Role role, String username, String password) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.password = password;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ROLE")
    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Column(name = "USERNAME", length = 200)
    public String getUsername() {
        return this.username;
    }

    @OneToMany(fetch = FetchType.LAZY)
    public List<Message> getMessageList() {
        return messageList;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "PASSWORD", length = 200)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}