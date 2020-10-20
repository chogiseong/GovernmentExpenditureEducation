package com.example.homework1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScheduleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScheduleFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScheduleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScheduleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScheduleFragment newInstance(String param1, String param2) {
        ScheduleFragment fragment = new ScheduleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private TextView monday[] = new TextView[7];
    private TextView tuesday[] = new TextView[7];
    private TextView wednesday[] = new TextView[7];
    private TextView thursday[] = new TextView[7];
    private TextView friday[] = new TextView[7];
    private TextView saturday[] = new TextView[7];
    private TextView sunday[] = new TextView[7];
    private Schedule schedule = new Schedule();

    @Override
    public void onActivityCreated(Bundle b){
        super.onActivityCreated(b);
        monday[0] = (TextView) getView().findViewById(R.id.monday0);
        monday[1] = (TextView) getView().findViewById(R.id.monday1);
        monday[2] = (TextView) getView().findViewById(R.id.monday2);
        monday[3] = (TextView) getView().findViewById(R.id.monday3);
        monday[4] = (TextView) getView().findViewById(R.id.monday4);
        monday[5] = (TextView) getView().findViewById(R.id.monday5);
        monday[6] = (TextView) getView().findViewById(R.id.monday6);

        tuesday[0] = (TextView) getView().findViewById(R.id.tuesday0);
        tuesday[1] = (TextView) getView().findViewById(R.id.tuesday1);
        tuesday[2] = (TextView) getView().findViewById(R.id.tuesday2);
        tuesday[3] = (TextView) getView().findViewById(R.id.tuesday3);
        tuesday[4] = (TextView) getView().findViewById(R.id.tuesday4);
        tuesday[5] = (TextView) getView().findViewById(R.id.tuesday5);
        tuesday[6] = (TextView) getView().findViewById(R.id.tuesday6);

        wednesday[0] = (TextView) getView().findViewById(R.id.wednesday0);
        wednesday[1] = (TextView) getView().findViewById(R.id.wednesday1);
        wednesday[2] = (TextView) getView().findViewById(R.id.wednesday2);
        wednesday[3] = (TextView) getView().findViewById(R.id.wednesday3);
        wednesday[4] = (TextView) getView().findViewById(R.id.wednesday4);
        wednesday[5] = (TextView) getView().findViewById(R.id.wednesday5);
        wednesday[6] = (TextView) getView().findViewById(R.id.wednesday6);

        thursday[0] = (TextView) getView().findViewById(R.id.thursday0);
        thursday[1] = (TextView) getView().findViewById(R.id.thursday1);
        thursday[2] = (TextView) getView().findViewById(R.id.thursday2);
        thursday[3] = (TextView) getView().findViewById(R.id.thursday3);
        thursday[4] = (TextView) getView().findViewById(R.id.thursday4);
        thursday[5] = (TextView) getView().findViewById(R.id.thursday5);
        thursday[6] = (TextView) getView().findViewById(R.id.thursday6);

        friday[0] = (TextView) getView().findViewById(R.id.friday0);
        friday[1] = (TextView) getView().findViewById(R.id.friday1);
        friday[2] = (TextView) getView().findViewById(R.id.friday2);
        friday[3] = (TextView) getView().findViewById(R.id.friday3);
        friday[4] = (TextView) getView().findViewById(R.id.friday4);
        friday[5] = (TextView) getView().findViewById(R.id.friday5);
        friday[6] = (TextView) getView().findViewById(R.id.friday6);

        saturday[0] = (TextView) getView().findViewById(R.id.saturday0);
        saturday[1] = (TextView) getView().findViewById(R.id.saturday1);
        saturday[2] = (TextView) getView().findViewById(R.id.saturday2);
        saturday[3] = (TextView) getView().findViewById(R.id.saturday3);
        saturday[4] = (TextView) getView().findViewById(R.id.saturday4);
        saturday[5] = (TextView) getView().findViewById(R.id.saturday5);
        saturday[6] = (TextView) getView().findViewById(R.id.saturday6);

        sunday[0] = (TextView) getView().findViewById(R.id.sunday0);
        sunday[1] = (TextView) getView().findViewById(R.id.sunday1);
        sunday[2] = (TextView) getView().findViewById(R.id.sunday2);
        sunday[3] = (TextView) getView().findViewById(R.id.sunday3);
        sunday[4] = (TextView) getView().findViewById(R.id.sunday4);
        sunday[5] = (TextView) getView().findViewById(R.id.sunday5);
        sunday[6] = (TextView) getView().findViewById(R.id.sunday6);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }
}