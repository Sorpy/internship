package business.processor.orderprocessor;

import business.converter.order.*;
import dataaccess.dao.orderdao.OrderDao;
import dataaccess.dao.orderdao.OrderDaoImpl;

import java.util.List;

public class OrderProcessorImpl implements OrderProcessor{
    private OrderDao orderDao;
    private OrderParamConverter orderParamConverter;
    private OrderResultConverter orderResultConverter;

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public OrderParamConverter getOrderParamConverter() {
        return orderParamConverter;
    }

    public void setOrderParamConverter(OrderParamConverter orderParamConverter) {
        this.orderParamConverter = orderParamConverter;
    }

    public OrderResultConverter getOrderResultConverter() {
        return orderResultConverter;
    }

    public void setOrderResultConverter(OrderResultConverter orderResultConverter) {
        this.orderResultConverter = orderResultConverter;
    }

    @Override
    public OrderResult create(OrderParam param) {
        return null;
    }

    @Override
    public List<OrderResult> create(List<OrderParam> param) {
        return null;
    }

    @Override
    public void update(long id, OrderParam param) {

    }

    @Override
    public void update(List<OrderParam> param) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(List<Long> idList) {

    }

    @Override
    public OrderResult find(long id) {
        return null;
    }

    @Override
    public List<OrderResult> find() {
        return null;
    }
}
