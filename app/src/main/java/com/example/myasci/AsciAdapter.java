package com.example.myasci;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AsciAdapter extends RecyclerView.Adapter<AsciAdapter.AsciViewHolder> {

    private ArrayList<AsciIModel> listAnggota;

    public AsciAdapter(ArrayList<AsciIModel> listAnggota) {
        this.listAnggota = listAnggota;
    }

    @NonNull
    @Override
    public AsciViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_anggota, viewGroup, false);
        return new AsciViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsciViewHolder asciViewHolder, int position) {
        asciViewHolder.binding(listAnggota.get(position));
    }

    @Override
    public int getItemCount() {
        return listAnggota.size();
    }

    public int getItemViewType(int position) {
        listAnggota.get(position);
        return position;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    /**
     * CLASS VIEW HOLDER
     */
    public class AsciViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgPhoto;
        TextView name, email;
        ProgressBar progressBar;

        public AsciViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            name = itemView.findViewById(R.id.tv_item_name);
            email = itemView.findViewById(R.id.tv_item_email);
            progressBar = itemView.findViewById(R.id.progress_bar_img);
        }

        public void binding(AsciIModel asciIModel){

            name.setText(asciIModel.getNama());
            email.setText(asciIModel.getEmail());

            Glide.with(itemView.getContext())
                    .load(asciIModel.getPhoto())
                    .apply(new RequestOptions().override(250, 250))
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .into(imgPhoto);

        }
    }
}
