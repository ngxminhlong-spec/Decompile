package com.google.android.gms.internal.ads;

import android.os.Parcel;
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
public final class Ii extends AbstractBinderC1149s4 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Ui {

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f5701o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f5702p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f5703q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f5704r;

    /* renamed from: s, reason: collision with root package name */
    public C1427yi f5705s;

    /* renamed from: t, reason: collision with root package name */
    public final A4 f5706t;

    public Ii(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f5702p = new HashMap();
        this.f5703q = new HashMap();
        this.f5704r = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C1016p c1016p = N1.n.f1204A.f1227z;
        ViewTreeObserverOnGlobalLayoutListenerC0292Jc viewTreeObserverOnGlobalLayoutListenerC0292Jc = new ViewTreeObserverOnGlobalLayoutListenerC0292Jc(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0292Jc.f3928o).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0292Jc.r1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0297Kc viewTreeObserverOnScrollChangedListenerC0297Kc = new ViewTreeObserverOnScrollChangedListenerC0297Kc(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0297Kc.f3928o).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0297Kc.r1(viewTreeObserver2);
        }
        this.f5701o = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f5702p.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f5704r.putAll(this.f5702p);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f5703q.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f5704r.putAll(this.f5703q);
        this.f5706t = new A4(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized void C2(View view, String str) {
        this.f5704r.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f5702p.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized View G1(String str) {
        WeakReference weakReference = (WeakReference) this.f5704r.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            K3(G12);
        } else if (i4 == 2) {
            i();
        } else {
            if (i4 != 3) {
                return false;
            }
            InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            synchronized (this) {
                try {
                    if (this.f5705s != null) {
                        Object C22 = BinderC1813b.C2(G13);
                        if (!(C22 instanceof View)) {
                            Y9.s("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        this.f5705s.j((View) C22);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void K3(InterfaceC1812a interfaceC1812a) {
        Object C22 = BinderC1813b.C2(interfaceC1812a);
        if (!(C22 instanceof C1427yi)) {
            Y9.s("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.l(this);
        }
        C1427yi c1427yi2 = (C1427yi) C22;
        if (!c1427yi2.f11438n.d()) {
            Y9.p("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f5705s = c1427yi2;
        c1427yi2.k(this);
        this.f5705s.g(d());
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final View d() {
        return (View) this.f5701o.get();
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final FrameLayout f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final A4 g() {
        return this.f5706t;
    }

    public final synchronized void i() {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.l(this);
            this.f5705s = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized InterfaceC1812a j() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized String k() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map l() {
        return this.f5704r;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map m() {
        return this.f5703q;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized JSONObject n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized JSONObject o() {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi == null) {
            return null;
        }
        return c1427yi.A(d(), l(), q());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.c(view, d(), l(), q(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.b(d(), l(), q(), C1427yi.n(d()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.b(d(), l(), q(), C1427yi.n(d()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C1427yi c1427yi = this.f5705s;
        if (c1427yi != null) {
            c1427yi.h(view, motionEvent, d());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Ui
    public final synchronized Map q() {
        return this.f5702p;
    }
}
