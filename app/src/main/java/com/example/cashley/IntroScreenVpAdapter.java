package com.example.cashley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IntroScreenVpAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context iContext;
    List<IntroScreenItems> iList;

    public IntroScreenVpAdapter(Context iContext, List<IntroScreenItems> iList) {
        this.iContext = iContext;
        this.iList = iList;
    }

    @NonNull
    @Override
    public IntroScreenVpAdapter.IntroScreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) iContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.intro_layout_screen,null);



        return new IntroScreenViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImageView img = (ImageView) holder.itemView.findViewById(R.id.intro_img);
        TextView txt1 = (TextView) holder.itemView.findViewById(R.id.intro_txt1);
        TextView txt2 = (TextView) holder.itemView.findViewById(R.id.intro_txt2);

        img.setImageResource(iList.get(position).getImg1());
        txt1.setText(iList.get(position).getText1());
        txt2.setText(iList.get(position).getText2());
    }


    @Override
    public int getItemCount() {
        return iList.size();
    }

    public static class IntroScreenViewHolder extends RecyclerView.ViewHolder{
        public IntroScreenViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
