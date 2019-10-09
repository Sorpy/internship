package business.converter.order;

import dataaccess.dao.orderdao.OrderDaoImpl;

public class OrderParamConverterImpl implements OrderParamConverter{
    private OrderDaoImpl orderDao;

    public OrderDaoImpl getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }
}
