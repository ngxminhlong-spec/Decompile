package Y2;

import H.A;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f2153b;

    public /* synthetic */ c(n nVar, int i4) {
        this.f2152a = i4;
        this.f2153b = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        int i4 = this.f2152a;
        n nVar = this.f2153b;
        int i5 = 0;
        switch (i4) {
            case 0:
                g gVar = (g) nVar;
                a aVar = gVar.d;
                EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(editText.hasFocus() && editText.getText().length() > 0);
                textInputLayout.setEndIconCheckable(false);
                editText.setOnFocusChangeListener(gVar.f2160e);
                editText.removeTextChangedListener(aVar);
                editText.addTextChangedListener(aVar);
                return;
            case 1:
                m mVar = (m) nVar;
                a aVar2 = mVar.d;
                AutoCompleteTextView d = m.d(mVar, textInputLayout.getEditText());
                TextInputLayout textInputLayout2 = mVar.f2184a;
                int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    d.setDropDownBackgroundDrawable(mVar.f2180m);
                } else if (boxBackgroundMode == 1) {
                    d.setDropDownBackgroundDrawable(mVar.f2179l);
                }
                if (d.getKeyListener() == null) {
                    int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                    V2.g boxBackground = textInputLayout2.getBoxBackground();
                    int m4 = AbstractC1895f.m(d, R.attr.colorControlHighlight);
                    int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int m5 = AbstractC1895f.m(d, R.attr.colorSurface);
                        V2.g gVar2 = new V2.g(boxBackground.f1880o.f1854a);
                        int r4 = AbstractC1895f.r(m4, m5, 0.1f);
                        gVar2.i(new ColorStateList(iArr, new int[]{r4, 0}));
                        gVar2.setTint(m5);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{r4, m5});
                        V2.g gVar3 = new V2.g(boxBackground.f1880o.f1854a);
                        gVar3.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), boxBackground});
                        WeakHashMap weakHashMap = A.f779a;
                        d.setBackground(layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC1895f.r(m4, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                        WeakHashMap weakHashMap2 = A.f779a;
                        d.setBackground(rippleDrawable);
                    }
                }
                d.setOnTouchListener(new k(i5, mVar, d));
                d.setOnFocusChangeListener(mVar.f2172e);
                d.setOnDismissListener(new l(mVar));
                d.setThreshold(0);
                d.removeTextChangedListener(aVar2);
                d.addTextChangedListener(aVar2);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                textInputLayout.setTextInputAccessibilityDelegate(mVar.f2173f);
                textInputLayout.setEndIconVisible(true);
                return;
            default:
                EditText editText2 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                s sVar = (s) nVar;
                sVar.c.setChecked(!s.d(sVar));
                a aVar3 = sVar.d;
                editText2.removeTextChangedListener(aVar3);
                editText2.addTextChangedListener(aVar3);
                return;
        }
    }
}
