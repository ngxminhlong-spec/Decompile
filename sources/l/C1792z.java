package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792z extends SeekBar {

    /* renamed from: o, reason: collision with root package name */
    public final C1753A f13866o;

    public C1792z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C1753A c1753a = new C1753A(this);
        this.f13866o = c1753a;
        c1753a.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1753A c1753a = this.f13866o;
        C1792z c1792z = c1753a.f13573e;
        Drawable drawable = c1753a.f13574f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c1792z.getDrawableState())) {
            c1792z.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13866o.f13574f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13866o.f(canvas);
    }
}
