package com.tamirat.todo.domain;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private boolean isCompelted;

    @ManyToOne
    private User user;

    public Todo() {
    }

    public Todo(Long id, String title, boolean isCompelted) {
        this.id = id;
        this.title = title;
        this.isCompelted = isCompelted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompelted() {
        return isCompelted;
    }

    public void setCompelted(boolean compelted) {
        isCompelted = compelted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isCompelted=" + isCompelted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo task = (Todo) o;

        if (isCompelted != task.isCompelted) return false;
        if (!id.equals(task.id)) return false;
        return title.equals(task.title);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }
}
