package com.cg.movies.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.movies.dao.*;
import com.cg.movies.dto.Booking;
import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;
import com.cg.movies.exception.UserException;

public class CustomerServiceImpl implements CustomerService {
		
	CustomerDao dao=new CustomerDaoImpl();
	@Override
	public Customer addCustomer(Customer customer) throws UserException {
		
		if(Validate.validateCustomer(customer)) {
			return dao.addCustomer(customer);
		}
		return null;
	}

	@Override
	public Customer validateCustomer(String userName, String userPass) throws UserException {
		
		return dao.validateCustomer(userName,userPass);
	}

	@Override
	public List<Movie> getMovies() {
		
		return dao.getMovies();
	}

	@Override
	public List<String> getTheatreByMovieId(Integer movieId) {
		
		return dao.getTheatreByMovieId(movieId);
	}

	@Override
	public List<String> getShows(Integer movieId, Integer theatreSelected) {
		
		return dao.getShows(theatreSelected);
	}

	@Override
	public BigInteger getUserId(String userName) {
		
		return dao.getUserId(userName);
	}

	@Override
	public Boolean addBooking(Booking booking) {
		
		if(Validate.validateBooking(booking)) {
			return dao.addBooking(booking);
		}
		return false;
	}

	@Override
	public List<String> viewBookings(BigInteger userID) {
		
		return dao.viewBookings(userID);
	}

	@Override
	public Boolean cancelBooking(BigInteger bookingid) {
		
		return dao.cancelBooking(bookingid);
	}

}