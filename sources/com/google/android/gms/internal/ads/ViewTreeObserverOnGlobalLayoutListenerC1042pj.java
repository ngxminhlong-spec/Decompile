package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1042pj extends AbstractBinderC1149s4 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, D8 {

    /* renamed from: o, reason: collision with root package name */
    public View f10029o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0089t0 f10030p;

    /* renamed from: q, reason: collision with root package name */
    public C1427yi f10031q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10032r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10033s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.pj] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.s4, com.google.android.gms.internal.ads.F8] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        Ai ai;
        InterfaceC0089t0 interfaceC0089t0 = null;
        r4 = null;
        r4 = null;
        InterfaceC1024p7 a4 = null;
        F8 f8 = null;
        if (i4 == 3) {
            h2.y.d("#008 Must be called on the main UI thread.");
            if (this.f10032r) {
                Y9.p("getVideoController: Instream ad should not be used after destroyed");
            } else {
                interfaceC0089t0 = this.f10030p;
            }
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, interfaceC0089t0);
        } else if (i4 == 4) {
            h2.y.d("#008 Must be called on the main UI thread.");
            M3();
            C1427yi c1427yi = this.f10031q;
            if (c1427yi != null) {
                c1427yi.x();
            }
            this.f10031q = null;
            this.f10029o = null;
            this.f10030p = null;
            this.f10032r = true;
            parcel2.writeNoException();
        } else if (i4 == 5) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                f8 = queryLocalInterface instanceof F8 ? (F8) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 0);
            }
            AbstractC1192t4.b(parcel);
            K3(G12, f8);
            parcel2.writeNoException();
        } else if (i4 == 6) {
            InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            h2.y.d("#008 Must be called on the main UI thread.");
            K3(G13, new AbstractBinderC1149s4("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i4 != 7) {
                return false;
            }
            h2.y.d("#008 Must be called on the main UI thread.");
            if (this.f10032r) {
                Y9.p("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C1427yi c1427yi2 = this.f10031q;
                if (c1427yi2 != null && (ai = c1427yi2.f11430C) != null) {
                    a4 = ai.a();
                }
            }
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, a4);
        }
        return true;
    }

    public final void K3(InterfaceC1812a interfaceC1812a, F8 f8) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        h2.y.d("#008 Must be called on the main UI thread.");
        if (this.f10032r) {
            Y9.p("Instream ad can not be shown after destroy().");
            try {
                f8.A(2);
                return;
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
                return;
            }
        }
        View view = this.f10029o;
        if (view == null || this.f10030p == null) {
            Y9.p("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                f8.A(0);
                return;
            } catch (RemoteException e5) {
                Y9.u("#007 Could not call remote method.", e5);
                return;
            }
        }
        if (this.f10033s) {
            Y9.p("Instream ad should not be used again.");
            try {
                f8.A(1);
                return;
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
                return;
            }
        }
        this.f10033s = true;
        M3();
        ((ViewGroup) BinderC1813b.C2(interfaceC1812a)).addView(this.f10029o, new ViewGroup.LayoutParams(-1, -1));
        C1016p c1016p = N1.n.f1204A.f1227z;
        ViewTreeObserverOnGlobalLayoutListenerC0292Jc viewTreeObserverOnGlobalLayoutListenerC0292Jc = new ViewTreeObserverOnGlobalLayoutListenerC0292Jc(this.f10029o, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0292Jc.f3928o).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC0292Jc.r1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC0297Kc viewTreeObserverOnScrollChangedListenerC0297Kc = new ViewTreeObserverOnScrollChangedListenerC0297Kc(this.f10029o, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0297Kc.f3928o).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC0297Kc.r1(viewTreeObserver3);
        }
        L3();
        try {
            f8.d();
        } catch (RemoteException e7) {
            Y9.u("#007 Could not call remote method.", e7);
        }
    }

    public final void L3() {
        View view;
        C1427yi c1427yi = this.f10031q;
        if (c1427yi == null || (view = this.f10029o) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c1427yi.b(view, map, map, C1427yi.n(view));
    }

    public final void M3() {
        View view = this.f10029o;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10029o);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        L3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L3();
    }
}
