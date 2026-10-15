package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import android.webkit.WebView;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0801k implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9237o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f9238p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f9239q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f9240r;

    public RunnableC0801k(I4 i4, E4 e4, WebView webView, boolean z4) {
        this.f9237o = 2;
        this.f9240r = i4;
        this.f9239q = webView;
        this.f9238p = new H4(this, e4, webView, z4);
    }

    public RunnableC0801k(TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc, String str, String str2) {
        this.f9237o = 4;
        this.f9240r = textureViewSurfaceTextureListenerC0312Nc;
        this.f9238p = str;
        this.f9239q = str2;
    }

    public /* synthetic */ RunnableC0801k(Object obj, Object obj2, Object obj3, int i4) {
        this.f9237o = i4;
        this.f9238p = obj;
        this.f9239q = obj2;
        this.f9240r = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    @Override // java.lang.Runnable
    public final void run() {
        E2 e22;
        int i4 = 0;
        switch (this.f9237o) {
            case 0:
                C0258Da c0258Da = (C0258Da) this.f9238p;
                C0976o2 c0976o2 = (C0976o2) this.f9239q;
                WB wb = (WB) this.f9240r;
                c0258Da.getClass();
                int i5 = AbstractC0751is.f9071a;
                VC vc = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9386E;
                OC j4 = vc.j();
                vc.e(j4, 1017, new C0388aC(j4, c0976o2, wb));
                return;
            case 1:
                ((D2) this.f9238p).l();
                B0.c cVar = (B0.c) this.f9239q;
                F2 f22 = (F2) cVar.f70r;
                if (f22 == null) {
                    ((D2) this.f9238p).e(cVar.f68p);
                } else {
                    D2 d22 = (D2) this.f9238p;
                    synchronized (d22.f4575s) {
                        e22 = d22.f4576t;
                    }
                    e22.f(f22);
                }
                if (((B0.c) this.f9239q).f67o) {
                    ((D2) this.f9238p).d("intermediate-response");
                } else {
                    ((D2) this.f9238p).f("done");
                }
                Runnable runnable = (Runnable) this.f9240r;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                H4 h4 = (H4) this.f9238p;
                WebView webView = (WebView) this.f9239q;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", h4);
                        return;
                    } catch (Throwable unused) {
                        h4.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                C0356Wb c0356Wb = (C0356Wb) this.f9238p;
                InterfaceC0351Vb interfaceC0351Vb = (InterfaceC0351Vb) this.f9239q;
                String str = (String) this.f9240r;
                AtomicReference atomicReference = c0356Wb.f7454j;
                if (((InterfaceC0609fe) atomicReference.get()) != null) {
                    try {
                        interfaceC0351Vb.a((InterfaceC0609fe) atomicReference.get());
                        return;
                    } catch (Exception unused2) {
                        c0356Wb.c(str, false);
                        return;
                    }
                }
                return;
            case 4:
                C0337Sc c0337Sc = ((TextureViewSurfaceTextureListenerC0312Nc) this.f9240r).f6324D;
                if (c0337Sc != null) {
                    c0337Sc.c("error", "what", (String) this.f9238p, "extra", (String) this.f9239q);
                    return;
                }
                return;
            case 5:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f9238p;
                String str2 = (String) this.f9239q;
                C0242Ac c0242Ac = (C0242Ac) this.f9240r;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                Xl.e(sQLiteDatabase, c0242Ac);
                return;
            case 6:
                Cm cm = (Cm) this.f9238p;
                InterfaceFutureC0239a o02 = Bs.o0(((C1345wm) cm.d).a((Ep) this.f9239q, (C1434yp) this.f9240r), r3.f11491R, TimeUnit.SECONDS, (ScheduledExecutorService) cm.f4543f);
                o02.a(new Nu(i4, o02, new C1384xi(13, cm)), cm.c);
                return;
            case 7:
                Oq oq = (Oq) this.f9238p;
                String str3 = (String) this.f9239q;
                Eq eq = (Eq) this.f9240r;
                Aq f4 = Zf.f(oq.f6528a, 14);
                f4.f();
                f4.b(oq.c.o(str3));
                if (eq == null) {
                    oq.d.b(f4.l());
                    return;
                } else {
                    eq.a(f4);
                    eq.g();
                    return;
                }
            case 8:
                C1372xC c1372xC = (C1372xC) this.f9238p;
                C1009ot c1009ot = (C1009ot) this.f9239q;
                C1202tE c1202tE = (C1202tE) this.f9240r;
                VC vc2 = c1372xC.c;
                Gt f5 = c1009ot.f();
                AA aa = vc2.f7254u;
                aa.getClass();
                C0381a5 c0381a5 = vc2.f7251r;
                c0381a5.getClass();
                c0381a5.f8078q = AbstractC1137rt.r(f5);
                if (!f5.isEmpty()) {
                    c0381a5.f8076o = (C1202tE) f5.get(0);
                    c1202tE.getClass();
                    c0381a5.f8081t = c1202tE;
                }
                if (((C1202tE) c0381a5.f8080s) == null) {
                    c0381a5.f8080s = C0381a5.y(aa, (AbstractC1137rt) c0381a5.f8078q, (C1202tE) c0381a5.f8076o, (C1210tg) c0381a5.f8077p);
                }
                c0381a5.B(aa.k1());
                return;
            case 9:
                Pair pair = (Pair) this.f9239q;
                ((EC) ((Qw) this.f9238p).f6711q).f4861h.g(((Integer) pair.first).intValue(), (C1202tE) pair.second, (C1074qE) this.f9240r);
                return;
            case 10:
                C0831kn c0831kn = (C0831kn) this.f9238p;
                C0976o2 c0976o22 = (C0976o2) this.f9239q;
                WB wb2 = (WB) this.f9240r;
                c0831kn.getClass();
                int i6 = AbstractC0751is.f9071a;
                VC vc3 = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
                OC j5 = vc3.j();
                vc3.e(j5, 1009, new TC(j5, c0976o22, wb2));
                return;
            default:
                this.f9239q.g(0, (C1202tE) ((C0831kn) this.f9238p).f9319p, (C1074qE) this.f9240r);
                return;
        }
    }
}
