package Y2;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2151b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f2150a = i4;
        this.f2151b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f2150a) {
            case 0:
                ((g) this.f2151b).d(!TextUtils.isEmpty(((EditText) view).getText()) && z4);
                return;
            case 1:
                m mVar = (m) this.f2151b;
                mVar.f2184a.setEndIconActivated(z4);
                if (z4) {
                    return;
                }
                mVar.g(false);
                mVar.f2176i = false;
                return;
            default:
                SearchView searchView = (SearchView) this.f2151b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2576b0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    return;
                }
                return;
        }
    }
}
