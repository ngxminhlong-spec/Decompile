package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770h0 extends C1764e0 implements InterfaceC1766f0 {

    /* renamed from: R, reason: collision with root package name */
    public static final Method f13761R;

    /* renamed from: Q, reason: collision with root package name */
    public C1748e f13762Q;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13761R = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.InterfaceC1766f0
    public final void a(k.m mVar, k.p pVar) {
        C1748e c1748e = this.f13762Q;
        if (c1748e != null) {
            c1748e.a(mVar, pVar);
        }
    }

    @Override // l.InterfaceC1766f0
    public final void d(k.m mVar, MenuItem menuItem) {
        C1748e c1748e = this.f13762Q;
        if (c1748e != null) {
            c1748e.d(mVar, menuItem);
        }
    }

    @Override // l.C1764e0
    public final V q(Context context, boolean z4) {
        C1768g0 c1768g0 = new C1768g0(context, z4);
        c1768g0.setHoverListener(this);
        return c1768g0;
    }
}
