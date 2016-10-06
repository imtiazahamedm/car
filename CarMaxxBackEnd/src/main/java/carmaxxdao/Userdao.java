package carmaxxdao;

import java.util.List;

import com.CarMaxxmodel.User;

public interface Userdao {
	
	 
	    public  List<User> list();
	     
	    public User get(int id);
	     
	    
	     
	    public void delete(int id);

		void saveOrUpdate(User user);
	}

