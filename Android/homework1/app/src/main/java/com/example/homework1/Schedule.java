package com.example.homework1;

import android.content.Context;
import android.widget.TextView;

public class Schedule {

    private String monday[] = new String[7];
    private String tuesday[] = new String[7];
    private String wednesday[] = new String[7];
    private String thursday[] = new String[7];
    private String friday[] = new String[7];
    private String saturday[] = new String[7];
    private String sunday[] = new String[7];

    public Schedule(){
        for(int i =0; i<7; i++){
            monday[i] = "";
            tuesday[i] = "";
            wednesday[i] = "";
            thursday[i] = "";
            friday[i] = "";
            saturday[i] = "";
            sunday[i] = "";
        }
    }

    public void addSchedule(String scheduleText){
        int temp;
        if((temp = scheduleText.indexOf("월"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("화"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("수"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("목"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("금"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("토"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    saturday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
        if((temp = scheduleText.indexOf("일"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    sunday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "약속";

                }
            }
        }
    }
    public boolean validate(String scheduleText){
        if(scheduleText.equals(""))
        {
            return true;
        }
        int temp;
        if((temp = scheduleText.indexOf("월"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("화"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("수"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("목"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("금"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("토"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!saturday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("일"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    if(!sunday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals(""));
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public void addSchedule(String scheduleText, String freetimeTitle, String freetimeMaster){
        String Master;
        if(freetimeMaster.equals(""))
        {
            Master = "";
        }
        else
        {
            Master = "(" + freetimeMaster + ")";
        }
        int temp;
        if((temp = scheduleText.indexOf("월"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("화"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("수"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("목"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("금"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("토"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    saturday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
        if((temp = scheduleText.indexOf("일"))>-1)
        {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i = temp; i < scheduleText.length() && scheduleText.charAt(i) !=':'; i++)
            {
                if(scheduleText.charAt(i) == '[')
                {
                    startPoint = i;
                }
                if(scheduleText.charAt(i)==']')
                {
                    endPoint = i;
                    sunday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = freetimeTitle + Master;

                }
            }
        }
    }

    public void setting(TextView[] monday, TextView[] tuesday,TextView[] wednesday,TextView[] thursday,TextView[] friday,TextView[] saturday,TextView[] sunday, Context context) {
        for (int i = 0; i < 7; i++) {
            if (!this.monday[i].equals("")) {
                if (!this.monday[i].equals("")) {
                    monday[i].setText(this.monday[i]);
                    monday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.tuesday[i].equals("")) {
                    tuesday[i].setText(this.tuesday[i]);
                    tuesday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.wednesday[i].equals("")) {
                    wednesday[i].setText(this.wednesday[i]);
                    wednesday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.thursday[i].equals("")) {
                    thursday[i].setText(this.thursday[i]);
                    thursday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.friday[i].equals("")) {
                    friday[i].setText(this.friday[i]);
                    friday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.saturday[i].equals("")) {
                    saturday[i].setText(this.saturday[i]);
                    saturday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
                if (!this.sunday[i].equals("")) {
                    sunday[i].setText(this.sunday[i]);
                    sunday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
                }
            }

        }
    }
}
