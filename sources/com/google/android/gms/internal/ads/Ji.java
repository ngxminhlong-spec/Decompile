package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ji extends AbstractBinderC1238u7 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Ui {

    /* renamed from: D, reason: collision with root package name */
    public static final Gt f5875D;

    /* renamed from: A, reason: collision with root package name */
    public boolean f5876A;

    /* renamed from: C, reason: collision with root package name */
    public GestureDetector f5878C;

    /* renamed from: p, reason: collision with root package name */
    public final String f5879p;

    /* renamed from: r, reason: collision with root package name */
    public FrameLayout f5881r;

    /* renamed from: s, reason: collision with root package name */
    public FrameLayout f5882s;

    /* renamed from: t, reason: collision with root package name */
    public final C0260Dc f5883t;

    /* renamed from: u, reason: collision with root package name */
    public View f5884u;

    /* renamed from: w, reason: collision with root package name */
    public C1427yi f5886w;

    /* renamed from: x, reason: collision with root package name */
    public A4 f5887x;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1024p7 f5888z;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f5880q = new HashMap();
    public InterfaceC1812a y = null;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5877B = false;

    /* renamed from: v, reason: collision with root package name */
    public final int f5885v = 234310000;

    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Object[] objArr = {"2011", "1009", "3010"};
        Bs.D(3, objArr);
        f5875D = AbstractC1137rt.q(3, objArr);
    }

    public Ji(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f5881r = frameLayout;
        this.f5882s = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f5879p = str;
        C1016p c1016p = N1.n.f1204A.f1227z;
        ViewTreeObserverOnGlobalLayoutListenerC0292Jc viewTreeObserverOnGlobalLayoutListenerC0292Jc = new ViewTreeObserverOnGlobalLayoutListenerC0292Jc(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0292Jc.f3928o).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0292Jc.r1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0297Kc viewTreeObserverOnScrollChangedListenerC0297Kc = new ViewTreeObserverOnScrollChangedListenerC0297Kc(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0297Kc.f3928o).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0297Kc.r1(viewTreeObserver2);
        }
        this.f5883t = AbstractC0266Ec.f4899e;
        this.f5887x = new A4(this.f5881r.getContext(), this.f5881r);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized InterfaceC1812a B(String str) {
        return new BinderC1813b(G1(str));
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized void C2(View view, String str) {
        if (!this.f5877B) {
            if (view == null) {
                this.f5880q.remove(str);
                return;
            }
            this.f5880q.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.internal.play_billing.B.g0(this.f5885v)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void D2(InterfaceC1024p7 interfaceC1024p7) {
        if (!this.f5877B) {
            this.f5876A = true;
            this.f5888z = interfaceC1024p7;
            C1427yi c1427yi = this.f5886w;
            if (c1427yi != null) {
                c1427yi.f11430C.b(interfaceC1024p7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void F0(BinderC1813b binderC1813b, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized View G1(String str) {
        WeakReference weakReference;
        if (!this.f5877B && (weakReference = (WeakReference) this.f5880q.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void H0(InterfaceC1812a interfaceC1812a) {
        onTouch(this.f5881r, (MotionEvent) BinderC1813b.C2(interfaceC1812a));
    }

    public final synchronized void K3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f5882s.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f5882s.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e4) {
                        Y9.t("Encountered invalid base64 watermark.", e4);
                    }
                }
            }
            this.f5882s.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void L3() {
        this.f5883t.execute(new D3(26, this));
    }

    public final synchronized void M3() {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.J9)).booleanValue() || this.f5886w.s() == 0) {
            return;
        }
        this.f5878C = new GestureDetector(this.f5881r.getContext(), new Li(this.f5886w, this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void P2(String str, InterfaceC1812a interfaceC1812a) {
        C2((View) BinderC1813b.C2(interfaceC1812a), str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void V1(InterfaceC1812a interfaceC1812a) {
        this.f5886w.j((View) BinderC1813b.C2(interfaceC1812a));
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final /* synthetic */ View d() {
        return this.f5881r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void e() {
        try {
            if (this.f5877B) {
                return;
            }
            C1427yi c1427yi = this.f5886w;
            if (c1427yi != null) {
                c1427yi.l(this);
                this.f5886w = null;
            }
            this.f5880q.clear();
            this.f5881r.removeAllViews();
            this.f5882s.removeAllViews();
            this.f5880q = null;
            this.f5881r = null;
            this.f5882s = null;
            this.f5884u = null;
            this.f5887x = null;
            this.f5877B = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final FrameLayout f() {
        return this.f5882s;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final A4 g() {
        return this.f5887x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void h3(InterfaceC1812a interfaceC1812a) {
        if (this.f5877B) {
            return;
        }
        Object C22 = BinderC1813b.C2(interfaceC1812a);
        if (!(C22 instanceof C1427yi)) {
            Y9.s("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C1427yi c1427yi = this.f5886w;
        if (c1427yi != null) {
            c1427yi.l(this);
        }
        L3();
        C1427yi c1427yi2 = (C1427yi) C22;
        this.f5886w = c1427yi2;
        c1427yi2.k(this);
        this.f5886w.g(this.f5881r);
        C1427yi c1427yi3 = this.f5886w;
        FrameLayout frameLayout = this.f5882s;
        Pq S4 = c1427yi3.f11435k.S();
        if (c1427yi3.f11438n.c() && S4 != null && frameLayout != null) {
            N1.n.f1204A.f1224v.getClass();
            C0347Uc.s(new RunnableC0532dm(S4, frameLayout, 0));
        }
        if (this.f5876A) {
            this.f5886w.f11430C.b(this.f5888z);
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10284s3)).booleanValue() && !TextUtils.isEmpty(this.f5886w.f11438n.b())) {
            K3(this.f5886w.f11438n.b());
        }
        M3();
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final InterfaceC1812a j() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized String k() {
        return this.f5879p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final synchronized void k2(InterfaceC1812a interfaceC1812a) {
        if (this.f5877B) {
            return;
        }
        this.y = interfaceC1812a;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map l() {
        return this.f5880q;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized JSONObject n() {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi == null) {
            return null;
        }
        return c1427yi.z(this.f5881r, l(), q());
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized JSONObject o() {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi == null) {
            return null;
        }
        return c1427yi.A(this.f5881r, l(), q());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi == null || !c1427yi.m()) {
            return;
        }
        this.f5886w.B();
        this.f5886w.c(view, this.f5881r, l(), q(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi != null) {
            FrameLayout frameLayout = this.f5881r;
            c1427yi.b(frameLayout, l(), q(), C1427yi.n(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi != null) {
            FrameLayout frameLayout = this.f5881r;
            c1427yi.b(frameLayout, l(), q(), C1427yi.n(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C1427yi c1427yi = this.f5886w;
        if (c1427yi != null) {
            c1427yi.h(view, motionEvent, this.f5881r);
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.J9)).booleanValue() && this.f5878C != null && this.f5886w.s() != 0) {
                this.f5878C.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map q() {
        return this.f5880q;
    }
}
