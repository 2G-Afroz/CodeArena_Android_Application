package com.gg.codearena;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Map;

public class LanguagesRvAdapter extends RecyclerView.Adapter<LanguagesRvAdapter.LanguageViewHolder> {

    private final int[] logo_id;
    private final String[] lang_contents;
    private static Context context;
    public LanguagesRvAdapter(Context context, int[] logo_id, String[] lang_contents) {
        this.logo_id = logo_id;
        this.lang_contents = lang_contents;
        this.context = context;
    }

    @NonNull
    @Override
    public LanguagesRvAdapter.LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_language_card, parent, false);
        return new LanguageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguagesRvAdapter.LanguageViewHolder holder, int position) {
        holder.iv_img_lang.setImageResource(logo_id[position]);
        holder.tv_lang_content.setText(lang_contents[position]);
    }

    @Override
    public int getItemCount() {
        return logo_id.length;
    }

    public static class LanguageViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_img_lang;
        TextView tv_lang_content;
        CardView cv_lang_card;

        public LanguageViewHolder(@NonNull View itemView){
            super(itemView);
            iv_img_lang = itemView.findViewById(R.id.iv_img_lang);
            tv_lang_content = itemView.findViewById(R.id.tv_lang_content);
            cv_lang_card = itemView.findViewById(R.id.cv_language_card);

            // Adding Click event to the cardView
            cv_lang_card.setOnClickListener(v -> {
                Intent intent = new Intent(context, QuizActivity.class);
                context.startActivity(intent);
            });
        }

    }
}
