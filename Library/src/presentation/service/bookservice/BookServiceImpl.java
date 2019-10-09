package presentation.service.bookservice;

import business.processor.bookprocessor.BookProcessorImpl;

public class BookServiceImpl implements BookService{
    private BookProcessorImpl bookProcessor;

    public BookProcessorImpl getBookProcessor() {
        return bookProcessor;
    }

    public void setBookProcessor(BookProcessorImpl bookProcessor) {
        this.bookProcessor = bookProcessor;
    }
}
