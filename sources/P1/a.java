package P1;

import D0.o;
import N1.n;
import O1.r;
import Q1.J;
import Q1.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC1161sa;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0347Uc;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.Pq;
import com.google.android.gms.internal.ads.RunnableC0532dm;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import com.google.android.gms.internal.ads.Vl;
import com.google.android.gms.internal.ads.Y9;
import java.util.Collections;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AbstractBinderC1161sa {

    /* renamed from: L, reason: collision with root package name */
    public static final int f1480L = Color.argb(0, 0, 0, 0);

    /* renamed from: C, reason: collision with root package name */
    public o f1483C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1484D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1485E;

    /* renamed from: I, reason: collision with root package name */
    public TextView f1489I;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ int f1491K;

    /* renamed from: p, reason: collision with root package name */
    public final Activity f1492p;

    /* renamed from: q, reason: collision with root package name */
    public AdOverlayInfoParcel f1493q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0308Md f1494r;

    /* renamed from: s, reason: collision with root package name */
    public H1.a f1495s;

    /* renamed from: t, reason: collision with root package name */
    public i f1496t;

    /* renamed from: v, reason: collision with root package name */
    public FrameLayout f1498v;

    /* renamed from: w, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f1499w;

    /* renamed from: z, reason: collision with root package name */
    public d f1501z;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1497u = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1500x = false;
    public boolean y = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1481A = false;

    /* renamed from: J, reason: collision with root package name */
    public int f1490J = 1;

    /* renamed from: B, reason: collision with root package name */
    public final Object f1482B = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f1486F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1487G = false;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1488H = true;

    public a(Activity activity, int i4) {
        this.f1491K = i4;
        this.f1492p = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[Catch: c -> 0x0051, TryCatch #1 {c -> 0x0051, blocks: (B:13:0x0020, B:16:0x003d, B:18:0x0041, B:20:0x0045, B:22:0x004b, B:23:0x0054, B:24:0x005f, B:26:0x006a, B:27:0x006c, B:29:0x0074, B:30:0x0082, B:32:0x0089, B:35:0x0096, B:37:0x009a, B:39:0x009f, B:41:0x00ad, B:43:0x00b1, B:45:0x00b7, B:51:0x00c2, B:54:0x00c5, B:56:0x00c6, B:58:0x00cc, B:59:0x00cf, B:61:0x00d5, B:63:0x00d9, B:64:0x00dc, B:66:0x00e2, B:67:0x00e5, B:74:0x0114, B:76:0x0118, B:77:0x011f, B:78:0x0120, B:80:0x0124, B:82:0x0131, B:84:0x0090, B:86:0x0094, B:87:0x00a9, B:88:0x0135, B:89:0x013c, B:47:0x00b8, B:49:0x00bc), top: B:12:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131 A[Catch: c -> 0x0051, TryCatch #1 {c -> 0x0051, blocks: (B:13:0x0020, B:16:0x003d, B:18:0x0041, B:20:0x0045, B:22:0x004b, B:23:0x0054, B:24:0x005f, B:26:0x006a, B:27:0x006c, B:29:0x0074, B:30:0x0082, B:32:0x0089, B:35:0x0096, B:37:0x009a, B:39:0x009f, B:41:0x00ad, B:43:0x00b1, B:45:0x00b7, B:51:0x00c2, B:54:0x00c5, B:56:0x00c6, B:58:0x00cc, B:59:0x00cf, B:61:0x00d5, B:63:0x00d9, B:64:0x00dc, B:66:0x00e2, B:67:0x00e5, B:74:0x0114, B:76:0x0118, B:77:0x011f, B:78:0x0120, B:80:0x0124, B:82:0x0131, B:84:0x0090, B:86:0x0094, B:87:0x00a9, B:88:0x0135, B:89:0x013c, B:47:0x00b8, B:49:0x00bc), top: B:12:0x0020, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.a.C0(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final boolean G2() {
        this.f1490J = 1;
        if (this.f1494r == null) {
            return true;
        }
        if (((Boolean) r.d.c.a(AbstractC1066q6.P7)).booleanValue() && this.f1494r.canGoBack()) {
            this.f1494r.goBack();
            return false;
        }
        boolean z02 = this.f1494r.z0();
        if (!z02) {
            this.f1494r.b("onbackblocked", Collections.EMPTY_MAP);
        }
        return z02;
    }

    public final void K3(int i4) {
        int i5;
        Activity activity = this.f1492p;
        int i6 = activity.getApplicationInfo().targetSdkVersion;
        C0937n6 c0937n6 = AbstractC1066q6.g5;
        r rVar = r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (i6 < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.h5)).intValue() || (i5 = Build.VERSION.SDK_INT) < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.i5)).intValue() || i5 > ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.j5)).intValue()) {
            try {
                activity.setRequestedOrientation(i4);
            } catch (Throwable th) {
                n.f1204A.f1209g.g("AdOverlay.setRequestedOrientation", th);
            }
        }
    }

    public final void L() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g gVar;
        if (!this.f1492p.isFinishing() || this.f1486F) {
            return;
        }
        this.f1486F = true;
        InterfaceC0308Md interfaceC0308Md = this.f1494r;
        if (interfaceC0308Md != null) {
            interfaceC0308Md.O0(this.f1490J - 1);
            synchronized (this.f1482B) {
                try {
                    if (!this.f1484D && this.f1494r.Y()) {
                        C0937n6 c0937n6 = AbstractC1066q6.f4;
                        r rVar = r.d;
                        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && !this.f1487G && (adOverlayInfoParcel = this.f1493q) != null && (gVar = adOverlayInfoParcel.f3868q) != null) {
                            gVar.y3();
                        }
                        o oVar = new o(9, this);
                        this.f1483C = oVar;
                        N.f1668k.postDelayed(oVar, ((Long) rVar.c.a(AbstractC1066q6.f10133M0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L3(boolean r33) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.a.L3(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void M() {
        g gVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel != null && (gVar = adOverlayInfoParcel.f3868q) != null) {
            gVar.O();
        }
        M3(this.f1492p.getResources().getConfiguration());
        if (((Boolean) r.d.c.a(AbstractC1066q6.h4)).booleanValue()) {
            return;
        }
        InterfaceC0308Md interfaceC0308Md = this.f1494r;
        if (interfaceC0308Md == null || interfaceC0308Md.t()) {
            Y9.s("The webview does not exist. Ignoring action.");
        } else {
            this.f1494r.onResume();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10295v0)).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10291u0)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M3(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f1493q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            N1.h r0 = r0.f3857C
            if (r0 == 0) goto L10
            boolean r0 = r0.f1177p
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            N1.n r3 = N1.n.f1204A
            Q1.O r3 = r3.f1207e
            android.app.Activity r4 = r5.f1492p
            boolean r6 = r3.b(r4, r6)
            boolean r3 = r5.y
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.f10295v0
            O1.r r3 = O1.r.d
            com.google.android.gms.internal.ads.p6 r3 = r3.c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.n6 r6 = com.google.android.gms.internal.ads.AbstractC1066q6.f10291u0
            O1.r r0 = O1.r.d
            com.google.android.gms.internal.ads.p6 r0 = r0.c
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f1493q
            if (r6 == 0) goto L57
            N1.h r6 = r6.f3857C
            if (r6 == 0) goto L57
            boolean r6 = r6.f1182u
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.view.Window r6 = r4.getWindow()
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.f10165T0
            O1.r r3 = O1.r.d
            com.google.android.gms.internal.ads.p6 r3 = r3.c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L78
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7d
        L78:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7d
        L7b:
            r0 = 256(0x100, float:3.59E-43)
        L7d:
            r6.setSystemUiVisibility(r0)
            return
        L81:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L99
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L98
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L98:
            return
        L99:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.a.M3(android.content.res.Configuration):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, P1.h] */
    public final void N3(boolean z4) {
        C0937n6 c0937n6 = AbstractC1066q6.k4;
        r rVar = r.d;
        int intValue = ((Integer) rVar.c.a(c0937n6)).intValue();
        boolean z5 = ((Boolean) rVar.c.a(AbstractC1066q6.f10146P0)).booleanValue() || z4;
        ?? obj = new Object();
        obj.f1515a = 0;
        obj.f1516b = 0;
        obj.c = 0;
        obj.d = 50;
        obj.f1515a = true != z5 ? 0 : intValue;
        obj.f1516b = true != z5 ? intValue : 0;
        obj.c = intValue;
        this.f1496t = new i(this.f1492p, obj, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (!this.f1493q.f3865K || this.f1494r == null) {
            layoutParams.addRule(true != z5 ? 9 : 11);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.f1494r.L().getId());
        }
        O3(z4, this.f1493q.f3872u);
        this.f1501z.addView(this.f1496t, layoutParams);
    }

    public final void O3(boolean z4, boolean z5) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        N1.h hVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        N1.h hVar2;
        C0937n6 c0937n6 = AbstractC1066q6.N0;
        r rVar = r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue();
        boolean z6 = true;
        boolean z7 = booleanValue && (adOverlayInfoParcel2 = this.f1493q) != null && (hVar2 = adOverlayInfoParcel2.f3857C) != null && hVar2.f1183v;
        boolean z8 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10141O0)).booleanValue() && (adOverlayInfoParcel = this.f1493q) != null && (hVar = adOverlayInfoParcel.f3857C) != null && hVar.f1184w;
        if (z4 && z5 && z7 && !z8) {
            InterfaceC0308Md interfaceC0308Md = this.f1494r;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (interfaceC0308Md != null) {
                    interfaceC0308Md.c("onError", put);
                }
            } catch (JSONException e4) {
                Y9.q("Error occurred while dispatching error event.", e4);
            }
        }
        i iVar = this.f1496t;
        if (iVar != null) {
            if (!z8 && (!z5 || z7)) {
                z6 = false;
            }
            ImageButton imageButton = iVar.f1517o;
            if (!z6) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10155R0)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void X1(InterfaceC1812a interfaceC1812a) {
        M3((Configuration) BinderC1813b.C2(interfaceC1812a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void b() {
        g gVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel == null || (gVar = adOverlayInfoParcel.f3868q) == null) {
            return;
        }
        gVar.W2();
    }

    public final void c() {
        this.f1490J = 3;
        Activity activity = this.f1492p;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.y != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void c1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1500x);
    }

    public final void e() {
        InterfaceC0308Md interfaceC0308Md;
        g gVar;
        if (this.f1487G) {
            return;
        }
        this.f1487G = true;
        InterfaceC0308Md interfaceC0308Md2 = this.f1494r;
        if (interfaceC0308Md2 != null) {
            this.f1501z.removeView(interfaceC0308Md2.L());
            H1.a aVar = this.f1495s;
            if (aVar != null) {
                this.f1494r.A((Context) aVar.f858s);
                this.f1494r.y0(false);
                ViewGroup viewGroup = (ViewGroup) this.f1495s.f857r;
                View L4 = this.f1494r.L();
                H1.a aVar2 = this.f1495s;
                viewGroup.addView(L4, aVar2.f855p, (ViewGroup.LayoutParams) aVar2.f856q);
                this.f1495s = null;
            } else {
                Activity activity = this.f1492p;
                if (activity.getApplicationContext() != null) {
                    this.f1494r.A(activity.getApplicationContext());
                }
            }
            this.f1494r = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel != null && (gVar = adOverlayInfoParcel.f3868q) != null) {
            gVar.L2(this.f1490J);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1493q;
        if (adOverlayInfoParcel2 == null || (interfaceC0308Md = adOverlayInfoParcel2.f3869r) == null) {
            return;
        }
        Pq b02 = interfaceC0308Md.b0();
        View L5 = this.f1493q.f3869r.L();
        if (b02 != null) {
            n.f1204A.f1224v.getClass();
            C0347Uc.s(new RunnableC0532dm(b02, L5, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void e3(int i4, String[] strArr, int[] iArr) {
        if (i4 == 12345) {
            Activity activity = this.f1492p;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
            try {
                adOverlayInfoParcel.f3864J.l0(strArr, iArr, new BinderC1813b(new Vl(activity, adOverlayInfoParcel.y == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void g() {
        this.f1490J = 1;
    }

    public final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel != null && this.f1497u) {
            K3(adOverlayInfoParcel.f3875x);
        }
        if (this.f1498v != null) {
            this.f1492p.setContentView(this.f1501z);
            this.f1485E = true;
            this.f1498v.removeAllViews();
            this.f1498v = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f1499w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f1499w = null;
        }
        this.f1497u = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void j2(int i4, int i5, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void n() {
        g gVar;
        h();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1493q;
        if (adOverlayInfoParcel != null && (gVar = adOverlayInfoParcel.f3868q) != null) {
            gVar.q1();
        }
        if (!((Boolean) r.d.c.a(AbstractC1066q6.h4)).booleanValue() && this.f1494r != null && (!this.f1492p.isFinishing() || this.f1495s == null)) {
            this.f1494r.onPause();
        }
        L();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void p() {
    }

    public final void p1() {
        synchronized (this.f1482B) {
            try {
                this.f1484D = true;
                o oVar = this.f1483C;
                if (oVar != null) {
                    J j4 = N.f1668k;
                    j4.removeCallbacks(oVar);
                    j4.post(this.f1483C);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void q() {
        InterfaceC0308Md interfaceC0308Md = this.f1494r;
        if (interfaceC0308Md != null) {
            try {
                this.f1501z.removeView(interfaceC0308Md.L());
            } catch (NullPointerException unused) {
            }
        }
        L();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void s() {
        if (((Boolean) r.d.c.a(AbstractC1066q6.h4)).booleanValue() && this.f1494r != null && (!this.f1492p.isFinishing() || this.f1495s == null)) {
            this.f1494r.onPause();
        }
        L();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void w() {
        this.f1485E = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void x() {
        if (((Boolean) r.d.c.a(AbstractC1066q6.h4)).booleanValue()) {
            InterfaceC0308Md interfaceC0308Md = this.f1494r;
            if (interfaceC0308Md == null || interfaceC0308Md.t()) {
                Y9.s("The webview does not exist. Ignoring action.");
            } else {
                this.f1494r.onResume();
            }
        }
    }
}
