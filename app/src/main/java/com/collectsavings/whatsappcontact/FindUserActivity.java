package com.collectsavings.whatsappcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FindUserActivity extends AppCompatActivity {

    //note: if you are using a verison of gradle athat is 3.4 or grearer
    //you can actually use     implementation 'com.android.support:recyclerview-v7:28.0.0'

    private RecyclerView mUserList;
    private  RecyclerView.Adapter mUserListAdapter;
    private RecyclerView.LayoutManager mUserListLayoutmanager;

    ArrayList<UserObject> userList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_user);

        userList = new ArrayList<>();

        initializeRecylerView();
    }

    private void initializeRecylerView() {
        mUserList = (RecyclerView) findViewById(R.id.userList);
        mUserList.setNestedScrollingEnabled(false);
        mUserList.setHasFixedSize(false);
//        the false in the line below had a prefix. and the instructor said is optional
        mUserListLayoutmanager = new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false);
        mUserList.setLayoutManager(mUserListLayoutmanager);
        mUserListAdapter = new UserListAdapter(userList);
        mUserList.setAdapter(mUserListAdapter);
    }
}
