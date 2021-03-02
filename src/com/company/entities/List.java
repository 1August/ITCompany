package com.company.entities;

public class List {
    private int id;
    private String f_name;
    private String job;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public List(String f_name, String job) {
        setF_name(f_name);
        setJob(job);
        if (job == "Front") {

        } else if (job == "Back") {

        }
    }

    public List(int id, String f_name, String job) {
        setId(id);
        setF_name(f_name);
        setJob(job);
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
