package business.converter.order;

import data.entity.Order;
import dataaccess.dao.orderdao.OrderDao;
import dataaccess.dao.orderdao.OrderDaoImpl;

public class OrderParamConverterImpl implements OrderParamConverter{
    private OrderDao orderDao;

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order convert(OrderParam param) {
        return null;
    }
}
