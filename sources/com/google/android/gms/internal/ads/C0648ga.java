package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Collections;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648ga extends C1510e1 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f8803A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC0308Md f8804B;

    /* renamed from: C, reason: collision with root package name */
    public final Activity f8805C;

    /* renamed from: D, reason: collision with root package name */
    public C0887m f8806D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f8807E;

    /* renamed from: F, reason: collision with root package name */
    public LinearLayout f8808F;

    /* renamed from: G, reason: collision with root package name */
    public final C1384xi f8809G;

    /* renamed from: H, reason: collision with root package name */
    public PopupWindow f8810H;

    /* renamed from: I, reason: collision with root package name */
    public RelativeLayout f8811I;

    /* renamed from: J, reason: collision with root package name */
    public ViewGroup f8812J;

    /* renamed from: s, reason: collision with root package name */
    public String f8813s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8814t;

    /* renamed from: u, reason: collision with root package name */
    public int f8815u;

    /* renamed from: v, reason: collision with root package name */
    public int f8816v;

    /* renamed from: w, reason: collision with root package name */
    public int f8817w;

    /* renamed from: x, reason: collision with root package name */
    public int f8818x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f8819z;

    static {
        r.f fVar = new r.f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(fVar);
    }

    public C0648ga(C0348Ud c0348Ud, C1384xi c1384xi) {
        super((Object) c0348Ud, (Object) "resize", 19, false);
        this.f8813s = "top-right";
        this.f8814t = true;
        this.f8815u = 0;
        this.f8816v = 0;
        this.f8817w = -1;
        this.f8818x = 0;
        this.y = 0;
        this.f8819z = -1;
        this.f8803A = new Object();
        this.f8804B = c0348Ud;
        this.f8805C = c0348Ud.g();
        this.f8809G = c1384xi;
    }

    public final void K(boolean z4) {
        synchronized (this.f8803A) {
            try {
                PopupWindow popupWindow = this.f8810H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.f8811I.removeView((View) this.f8804B);
                    ViewGroup viewGroup = this.f8812J;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f8807E);
                        this.f8812J.addView((View) this.f8804B);
                        this.f8804B.p0(this.f8806D);
                    }
                    if (z4) {
                        J("default");
                        C1384xi c1384xi = this.f8809G;
                        if (c1384xi != null) {
                            ((Nj) c1384xi.f11290p).c.n1(BF.f4059H);
                        }
                    }
                    this.f8810H = null;
                    this.f8811I = null;
                    this.f8812J = null;
                    this.f8808F = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
