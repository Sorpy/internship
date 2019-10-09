package presentation.service.bookstatusservice;

import business.processor.bookstatusprocessor.BookStatusProcessorImpl;

public class BookStatusServiceImpl implements BookStatusService{
    private BookStatusProcessorImpl bookStatusProcessor;

    public BookStatusProcessorImpl getBookStatusProcessor() {
        return bookStatusProcessor;
    }

    public void setBookStatusProcessor(BookStatusProcessorImpl bookStatusProcessor) {
        this.bookStatusProcessor = bookStatusProcessor;
    }
}
