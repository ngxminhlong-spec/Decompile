package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791y extends RatingBar {

    /* renamed from: o, reason: collision with root package name */
    public final C1789w f13864o;

    public C1791y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C1789w c1789w = new C1789w(this, 0);
        this.f13864o = c1789w;
        c1789w.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmap = (Bitmap) this.f13864o.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }
}
