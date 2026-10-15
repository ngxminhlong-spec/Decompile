package H;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0043s implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public a0 f835a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f836b;
    public final /* synthetic */ InterfaceC0035j c;

    public ViewOnApplyWindowInsetsListenerC0043s(View view, InterfaceC0035j interfaceC0035j) {
        this.f836b = view;
        this.c = interfaceC0035j;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        a0 d = a0.d(windowInsets, view);
        int i4 = Build.VERSION.SDK_INT;
        InterfaceC0035j interfaceC0035j = this.c;
        if (i4 < 30) {
            AbstractC0044t.a(windowInsets, this.f836b);
            if (d.equals(this.f835a)) {
                return interfaceC0035j.m(view, d).c();
            }
        }
        this.f835a = d;
        a0 m4 = interfaceC0035j.m(view, d);
        if (i4 >= 30) {
            return m4.c();
        }
        WeakHashMap weakHashMap = A.f779a;
        r.c(view);
        return m4.c();
    }
}
