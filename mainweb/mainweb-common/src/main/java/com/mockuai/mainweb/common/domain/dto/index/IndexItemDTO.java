package com.mockuai.mainweb.common.domain.dto.index;

/**
 * Created by edgar.zr on 3/28/2016.
 */
public class IndexItemDTO {

    private String text;
    private String imageUrl;
    private String targetUrl;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}