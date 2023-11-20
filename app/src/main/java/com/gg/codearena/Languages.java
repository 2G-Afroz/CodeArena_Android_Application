package com.gg.codearena;

public class Languages {
    private final int img_res_id;
    private final String topics;
    private final String lang_title;

    public Languages(int img_res_id, String lang_title, String topics){
        this.img_res_id = img_res_id;
        this.lang_title = lang_title;
        this.topics = topics;
    }

    public int getImg_res_id() {
        return img_res_id;
    }

    public String getLang_title(){
        return lang_title;
    }

    public String getTopics() {
        return topics;
    }
}
