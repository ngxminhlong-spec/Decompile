package Y2;

import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2171a;

    public l(m mVar) {
        this.f2171a = mVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        m mVar = this.f2171a;
        mVar.f2176i = true;
        mVar.f2178k = System.currentTimeMillis();
        mVar.g(false);
    }
}
