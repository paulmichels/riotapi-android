package com.endive.dummy.bindings;

import android.annotation.SuppressLint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class AppBindingAdapters {

    @SuppressLint("CheckResult")
    @BindingAdapter(value = {"image", "placeholder", "error", "rounded"}, requireAll = false)
    public static void loadImage(ImageView imageView, Object image, Object placeholder, Object error, Boolean rounded) {
        if(image != null){
            RequestOptions requestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL);
            RequestBuilder glideBuilder = Glide.with(imageView.getContext()).load(image).centerCrop();
            RequestBuilder glideErrorBuilder = Glide.with(imageView.getContext()).load(placeholder).centerCrop();

            if (placeholder != null) {
                glideBuilder.placeholder((Drawable) placeholder);
            }
            if(error != null){
                glideBuilder.error(glideErrorBuilder);
            }
            if (rounded != null && rounded) {
                requestOptions.apply(RequestOptions.circleCropTransform());
            }
            glideBuilder.apply(requestOptions);
            glideErrorBuilder.apply(requestOptions);
            glideBuilder.into(imageView);
        }
    }

}
