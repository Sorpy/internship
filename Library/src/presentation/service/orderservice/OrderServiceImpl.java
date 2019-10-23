package presentation.service.orderservice;

import business.converter.order.OrderParam;
import business.processor.orderprocessor.OrderProcessor;
import business.processor.orderprocessor.OrderProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class OrderServiceImpl implements OrderService{
    private OrderProcessor orderProcessor;

    public OrderProcessor getOrderProcessor() {
        return orderProcessor;
    }

    public void setOrderProcessor(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public APIResponse findByPK(long id) {
        return null;
    }

    @Override
    public APIResponse listAll() {
        return null;
    }

    @Override
    public APIResponse create(OrderParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<OrderParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, OrderParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<OrderParam> param) {
        return null;
    }

    @Override
    public APIResponse deleteById(long id) {
        return null;
    }

    @Override
    public APIResponse delete(List<Long> idList) {
        return null;
    }

    @Override
    public void validateParameters(OrderParam param) {

    }

    @Override
    public void validateParameters(List<OrderParam> param) {

    }
}
