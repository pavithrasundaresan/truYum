/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @author Pavithra
 *
 */
public interface CartDao {
	public void addCartItem(long userId, long menuItemId);

	// public List<MenuItem> getAllCartItem(long userId) throws
	// CartEmptyException;
	public void removeCartItem(long userId, long menuItemId);

	List<MenuItem> getAllCartItems(long userid) throws CartEmptyException;
}
