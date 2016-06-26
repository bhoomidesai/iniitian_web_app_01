package com.khozema.iniitian.service;

import com.khozema.iniitian.entity.Cart;
import com.khozema.iniitian.entity.CartItem;

public interface CartItemService {
	public void add(CartItem item);
	public CartItem get(Long id);
	public CartItem getCartItemByProductId(Long id);
	public void remove(CartItem item);
	public void removeAll(Cart cart);

}
