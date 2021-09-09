package com.company;

public class Button {
    private String title;
    private onClickListener onClickListner;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(onClickListener onClickListener){
        this.onClickListner = onClickListener;
    }

    public void onClick(){
        this.onClickListner.onClick(this.title);

    }

    public interface onClickListener{
        public void onClick(String title);
    }
}
