package cn.e3mall.cart.service;

import java.util.List;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;

public interface CartService {

	//服务端添加购物车
	E3Result addCart(long userId,long itemId,int num);
	//合并购物车
	E3Result mergeCart(long userId,List<TbItem> itemList);
	//取购物车列表
	List<TbItem> getCartList(long userId);
	//跟新购物车
	E3Result updateCartNum(long userId,long itemId,int num);
	//删除购物车
	E3Result deleteCart(long userId,long itemId);
	//清除购物车
	E3Result clearCartItem(long userId);
	
}
