pe.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sgl.dao.UserDaoI;
import com.sgl.model.User;
@Service("userService")
@Transactional  
public class UserService      
//֮ǰ����д�����UserServiceImpl��ллwangdianyong�����ѣ��˴������޸�  {          
//�Զ�ע��dao      
@Autowired     
private UserDaoI<User> userDao;            
public void addUser(User user)      
{          
	userDao.save(user);      
	}    
}