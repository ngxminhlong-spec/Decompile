package C0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0010j implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f332b;

    public ViewOnFocusChangeListenerC0010j(D d, View view) {
        this.f332b = d;
        this.f331a = view;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        InputMethodManager inputMethodManager;
        if (z4) {
            return;
        }
        D d = this.f332b;
        if (d.h() == null || (inputMethodManager = (InputMethodManager) d.h().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.f331a.getWindowToken(), 0);
    }
}
