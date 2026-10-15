package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f2641o;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2641o = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2641o;
        if (searchAutoComplete.f2597t) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2597t = false;
        }
    }
}
