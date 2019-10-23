package presentation.service.authorservice;

import business.converter.author.AuthorParam;
import business.processor.authorprocessor.AuthorProcessor;
import business.processor.authorprocessor.AuthorProcessorImpl;
import data.common.APIResponse;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    private AuthorProcessor authorProcessor;

    public AuthorProcessor getAuthorProcessor() {
        return authorProcessor;
    }

    public void setAuthorProcessor(AuthorProcessor authorProcessor) {
        this.authorProcessor = authorProcessor;
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
    public APIResponse create(AuthorParam param) {
        return null;
    }

    @Override
    public APIResponse create(List<AuthorParam> param) {
        return null;
    }

    @Override
    public APIResponse update(long id, AuthorParam param) {
        return null;
    }

    @Override
    public APIResponse update(List<AuthorParam> param) {
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
    public void validateParameters(AuthorParam param) {

    }

    @Override
    public void validateParameters(List<AuthorParam> param) {

    }
}
