package carmaxxdao;

	

	import java.util.List;
	 
	import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import com.CarMaxxmodel.User;
	 
	@Repository("userdao")
	public class UserDAOImpl implements Userdao {
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public UserDAOImpl() {
	         
	    }
	     
	    public UserDAOImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	 
	    @Transactional
	    public List<User> list() {
	        @SuppressWarnings("unchecked")
	        List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
	                .createCriteria(User.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 
	        return listUser;
	    }
	 
	    @Transactional
	    public void saveOrUpdate(User user) {
	        sessionFactory.getCurrentSession().saveOrUpdate(user);
	    }
	 
	    @Transactional
	    public void delete(String id) {
	        User userToDelete = new User();
	        userToDelete.setId1(id);
	        sessionFactory.getCurrentSession().delete(userToDelete);
	    }
	 
	    @Transactional
	    public User get1(int id) {
	        String hql = "from User where id=" + id;
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	         
	        @SuppressWarnings("unchecked")
	        List<User> listUser = (List<User>) query.list();
	         
	        if (listUser != null && !listUser.isEmpty()) {
	            return listUser.get(0);
	        }
	         
	        return null;
	    }

		public User get(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void saveOrUpdate(Userdao user) {
			// TODO Auto-generated method stub
			
		}

		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}
	}

