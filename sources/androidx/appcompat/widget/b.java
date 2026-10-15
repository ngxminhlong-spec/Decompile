package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SearchView f2640o;

    public b(SearchView searchView) {
        this.f2640o = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        SearchView searchView = this.f2640o;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2556D;
        if (searchView.f2590p0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i4 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f2590p0 != null && searchView.f2580f0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i4 == 66 || i4 == 84 || i4 == 61) {
                    searchView.n(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i4 == 21 || i4 == 22) {
                    searchAutoComplete.setSelection(i4 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    Method method = SearchView.f2555u0.c;
                    if (method != null) {
                        try {
                            method.invoke(searchAutoComplete, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
                if (i4 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
