package Y2;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements TextWatcher {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2148o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2149p;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2148o = i4;
        this.f2149p = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void e(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void f(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void g(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void h(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void i(int i4, int i5, int i6, CharSequence charSequence) {
    }

    private final void j(int i4, int i5, int i6, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f2148o) {
            case 0:
                g gVar = (g) this.f2149p;
                if (gVar.f2184a.getSuffixText() != null) {
                    return;
                }
                gVar.d(editable.length() > 0);
                return;
            case 1:
                m mVar = (m) this.f2149p;
                AutoCompleteTextView d = m.d(mVar, mVar.f2184a.getEditText());
                d.post(new Nu(this, d, 28, false));
                return;
            case 2:
                return;
            case 3:
                TextInputLayout textInputLayout = (TextInputLayout) this.f2149p;
                textInputLayout.s(!textInputLayout.f12497V0, false);
                if (textInputLayout.f12527v) {
                    textInputLayout.m(editable.length());
                }
                if (textInputLayout.f12461C) {
                    textInputLayout.t(editable.length());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        switch (this.f2148o) {
            case 0:
            case 1:
                return;
            case 2:
                ((s) this.f2149p).c.setChecked(!s.d(r1));
                return;
            case 3:
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        switch (this.f2148o) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                SearchView searchView = (SearchView) this.f2149p;
                Editable text = searchView.f2556D.getText();
                searchView.f2587m0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.v(!isEmpty);
                int i7 = 8;
                if (searchView.f2586l0 && !searchView.f2579e0 && isEmpty) {
                    searchView.f2561I.setVisibility(8);
                    i7 = 0;
                }
                searchView.f2563K.setVisibility(i7);
                searchView.r();
                searchView.u();
                charSequence.toString();
                return;
        }
    }
}
