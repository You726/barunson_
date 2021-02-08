package com.example.barunson_test;

import java.util.ArrayList;

public class introduce_position {

    public String position;
    public String image;
    public ArrayList<String> players = new ArrayList<String>();

    public introduce_position(String position){
        this.position = position;
    }
    public String toString(){
        return position;
    }
}
