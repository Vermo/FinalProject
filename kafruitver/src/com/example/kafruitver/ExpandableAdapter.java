package com.example.kafruitver;

import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandableAdapter extends BaseExpandableListAdapter{
	// atallitemenable funciones para seleccion del elemento lista
	// isenable
	private final Activity context;
	private final List<String> mHeaders;
	private final HashMap<String, List<String>> mChilds;
	
	public ExpandableAdapter(Activity context, List<String> mHeaders, HashMap<String, List<String>> mChilds){
		this.context = context;
		this.mHeaders = mHeaders;
		this.mChilds = mChilds;
	}
	
	class ViewHolder{
		ImageView image;
		TextView text;
		CheckBox check;
	}

	//------ IMPLEMENTACION HIJOS------------------------------
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return this.mChilds.get(this.mHeaders.get(groupPosition)).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		final String mChildtext = (String) getChild(groupPosition, childPosition);
		ViewHolder mHolderChild = new ViewHolder(); 
		
		if(convertView == null){
			LayoutInflater inflater = context.getLayoutInflater();
			convertView = inflater.inflate(R.layout.row, null);
			mHolderChild.image = (ImageView) convertView.findViewById(R.id.image);
			mHolderChild.text = (TextView) convertView.findViewById(R.id.tipofruta);
			mHolderChild.check = (CheckBox) convertView.findViewById(R.id.click);
			convertView.setTag(mHolderChild);
			
		}
		
		mHolderChild = (ViewHolder) convertView.getTag();
		mHolderChild.image.setImageResource(R.drawable.ic_launcher);
		mHolderChild.text.setText(mChildtext); 

		return convertView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return mChilds.get(this.mHeaders.get(groupPosition)).size();
	}
	
	//------ IMPLEMENTACION CABECERAS------------------------------
	@Override
	public Object getGroup(int groupPosition) {
		return mHeaders.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return mHeaders.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		final String mParenttext = (String) getGroup(groupPosition);
		ViewHolder mHolderParent = new ViewHolder();
		
		if (convertView == null){
			LayoutInflater inflaterexpandable = context.getLayoutInflater();
			convertView = inflaterexpandable.inflate(R.layout.row, null);
			mHolderParent.image = (ImageView) convertView.findViewById(R.id.image);
			mHolderParent.text = (TextView) convertView.findViewById(R.id.tipofruta);
			mHolderParent.check = (CheckBox) convertView.findViewById(R.id.click);
			convertView.setTag(mHolderParent);
		}

		mHolderParent = (ViewHolder) convertView.getTag();
		mHolderParent.image.setImageResource(R.drawable.ic_launcher);
		mHolderParent.text.setText(mParenttext);
		mHolderParent.text.setTypeface(null, Typeface.BOLD_ITALIC);
		
		if(this.getChildrenCount(groupPosition) != 0){
			mHolderParent.image.setVisibility(View.GONE);
			mHolderParent.check.setVisibility(View.GONE);
			//mHolderParent.check.setClickable(false);
		}else{
			mHolderParent.check.setVisibility(View.VISIBLE);
			mHolderParent.image.setVisibility(View.VISIBLE);
		}
			
		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
		
}
