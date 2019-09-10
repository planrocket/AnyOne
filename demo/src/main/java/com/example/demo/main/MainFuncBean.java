package com.example.demo.main;

public class MainFuncBean {
    private Class targetActivity;
    private String title;
    private String description;

    public MainFuncBean(final Class targetActivity, final String title, final String description) {
        this.targetActivity = targetActivity;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Class getTargetActivity() {
        return this.targetActivity;
    }

    public void setTargetActivity(final Class targetActivity) {
        this.targetActivity = targetActivity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
