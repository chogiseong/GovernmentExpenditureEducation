package com.smartfarm.www.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.smartfarm.www.R;
import com.smartfarm.www.network.RetrofitClient;
import com.smartfarm.www.network.ServiceApi;

public class MypageActivity extends Fragment {
    private View view;

    private TextView mypage_nickname, mypage_email, mypage_location;
    private Button changemyinformation_button, notification_button, event_button, inquiry_button, version_button;
    private ServiceApi service;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.mypage_page,container,false);

        mypage_nickname = view.findViewById(R.id.mypage_nickname);
        mypage_email = view.findViewById(R.id.mypage_email);
        mypage_location = view.findViewById(R.id.mypage_location);
        changemyinformation_button = view.findViewById(R.id.changemyinformation_button);
        notification_button = view.findViewById(R.id.notification_button);
        event_button = view.findViewById(R.id.event_button);
        inquiry_button = view.findViewById(R.id.inquiry_button);
        version_button = view.findViewById(R.id.version_button);

        service = RetrofitClient.getClient().create(ServiceApi.class);

        changemyinformation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ChangeMyInformationActivity.class);
                startActivity(intent);
            }
        });

        notification_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NotificationActivity.class);
                startActivity(intent);
            }
        });

        event_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EventActivity.class);
                startActivity(intent);
            }
        });

        inquiry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), InquiryActivity.class);
                startActivity(intent);
            }
        });

        version_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), VersionActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}