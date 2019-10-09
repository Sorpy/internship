package business.processor.orderprocessor;

import business.converter.order.OrderParamConverterImpl;
import business.converter.order.OrderResultConverterImpl;
import dataaccess.dao.orderdao.OrderDaoImpl;

public class OrderProcessorImpl implements OrderProcessor{
    private OrderDaoImpl orderDao;
    private OrderParamConverterImpl orderParamConverter;
    private OrderResultConverterImpl orderResultConverter;

    public OrderDaoImpl getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }

    public OrderParamConverterImpl getOrderParamConverter() {
        return orderParamConverter;
    }

    public void setOrderParamConverter(OrderParamConverterImpl orderParamConverter) {
        this.orderParamConverter = orderParamConverter;
    }

    public OrderResultConverterImpl getOrderResultConverter() {
        return orderResultConverter;
    }

    public void setOrderResultConverter(OrderResultConverterImpl orderResultConverter) {
        this.orderResultConverter = orderResultConverter;
    }
}
