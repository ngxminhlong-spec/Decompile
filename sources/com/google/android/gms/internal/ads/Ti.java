package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ti {

    /* renamed from: a, reason: collision with root package name */
    public final Oj f7063a;

    /* renamed from: b, reason: collision with root package name */
    public final Aj f7064b;
    public Si c = null;

    public Ti(Oj oj, Aj aj) {
        this.f7063a = oj;
        this.f7064b = aj;
    }

    public static final int b(int i4, Context context, String str) {
        try {
            i4 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        return C1335wc.l(context, i4);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        C0348Ud a4 = this.f7063a.a(O1.X0.i(), null, null);
        a4.setVisibility(4);
        a4.setContentDescription("policy_validator");
        a4.A0("/sendMessageToSdk", new X7(7, this));
        a4.A0("/hideValidatorOverlay", new Qi(this, windowManager, frameLayout));
        a4.A0("/open", new C0853l8(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a4);
        Qi qi = new Qi(this, frameLayout, windowManager);
        Aj aj = this.f7064b;
        aj.c("/loadNativeAdPolicyViolations", new C1471zj(aj, weakReference, "/loadNativeAdPolicyViolations", qi));
        aj.c("/showValidatorOverlay", new C1471zj(aj, new WeakReference(a4), "/showValidatorOverlay", C0427b8.f8212u));
        return a4;
    }
}
