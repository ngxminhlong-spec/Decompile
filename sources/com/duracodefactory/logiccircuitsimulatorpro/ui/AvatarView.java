package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import g.AbstractC1678a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AvatarView extends AppCompatImageView {

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3577q;

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void b() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        Drawable drawable = this.f3577q;
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            super.setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap copy = bitmap.copy(config, true);
        int width = getWidth();
        if (copy.getWidth() != width || copy.getHeight() != width) {
            float min = Math.min(copy.getWidth(), copy.getHeight()) / width;
            copy = Bitmap.createScaledBitmap(copy, (int) (copy.getWidth() / min), (int) (copy.getHeight() / min), false);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, width, width);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        canvas.drawARGB(0, 0, 0, 0);
        float f4 = width / 2.0f;
        canvas.drawCircle(f4, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(copy, rect, rect, paint);
        super.setImageDrawable(new BitmapDrawable(getResources(), createBitmap));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f3577q = new BitmapDrawable(getResources(), bitmap);
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f3577q = drawable;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        setImageDrawable(AbstractC1678a.a(getContext(), i4));
    }
}
