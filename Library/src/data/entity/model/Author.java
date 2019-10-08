package data.entity.model;

import data.entity.model.persistentModel.NamedPersistent;

public class Author extends NamedPersistent {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
