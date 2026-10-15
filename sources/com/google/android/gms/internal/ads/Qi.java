package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Qi implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6675o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ti f6676p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f6677q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WindowManager f6678r;

    public /* synthetic */ Qi(Ti ti, View view, WindowManager windowManager) {
        this.f6676p = ti;
        this.f6677q = view;
        this.f6678r = windowManager;
    }

    public /* synthetic */ Qi(Ti ti, WindowManager windowManager, View view) {
        this.f6676p = ti;
        this.f6678r = windowManager;
        this.f6677q = view;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.Si] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f6675o) {
            case 0:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                Y9.m("Hide native ad policy validator overlay.");
                interfaceC0308Md.L().setVisibility(8);
                if (interfaceC0308Md.L().getWindowToken() != null) {
                    this.f6678r.removeView(interfaceC0308Md.L());
                }
                interfaceC0308Md.destroy();
                ViewTreeObserver viewTreeObserver = this.f6677q.getViewTreeObserver();
                Ti ti = this.f6676p;
                if (ti.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(ti.c);
                return;
            default:
                final InterfaceC0308Md interfaceC0308Md2 = (InterfaceC0308Md) obj;
                C0396ae H3 = interfaceC0308Md2.H();
                Ti ti2 = this.f6676p;
                H3.f8147u = new C0258Da(21, ti2, map);
                if (map == null) {
                    return;
                }
                final View view = this.f6677q;
                Context context = view.getContext();
                String str = (String) map.get("validator_width");
                C0937n6 c0937n6 = AbstractC1066q6.a7;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
                int b4 = Ti.b(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).intValue(), context, str);
                int b5 = Ti.b(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.b7)).intValue(), context, (String) map.get("validator_height"));
                int b6 = Ti.b(0, context, (String) map.get("validator_x"));
                int b7 = Ti.b(0, context, (String) map.get("validator_y"));
                interfaceC0308Md2.p0(new C0887m(1, b4, b5));
                try {
                    interfaceC0308Md2.m0().getSettings().setUseWideViewPort(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.c7)).booleanValue());
                    interfaceC0308Md2.m0().getSettings().setLoadWithOverviewMode(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.d7)).booleanValue());
                } catch (NullPointerException unused) {
                }
                final WindowManager.LayoutParams X4 = com.google.android.gms.internal.play_billing.B.X();
                X4.x = b6;
                X4.y = b7;
                View L4 = interfaceC0308Md2.L();
                final WindowManager windowManager = this.f6678r;
                windowManager.updateViewLayout(L4, X4);
                final String str2 = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    final int i4 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - b7;
                    ti2.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Si
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            Rect rect2 = new Rect();
                            if (view.getGlobalVisibleRect(rect2)) {
                                InterfaceC0308Md interfaceC0308Md3 = interfaceC0308Md2;
                                if (interfaceC0308Md3.L().getWindowToken() == null) {
                                    return;
                                }
                                String str3 = str2;
                                boolean equals = "1".equals(str3);
                                int i5 = i4;
                                WindowManager.LayoutParams layoutParams = X4;
                                if (equals || "2".equals(str3)) {
                                    layoutParams.y = rect2.bottom - i5;
                                } else {
                                    layoutParams.y = rect2.top - i5;
                                }
                                windowManager.updateViewLayout(interfaceC0308Md3.L(), layoutParams);
                            }
                        }
                    };
                    ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.addOnScrollChangedListener(ti2.c);
                    }
                }
                String str3 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                interfaceC0308Md2.loadUrl(str3);
                return;
        }
    }
}
