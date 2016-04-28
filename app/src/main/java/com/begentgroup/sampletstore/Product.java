package com.begentgroup.sampletstore;

/**
 * Created by dongja94 on 2016-04-28.
 */
public class Product {
    String webUrl;
    int charge;
    int downloadCount;
    String description;
    String thumbnailUrl;
    String name;
    String categoryCode;
    float score;
    String tinyUrl;
    String productId;

    @Override
    public String toString() {
        return name + "\n" + description;
    }
}
