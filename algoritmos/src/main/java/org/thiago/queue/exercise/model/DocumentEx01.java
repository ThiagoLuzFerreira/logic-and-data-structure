package org.thiago.queue.exercise.model;

import java.util.Objects;

public class DocumentEx01 {

    private String name;
    private Integer qnty;

    public DocumentEx01(String name, Integer qnty) {
        this.name = name;
        this.qnty = qnty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQnty() {
        return qnty;
    }

    public void setQnty(Integer qnty) {
        this.qnty = qnty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentEx01 that = (DocumentEx01) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "DocumentEx01{" +
                "name='" + name + '\'' +
                ", qnty=" + qnty +
                '}';
    }
}
