package ro.leasing.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import ro.leasing.domain.User;


public class UserDao extends GenericDao {

    public List<User> getUsersList() {
        DetachedCriteria c = DetachedCriteria.forClass(User.class);
        return c.getExecutableCriteria(getSession()).list();
    }

    public void saveObject(Object object) {
        Session session = getSession();
        session.saveOrUpdate(object);
    }
}
