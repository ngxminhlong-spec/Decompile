package l;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.AbstractC1678a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784q extends CheckedTextView {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f13818p = {R.attr.checkMark};

    /* renamed from: o, reason: collision with root package name */
    public final L f13819o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        y0.a(context);
        L l4 = new L(this);
        this.f13819o = l4;
        l4.d(attributeSet, R.attr.checkedTextViewStyle);
        l4.b();
        q2.e w2 = q2.e.w(getContext(), attributeSet, f13818p, R.attr.checkedTextViewStyle);
        setCheckMarkDrawable(w2.p(0));
        w2.y();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L l4 = this.f13819o;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1895f.t(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(AbstractC1678a.a(getContext(), i4));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.gms.internal.play_billing.B.U(callback, this));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        L l4 = this.f13819o;
        if (l4 != null) {
            l4.e(context, i4);
        }
    }
}
