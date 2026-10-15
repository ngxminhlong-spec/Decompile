package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import k.C1745b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769h extends AppCompatImageView implements InterfaceC1775k {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1773j f13760q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769h(C1773j c1773j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f13760q = c1773j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        android.support.v4.media.session.a.s(this, getContentDescription());
        setOnTouchListener(new C1745b(this, this));
    }

    @Override // l.InterfaceC1775k
    public final boolean a() {
        return false;
    }

    @Override // l.InterfaceC1775k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f13760q.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
