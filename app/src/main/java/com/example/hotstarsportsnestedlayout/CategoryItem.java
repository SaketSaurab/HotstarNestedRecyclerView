package com.example.hotstarsportsnestedlayout;


public class CategoryItem {


    Integer itemId;
    Integer imageUrl;
//    String textview1;
//    String textview2;

    public CategoryItem(Integer itemId, Integer imageUrl) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
//        this.textview1=textview1;
//        this.textview2=textview2;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }



    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) { this.imageUrl = imageUrl; }

    /*
    public String getTextview1() {
        return textview1;
    }

    public void setTextview1 (String textview1) {
        this.textview1 = textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public void setTextview2 (String textview2) {
        this.textview2 = textview2;
    }
    */
}