package DAO;

import java.awt.List;

import EXCEPTIONS.BookingException;
import MODEL.BookingBean;

public interface IDao {

	List idgenerate(BookingBean bean) throws BookingException;

}
