package com.crystal.report2.model;

import lombok.Getter;

@Getter
public class User {
    private int user_idx;
    private String name;
    private String part;

    public boolean isSameName (String name) {
        return this.name.equals(name);
    }

    public boolean isSamePart (String part) {
        return this.part.equals(part);
    }

    public boolean isSameId (int id) {
        return this.user_idx == id;
    }

    public void update (User nextUser){
            this.name = nextUser.getName();
            this.part = nextUser.getPart();
    }
}
