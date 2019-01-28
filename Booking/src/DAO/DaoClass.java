package DAO;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import EXCEPTIONS.BookingException;
import MODEL.BookingBean;
import UTILITY.JdbcUtility;

public class DaoClass implements IDao {

	List list = new List();
	PreparedStatement statement = null;
	ResultSet resultSet  = null;
	Connection connection;
	@Override
	public List idgenerate(BookingBean bean) {
		try {
			connection = JdbcUtility.getConnection();
			statement =connection.prepareStatement(QueryMapper.booking);
			resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				String custname=resultSet.getString(1);
				String custid=resultSet.getString(2);
				Date dob=resultSet.getDate(3);
				int age=resultSet.getInt(4);
				int mobileid = resultSet.getInt(5);
				int quantity = resultSet.getInt(6);
				String address=resultSet.getString(7);
				int bookingid=resultSet.getInt(8);
				BookingBean beans=new BookingBean();
				bean.setCustname(custname);
				bean.setCustId(custid);
				bean.setDob(dob);
				bean.setAge(age);
				bean.setMobId(mobileid);
				bean.setQuantity(quantity);
				bean.setAddress(address);
				bean.setBookingId(bookingid);
				list.add(custid);
			}
		} catch (Exception e) {
			System.out.println("not inserted");
		}
		return list;
	}

}
