package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.internal.ads.Tw;
import g.AbstractC1678a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1781n extends AutoCompleteTextView {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f13807q = {R.attr.popupBackground};

    /* renamed from: o, reason: collision with root package name */
    public final Tw f13808o;

    /* renamed from: p, reason: collision with root package name */
    public final L f13809p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.autoCompleteTextViewStyle);
        y0.a(context);
        q2.e w2 = q2.e.w(getContext(), attributeSet, f13807q, com.duracodefactory.logiccircuitsimulatorpro.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) w2.f14710q).hasValue(0)) {
            setDropDownBackgroundDrawable(w2.p(0));
        }
        w2.y();
        Tw tw = new Tw(this);
        this.f13808o = tw;
        tw.l(attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.autoCompleteTextViewStyle);
        L l4 = new L(this);
        this.f13809p = l4;
        l4.d(attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.autoCompleteTextViewStyle);
        l4.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13808o;
        if (tw != null) {
            tw.a();
        }
        L l4 = this.f13809p;
        if (l4 != null) {
            l4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13808o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13808o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1895f.t(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f13808o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13808o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.gms.internal.play_billing.B.U(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(AbstractC1678a.a(getContext(), i4));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13808o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13808o;
        if (tw != null) {
            tw.v(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        L l4 = this.f13809p;
        if (l4 != null) {
            l4.e(context, i4);
        }
    }
}
