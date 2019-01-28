package SERVICE;

import java.awt.List;

import DAO.DaoClass;
import DAO.IDao;
import EXCEPTIONS.BookingException;
import MODEL.BookingBean;

public class ServiceClass implements IService {

	IDao dao = new DaoClass();
	@Override
	public List idgenerate(BookingBean bean) throws BookingException {
		// TODO Auto-generated method stub
		return dao.idgenerate(bean);
	}

}
