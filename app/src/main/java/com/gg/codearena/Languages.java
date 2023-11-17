package com.gg.codearena;

import java.util.Map;

public class Languages {
    private final int img_res_id;
    private String topics;

    public Languages(int img_res_id, String topics){
        this.img_res_id = img_res_id;
        this.topics = topics;
    }

    public int getImg_res_id() {
        return img_res_id;
    }

    public String getTopics() {
        return topics;
    }
}
