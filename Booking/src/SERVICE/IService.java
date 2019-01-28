package SERVICE;

import java.awt.List;

import EXCEPTIONS.BookingException;
import MODEL.BookingBean;

public interface IService {

	List idgenerate(BookingBean bean) throws BookingException;

}
