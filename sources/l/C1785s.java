package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.Tw;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1785s extends EditText {

    /* renamed from: o, reason: collision with root package name */
    public final Tw f13822o;

    /* renamed from: p, reason: collision with root package name */
    public final L f13823p;

    /* renamed from: q, reason: collision with root package name */
    public final C1789w f13824q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        y0.a(context);
        Tw tw = new Tw(this);
        this.f13822o = tw;
        tw.l(attributeSet, R.attr.editTextStyle);
        L l4 = new L(this);
        this.f13823p = l4;
        l4.d(attributeSet, R.attr.editTextStyle);
        l4.b();
        C1789w c1789w = new C1789w();
        c1789w.f13839b = this;
        this.f13824q = c1789w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13822o;
        if (tw != null) {
            tw.a();
        }
        L l4 = this.f13823p;
        if (l4 != null) {
            l4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13822o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13822o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1789w c1789w;
        TextClassifier textClassifier;
        if (Build.VERSION.SDK_INT >= 28 || (c1789w = this.f13824q) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier2 = (TextClassifier) c1789w.c;
        if (textClassifier2 != null) {
            return textClassifier2;
        }
        TextClassificationManager c = J.c(((TextView) c1789w.f13839b).getContext().getSystemService(B0.s.k()));
        if (c == null) {
            return TextClassifier.NO_OP;
        }
        textClassifier = c.getTextClassifier();
        return textClassifier;
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
        Tw tw = this.f13822o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13822o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.gms.internal.play_billing.B.U(callback, this));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13822o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13822o;
        if (tw != null) {
            tw.v(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        L l4 = this.f13823p;
        if (l4 != null) {
            l4.e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1789w c1789w;
        if (Build.VERSION.SDK_INT >= 28 || (c1789w = this.f13824q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1789w.c = textClassifier;
        }
    }
}
