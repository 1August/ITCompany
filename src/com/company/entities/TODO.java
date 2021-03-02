package com.company.entities;

import org.w3c.dom.Text;

public class TODO {
    private int id;
    private String name;
    private Text description;
    private String front_f_name;
    private String back_f_name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Text getDescription() {
        return description;
    }
    public void setDescription(Text description) {
        this.description = description;
    }
    public String getFront_f_name() {
        return front_f_name;
    }
    public void setFront_f_name(String front_f_name) {
        this.front_f_name = front_f_name;
    }
    public String getBack_f_name() {
        return back_f_name;
    }
    public void setBack_f_name(String back_f_name) {
        this.back_f_name = back_f_name;
    }

    public TODO(String name, Text description, String front_f_name, String back_f_name) {
        setName(name);
        setDescription(description);
        setFront_f_name(front_f_name);
        setBack_f_name(back_f_name);
    }

    public TODO(int id, String name, Text description, String front_f_name, String back_f_name) {
        setId(id);
        setName(name);
        setDescription(description);
        setFront_f_name(front_f_name);
        setBack_f_name(back_f_name);
    }

    @Override
    public String toString() {
        return "TODO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", front_f_name='" + front_f_name + '\'' +
                ", back_f_name='" + back_f_name + '\'' +
                '}';
    }
}
