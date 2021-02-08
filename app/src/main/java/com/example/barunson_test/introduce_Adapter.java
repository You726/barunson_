package com.example.barunson_test;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import android.widget.ImageView;
import android.widget.TextView;


import java.util.HashMap;
import java.util.List;

public class introduce_Adapter extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listDataHeader;
    private List<String> _listDataSubHeader;
    private List<Integer> _listDataImage;
    private HashMap<String, List<String>> _listDataChild;

    public introduce_Adapter(Context context, List<String> listDataHeader,List<String> listDataSubHeader,
                                 HashMap<String, List<String>> listDataChild, List<Integer> listDataImage){
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listDataChild;
        this._listDataImage = listDataImage;
        this._listDataSubHeader = listDataSubHeader;

    }
    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);

        if(convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.introduce_parent, parent, false);
        }
        TextView lblListHeader = (TextView)convertView.findViewById(R.id.introduce_name);
        ImageView introduce_image = (ImageView)convertView.findViewById(R.id.introduce_image);
        TextView lblListHeader2 = (TextView)convertView.findViewById(R.id.introduce_subname);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader2.setTypeface(null,Typeface.BOLD);
        introduce_image.setBackgroundResource(_listDataImage.get(groupPosition));
        lblListHeader.setText(headerTitle);
        lblListHeader2.setText(_listDataSubHeader.get(groupPosition));
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String)getChild(groupPosition, childPosition);

        if(convertView == null){
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.introduce_child,parent, false);
        }
        TextView txtListChild = (TextView) convertView.findViewById(R.id.introduce_introduce);
        txtListChild.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}



