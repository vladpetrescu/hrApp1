package ro.leasing.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "MESSAGE")
public class Message implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String title;
    private String text;

    // instead of user:
    private String username;
    private String email;

    private Date date;

    private User user;

    public Message() {
        super();
    }

    public Message(Long id, String title, String text, Date date, User user) {
        super();
        this.id = id;
        this.title = title;
        this.text = text;
        this.date = date;
        this.user = user;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false, precision = 22, scale = 0)
    public Long getId() {
        return id;
    }

    @Column(name = "TITLE", length = 100, nullable = true, unique = false, updatable = true)
    public String getTitle() {
        return title;
    }

    @Column(name = "TEXT", length = 1000, nullable = true, unique = false, updatable = true)
    public String getText() {
        return text;
    }

    @Column(name = "USERNAME", length = 50, nullable = true, unique = false, updatable = false)
    public String getUsername() {
        return username;
    }

    @Column(name = "EMAIL", length = 50, nullable = true, unique = false, updatable = false)
    public String getEmail() {
        return email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE", nullable = false, length = 7)
    public Date getDate() {
        return date;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USER")
    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
