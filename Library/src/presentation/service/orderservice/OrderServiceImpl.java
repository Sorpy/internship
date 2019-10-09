package presentation.service.orderservice;

import business.processor.orderprocessor.OrderProcessorImpl;

public class OrderServiceImpl implements OrderService{
    private OrderProcessorImpl orderProcessor;

    public OrderProcessorImpl getOrderProcessor() {
        return orderProcessor;
    }

    public void setOrderProcessor(OrderProcessorImpl orderProcessor) {
        this.orderProcessor = orderProcessor;
    }
}
