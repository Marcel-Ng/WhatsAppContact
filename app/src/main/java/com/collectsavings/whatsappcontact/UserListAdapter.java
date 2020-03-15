package com.collectsavings.whatsappcontact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Node;

import java.util.ArrayList;

/**
 * Created by Stanwaves on 12/13/2019.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListViewHolders>{

    ArrayList<UserObject> userList;

    public UserListAdapter(ArrayList<UserObject> userList){
        this.userList = userList;
    }

    @Override
    public UserListViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        UserListViewHolders rcv =  new UserListViewHolders(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(UserListViewHolders holder, int position) {
        holder.mName.setText(userList.get(position).getName());
        holder.mPhone.setText(userList.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class UserListViewHolders extends RecyclerView.ViewHolder{
        public TextView mName, mPhone;
        public UserListViewHolders(View view){
            super(view);

//          the code I was given
//            mName =  view.findViewById(R.id.name);
//            mPhone = view.findViewById(R.id.phone);

            mName =  (TextView) view.findViewById(R.id.name);
            mPhone = (TextView) view.findViewById(R.id.phone);
            

        }
    }
}
