package com.lx.framework.utils;

import android.graphics.drawable.Drawable;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

public class UIUtils {
    private UIUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * Returns a color associated with a particular resource ID.
     *
     * @param id The desired resource identifier.
     * @return a color associated with a particular resource ID
     */
    public static int getColor(@ColorRes int id) {
        return ContextCompat.getColor(Utils.getContext(), id);
    }

    public static Drawable getDrawable(@DrawableRes int id){
        return ContextCompat.getDrawable(Utils.getContext(),id);
    }

    public static String getString(@StringRes int id){
        return Utils.getContext().getResources().getString(id);
    }

    public static String getString(@StringRes int id,Object... formatArgs){
        return Utils.getContext().getResources().getString(id,formatArgs);
    }
}
