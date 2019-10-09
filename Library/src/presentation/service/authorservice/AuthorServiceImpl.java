package presentation.service.authorservice;

import business.processor.authorprocessor.AuthorProcessorImpl;

public class AuthorServiceImpl implements AuthorService{
    private AuthorProcessorImpl authorProcessor;

    public AuthorProcessorImpl getAuthorProcessor() {
        return authorProcessor;
    }

    public void setAuthorProcessor(AuthorProcessorImpl authorProcessor) {
        this.authorProcessor = authorProcessor;
    }
}
