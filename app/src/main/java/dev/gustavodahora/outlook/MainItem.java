package dev.gustavodahora.outlook;

public class MainItem {
    private int id;
    private int imageId;
    private int titleId;
    private int subjectId;
    private int time;

    public MainItem(int id, int imageId, int titleId, int subjectId, int time) {
        this.id = id;
        this.imageId = imageId;
        this.titleId = titleId;
        this.subjectId = subjectId;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
